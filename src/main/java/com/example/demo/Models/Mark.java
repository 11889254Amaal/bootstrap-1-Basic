package com.example.demo.Models;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
public class Mark extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getObtaineMarks() {
        return obtaineMark;
    }

    public void setObtaineMarks(Integer obtaineMark) {
        this.obtaineMark = obtaineMark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    @Column(name = "ObtainedMarks")
    Integer obtaineMark;
    @Column(name = "Grade")
    String grade;


    @ManyToOne
    @JoinColumn(name = "Course_id ",referencedColumnName = "id")
    Course course;
}
