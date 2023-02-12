package com.example.demo.Repositories;

import com.example.demo.Models.School;
import com.example.demo.Models.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolInterface extends CrudRepository<School,Integer> {
    @Query("select s from School s")
    List<School> getAllSchool();

    @Query("select s from School s where s.id=:schoolId")
    School getSchoolBy(@Param("schoolId") Integer id);

    @Query("select s from School s where s.name=:schoolName")
    School getSchoolByName(@Param("schoolName") String name);


    




}
