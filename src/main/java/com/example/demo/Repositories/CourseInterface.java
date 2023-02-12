package com.example.demo.Repositories;

import com.example.demo.Models.Course;
import com.example.demo.Models.Mark;
import com.example.demo.Models.School;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseInterface extends CrudRepository<Course,Integer> {

    @Query("select s from Course s")
    List<Course> getAllCourse();


    @Query("select s from Course s where s.id=:CourseId")
    Course getCourseBy(@Param("CourseId") Integer id);


}
