package com.example.demo.Models;

import javax.persistence.*;
import java.util.List;
@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;
    @Column(name = "SchoolName")
    String name;

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    @OneToMany
            @JoinColumn(referencedColumnName = "id")
    List<Student> students;
}
