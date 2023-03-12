package com.example.demo.Services;

import com.example.demo.Models.Course;
import com.example.demo.Models.School;
import com.example.demo.Repositories.CourseInterface;
import com.example.demo.Repositories.MarkInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.error.Mark;

import java.util.List;

@Service
public class CourseServices {
    @Autowired
    CourseInterface courseInterface;

    public List<Course> getAllCourse() {
        return  courseInterface.getAllCourse();

    }

    public Course getCourseById(Integer id) {
        Course course=courseInterface.getCourseBy(id);
        return course;
    }

    public List<Course> getAllActiveSchools(){

        return courseInterface.getAllActiveSchools();
    }

    public List<Course> getAllInActive(){

        return courseInterface.getAllInActive();
    }
    public Course getLatestRow(){
        return courseInterface.getLatestRow();

    }

    public Course getLatestUpdated(){
        return courseInterface.getLatestUpdated();

    }
}
