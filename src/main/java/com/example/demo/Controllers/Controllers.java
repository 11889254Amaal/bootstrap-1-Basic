package com.example.demo.Controllers;

import com.example.demo.Services.StuentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping(value = "/addStudent()")
    public void addStudent(){
        studentService.addStudents();
        studentService.addStudents();
    }
    @GetMapping(value = "deletebyId")
    public void deletebyId(@RequestParam Integer id){
        studentService.deleteStudentById(id);
    }
}
