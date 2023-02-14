package com.example.demo.Controllers;

import com.example.demo.Models.Course;
import com.example.demo.Models.Mark;
import com.example.demo.Models.School;
import com.example.demo.Models.Student;
import com.example.demo.Services.CourseServices;
import com.example.demo.Services.MarkServices;
import com.example.demo.Services.SchoolServices;
import com.example.demo.Services.StuentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controllers {

    @GetMapping(value = "FULLNAME")
    public String FULLNAME(String firstName,String lastName){
        firstName="amaal";
        lastName="aljasria";
        return firstName+" "+lastName;
    }

//    @GetMapping(value = "/")
//    public String hello(){
//        return "hello";
//    }


    @Autowired
    StuentsServices studentService;

    @Autowired
    SchoolServices SchoolServices;

    @Autowired
    CourseServices  CourseServices;

    @Autowired
    MarkServices MarkServices;


    @RequestMapping(value = "student/getStudentsBySchoolName", method = RequestMethod.GET)
    public List<Student> getStudentsBySchoolName(@RequestParam String schoolName) {

        return studentService.getStudentsBySchoolName(schoolName);

    }


}
