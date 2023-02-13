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
    @GetMapping(value = "/addStudent()")
    public void addStudent(){
        studentService.addStudents();
        studentService.addStudents();
    }
    @GetMapping(value = "deletebyId")
    public void deletebyId(@RequestParam Integer id){
        studentService.deleteStudentById(id);
    }


    @RequestMapping(value="school/getAll", method = RequestMethod.GET)

    public List<School> getAllSchool(){

        List<School> schools = new ArrayList<>();
        schools=SchoolServices.getAllSchool();
        return schools;
    }

    @RequestMapping(value="Course/getAllCourse1", method = RequestMethod.GET)
    public List<Course> getAllCourse(){

        List<Course> course = new ArrayList<>();
        course=CourseServices.getAllCourse();
        return course;
    }

    @RequestMapping(value="Mark/getAllMark1", method = RequestMethod.GET)
    public List<Mark> getAllMark(){

        List mark = new ArrayList<>();
        mark= MarkServices.getAllMark();
        return mark;
    }

    @RequestMapping(value="school/GetById", method = RequestMethod.GET)
    public School getSchoolById(@RequestParam Integer schoolId){
        School school= SchoolServices.getSchoolById(schoolId);
        return school;
    }

    @RequestMapping(value="Course/GetById", method = RequestMethod.GET)
    public Course getCourseById(@RequestParam Integer CourseId){
        Course course1= CourseServices.getCourseById(CourseId);
        return course1;
    }

    @RequestMapping(value="Mark/GetById", method = RequestMethod.GET)
    public Mark getMarkById(@RequestParam Integer MarkId){
        Mark mark= MarkServices.getMarkById(MarkId);
        return mark;
    }

    @RequestMapping(value = "student/getStudentsBySchoolName", method = RequestMethod.GET)
    public List<Student> getStudentsBySchoolName(@RequestParam String schoolName) {

        return studentService.getStudentsBySchoolName(schoolName);

    }


}
