CREATE TABLE "class"(
	"id" SERIAL NOT NULL,
	"name" VARCHAR(250) NOT NULL,
	"credits" BIGINT NOT NULL,
	CONSTRAINT pk_class_is PRIMARY KEY("id")
);

CREATE TABLE "career"(
	"id" SERIAL NOT NULL,
	"name" VARCHAR(250) NOT NULL,
	"ages" BIGINT NOT NULL,
	"code" BIGINT NOT NULL,
	CONSTRAINT pk_career_id PRIMARY KEY("id")
);
CREATE TABLE "user"(
	"id" SERIAL NOT NULL,
	"password" VARCHAR(10) NOT NULL,
	"user_name" VARCHAR(50) NOT NULL,
	"email" VARCHAR(250) NOT NULL,
	CONSTRAINT pk_user_id PRIMARY KEY("id")
);

CREATE TABLE "student"(
	"id" SERIAL NOT NULL,
	"name" VARCHAR(100) NOT NULL,
	"sur_name" VARCHAR(250) NOT NULL,
	"age" BIGINT null,
	"image" TEXT null,
	"semester" BIGINT NOT NULL,
	"sex" CHAR(2)NOT NULL,
	"career_id" SERIAL NOT NULL,
	"user_id" SERIAL NOT NULL,
	CONSTRAINT pk_student_id PRIMARY KEY("id"),
	CONSTRAINT fk_student_career_id FOREIGN KEY ("career_id") REFERENCES "career"("id")
	ON DELETE CASCADE
	ON UPDATE SET NULL,
	CONSTRAINT fk_student_user_id FOREIGN KEY ("user_id") REFERENCES "user"("id")
	ON DELETE CASCADE
	ON UPDATE SET NULL
);

CREATE TABLE "class_student"(
	"class_id" SERIAL NOT NULL,
	"student_id" SERIAL NOT NULL,
	"created_at" TIMESTAMP NULL,
	PRIMARY KEY("class_id", "student_id"),
	CONSTRAINT fk_class_student_student_id FOREIGN KEY ("student_id") REFERENCES "student"("id")
	ON DELETE CASCADE
	ON UPDATE SET NULL,
	CONSTRAINT fk_class_student_class_id FOREIGN KEY ("class_id") REFERENCES "class"("id")
	ON DELETE CASCADE
	ON UPDATE SET NULL
);