package com.example.demo.Repositories;

import com.example.demo.Models.School;
import com.example.demo.Models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsInterface extends CrudRepository <Student,Integer>{

    @Query("select s from Student s inner join School sc on s.id=sc.id where sc.name=:schoolName")
    Student getStudentBySchoolID(@Param("schoolName") String name);



        @Query(value = "SELECT st from Student st " +
                "WHERE st.school.id = :id ")
        List<Student> getStudentsBySchoolId(@Param("id") Integer id);


    @Query("select s from Student s where s.id=:studentId")
    School getStudentBy(@Param("studentId") Integer id);

    @Query("select s from Student s")
    List<School> getAllStudent();
}
