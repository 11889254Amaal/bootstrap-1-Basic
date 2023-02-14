package com.example.demo.Controllers;

import com.example.demo.Models.School;
import com.example.demo.Services.SchoolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "school")
public class SchoolControllers {
    @Autowired
    SchoolServices schoolServices;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<School> getAllSchool() {

        List<School> schools = new ArrayList<>();
        schools = schoolServices.getAllSchool();
        return schools;
    }


    @RequestMapping(value = "school/GetById", method = RequestMethod.GET)
    public School getSchoolById(@RequestParam Integer schoolId) {
        School school = schoolServices.getSchoolById(schoolId);
        return school;
    }


    @RequestMapping(value = "School/getAllSchoolByIsActive")
    public List<School> getAllActiveSchools() {
        List<School> activeSchoolsList = schoolServices.getAllActiveSchools();
        return activeSchoolsList;
    }

    @RequestMapping(value = "School/getAllSchoolByIsInActive")
    public List<School> getAllInActive(){
        List<School> InactiveSchoolsList = schoolServices.getAllInActive();
        return InactiveSchoolsList;
    }

    @RequestMapping(value = "school/GetLatestRow()", method = RequestMethod.GET)
    public  List<School> getLatestRow() {
        return schoolServices.getLatestRow();

    }

}
