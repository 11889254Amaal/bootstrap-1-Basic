package com.example.demo.BusinessObject;

import com.example.demo.Models.BaseEntity;
import org.hibernate.annotations.Entity;

import javax.persistence.Column;

public class SchoolBusinessObject  {
    @Column(name = "SchoolName")
    String name;
}
