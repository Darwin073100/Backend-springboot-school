create table "class"(
	"id" serial not null,
	"name" varchar(250) not null,
	"credits" bigint not null,
	constraint pk_class_is primary key("id") 
);

create table "career"(
	"id" serial not null,
	"name" varchar(250) not null,
	"ages" bigint not null,
	"code" bigint not null,
	constraint pk_career_id primary key("id")
);
create table "user"(
	"id" serial not null,
	"password" varchar(10) not null,
	"user_name" varchar(50) not null,
	"email" varchar(250) not null,
	constraint pk_user_id primary key("id") 
);

create table "student"(
	"id" serial not null,
	"name" varchar(100) not null,
	"sur_name" varchar(250) not null,
	"age" bigint null,
	"image" text null,
	"semester" bigint not null,
	"sex" char(2)not null,
	"career_id" serial not null,
	"user_id" serial not null,
	constraint pk_student_id primary key("id"),
	constraint fk_student_career_id foreign key ("career_id") references "career"("id")
	ON DELETE CASCADE
	ON UPDATE SET NULL,
	constraint fk_student_user_id foreign key ("user_id") references "user"("id")
	ON DELETE CASCADE
	ON UPDATE SET NULL
);

create table "class_student"(
	"id" serial not null,
	"class_id" serial not null,
	"student_id" serial not null,
	constraint pk_class_student_id primary key("id"),
	constraint fk_class_student_student_id foreign key ("student_id") references "student"("id")
	ON DELETE CASCADE
	ON UPDATE SET NULL,
	constraint fk_class_student_class_id foreign key ("class_id") references "class"("id")
	ON DELETE CASCADE
	ON UPDATE SET NULL
);