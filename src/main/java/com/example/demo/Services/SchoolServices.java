package com.example.demo.Services;

import com.example.demo.Models.School;
import com.example.demo.Repositories.SchoolInterface;
import com.example.demo.Repositories.StudentsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServices {
    @Autowired
    SchoolInterface schoolInterface;

    public List<School> getAllSchool() {
        return  schoolInterface.getAllSchool();

    }

    public School getSchoolById(Integer id) {
        School school=schoolInterface.getSchoolBy(id);
        return school;
    }

    public School getSchoolByName(String name) {
        School school=schoolInterface.getSchoolByName(name);
        return school;
    }
}
