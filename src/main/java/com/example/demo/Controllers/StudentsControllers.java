package com.example.demo.Controllers;

import com.example.demo.Models.School;
import com.example.demo.Services.StuentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "Student")
public class StudentsControllers {

    @Autowired
    StuentsServices stuentsServices;

    @GetMapping(value = "/addStudent()")
    public void addStudent(){
        stuentsServices.addStudents();
        stuentsServices.addStudents();
    }
    @GetMapping(value = "deletebyId")
    public void deletebyId(@RequestParam Integer id){
        stuentsServices.deleteStudentById(id);
    }


    @RequestMapping(value = "/GetById", method = RequestMethod.GET)
    public School getStudentById(@RequestParam Integer studentId) {
        School student = StuentsServices.getStudentById(studentId);
        return student;
    }

    public List<School> getAllStudent() {

        List<School> students = new ArrayList<>();
        students  = stuentsServices.getAllStudent();
        return students;
    }
}
