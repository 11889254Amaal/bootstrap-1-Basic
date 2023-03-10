package com.example.demo.Repositories;

import com.example.demo.Models.School;
import com.example.demo.Models.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface SchoolInterface extends CrudRepository<School,Integer> {
    @Query("select s from School s")
    List<School> getAllSchool();

    @Query("select s from School s where s.id=:schoolId")
    School getSchoolBy(@Param("schoolId") Integer id);


    @Query("select s from School s where s.name=:schoolName")
    School getSchoolByName(@Param("schoolName") String name);

    @Query(value = "SELECT s from School s where s.isActive = true")
    List<School> getAllActiveSchools();


    @Query(value = "SELECT s from School s where s.isActive = false ")
    List<School>  getAllInActive();



    @Query(value = "SELECT s from School s where s.id=(SELECT max(s.id) from School s)")
    School getLatestRow();

    @Query(value = "SELECT s from School s where s.updateDate=(SELECT max(s.updateDate) from School s )")
    School  getLatestUpdated();

    @Query("update School s set s.isActive=false where s.id=:schoolId")
    School deleteSchoolById(@Param("schoolId") Integer id);

    @Query(value = "SELECT s from School s where s.createdDate>:DateInput")
    School  getSchoolCreatedAfterDate(@Param("DateInput") Date created_date);

    @Query(value = "SELECT s from School s where s.createdDate=:DateInput")
    School  getSchoolByCreatedDateUserInput(@Param("DateInput") Date created_date);


    @Query(value = "SELECT s from School s where s.updateDate=:DateInput")
    School  getSchoolByUpdatedDateUserInput(@Param("DateInput") Date update_date);

    @Query("update School s set s.isActive=false")
    School deleteAllSchool();

    @Query(value = "update   School s set s.isActive=false where s.createdDate>:DateInput")
    School  deleteAllSchoolCreatedAfterDate(@Param("DateInput") Date created_date);


    @Query(value = "update   School s set s.isActive=false where s.name=:schoolName")
    School deleteBySchoolName(@Param("schoolName") String name);

    @Query(value = "update School s set s.isActive=false where s.createdDate=:DateInput")
    School  deleteSchoolByCreatedDate(@Param("DateInput") Date created_date);

    @Query(value = "update School s set s.isActive=false where s.updateDate=:DateInput")
    School  deleteSchoolByUpdateDate(@Param("DateInput") Date updateDate);

}
