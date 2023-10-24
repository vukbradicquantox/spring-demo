package com.quantox.springdemo.model;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;
    @Column(name = "index_num")
    private String indexNum;

    Student() {}

    public Student(int id, String name, String indexNum) {
        this.id = id;
        this.name = name;
        this.indexNum = indexNum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(String indexNum) {
        this.indexNum = indexNum;
    }
}
