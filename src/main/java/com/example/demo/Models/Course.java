package com.example.demo.Models;

import javax.persistence.*;
import java.util.List;
@Entity
public class Course {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

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

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }
    @Column(name = "CourseName")
    String name;

    @OneToMany
    @JoinColumn(referencedColumnName = "id")
    List<Mark> marks;

}
