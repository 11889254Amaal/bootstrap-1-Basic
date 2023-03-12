package com.example.demo.Controllers;

import com.example.demo.Models.Course;
import com.example.demo.Models.School;
import com.example.demo.Services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "Course")
public class CourseControllers {

    @Autowired
    CourseServices courseServices;

    @RequestMapping(value="Course/getAllCourse1", method = RequestMethod.GET)
    public List<Course> getAllCourse(){

        List<Course> course = new ArrayList<>();
        course=courseServices.getAllCourse();
        return course;
    }

    @RequestMapping(value="Course/GetById", method = RequestMethod.GET)
    public Course getCourseById(@RequestParam Integer CourseId){
        Course course1= courseServices.getCourseById(CourseId);
        return course1;
    }

    @RequestMapping(value = "Course/getAllCourseByIsActive")
    public List<Course> getAllActiveSchools() {
        List<Course> activeCoursesList = courseServices.getAllActiveSchools();
        return activeCoursesList;
    }

    @RequestMapping(value = "Course/getAllCourseByIsInActive")
    public List<Course> getAllInActive(){
        List<Course> InactiveCoursesList = courseServices.getAllInActive();
        return InactiveCoursesList;
    }

    @RequestMapping(value = "/getLatestRow", method = RequestMethod.GET)
    public Course getLatestRow() {
        return courseServices.getLatestRow();


    }

    @RequestMapping(value = "/getLatestUpdated", method = RequestMethod.GET)
    public Course getLatestUpdated() {
        Course course = courseServices.getLatestUpdated();
        return course;
    }

}
