package com.example.demo.Models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
public class School extends BaseEntity {
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


    //I change this concepts because that effect table in database so using object relatinal mapping
    //so go to student class and create school object

//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }
//    @OneToMany
//    @JoinColumn(referencedColumnName = "id")
//   // List<Student> students;

}
