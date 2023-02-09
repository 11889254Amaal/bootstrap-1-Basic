package com.example.demo.Models;

import jdk.jfr.DataAmount;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
//@Table(name = "dbo.Students")
public class Students {
    @Column(name = "firstName")
    String firstName;

    @Column(name = "LastName")
    String LastName;
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    Integer  id;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getLastName() {
        return LastName;
    }

    int Age;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
