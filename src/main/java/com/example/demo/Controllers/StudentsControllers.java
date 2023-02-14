package com.example.demo.Controllers;

import com.example.demo.Services.StuentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}