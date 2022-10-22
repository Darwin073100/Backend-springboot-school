package com.api.school.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "class_student")
public class ClassStudentModel {

    @EmbeddedId
    private ClassStudentModelPK id;
    @Column(name = "create_at")
    private LocalDate craetedAt;

    public ClassStudentModelPK getId() {
        return id;
    }

    public void setId(ClassStudentModelPK id) {
        this.id = id;
    }

    public LocalDate getCraetedAt() {
        return craetedAt;
    }

    public void setCraetedAt(LocalDate craetedAt) {
        this.craetedAt = craetedAt;
    }
}
