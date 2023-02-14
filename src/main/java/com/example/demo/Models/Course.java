package com.example.demo.Models;

import javax.persistence.*;
import java.util.List;
@Entity
public class Course extends BaseEntity {
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


    @Column(name = "CourseName")
    String name;



    @ManyToOne
    @JoinColumn(name = "student_id ",referencedColumnName = "id")
    Student student;

}
