package com.example.demo.Repositories;

import com.example.demo.Models.School;
import com.example.demo.Models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
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

    @Query(value = "SELECT s from Student s where s.isActive = true")
    List<Student> getAllActiveStudents();

    @Query(value = "SELECT s from Student s where s.isActive = false ")
    List<Student>  getAllInActive();

    @Query(value = "SELECT s from Student s where s.id=(SELECT max(s.id) from Student s)")
    Student getLatestRow();

    @Query(value = "SELECT s from Student s where s.updateDate=(SELECT max(s.updateDate) from Student s )")
    Student  getLatestUpdated();

    @Query(value = "SELECT s from Student s where s.createdDate>:DateInput")
    Student  getStudentsCreatedAfterDate(@Param("DateInput") Date created_date);

    @Query("select s from Student s where s.firstName=:studentsName")
    Student getStudentsByName(@Param("studentsName") String name);

    @Query("select s from Student s where s.Age=:Age")
    Student getStudentsByRollNumber(@Param("Age") String Age);

    @Query("select s from Student s where s.id=:studentsId")
    Student getStudentsBy(@Param("studentsId") Integer id);

    @Query(value = "SELECT s from Student s where s.createdDate>:DateInput")
    Student  getStudentsByCreatedDate(@Param("DateInput") Date created_date);

    @Query(value = "SELECT s from School s where s.updateDate=:DateInput")
    Student  getSchoolByUpdatedDateUserInput(@Param("DateInput") Date update_date);

    @Query("update Student s set s.isActive=false ")
    Student deleteAllStudent();

    @Query("update Student s set s.isActive=false WHERE S.id=:ID")
    Student deleteSchoolById(@Param("ID") Integer ID);

    @Query(value = "update   Student s set s.isActive=false where s.createdDate>:DateInput")
    Student  deleteAllStudentCreatedAfterDate(@Param("DateInput") Date created_date);


    @Query(value = "update   Student s set s.isActive=false where s.firstName=:StudentName")
    Student deleteByStudentName(@Param("schoolName") String firstName);

    @Query(value = "update Student s set s.isActive=false where s.createdDate=:DateInput")
    Student  deleteStudentByCreatedDate(@Param("DateInput") Date created_date);

    @Query(value = "update Student s set s.isActive=false where s.updateDate=:DateInput")
    Student  deleteStudentByUpdateDate(@Param("DateInput") Date updateDate);


}
