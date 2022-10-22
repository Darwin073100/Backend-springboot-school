package com.api.school.model;

import javax.persistence.*;

@Entity
@Table(name = "career")
public class CareerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer ages;
    private Integer code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAges() {
        return ages;
    }

    public void setAges(Integer age) {
        this.ages = age;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
