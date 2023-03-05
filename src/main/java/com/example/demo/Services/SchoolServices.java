package com.example.demo.Services;

import com.example.demo.Models.School;
import com.example.demo.Repositories.SchoolInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SchoolServices {
    @Autowired
    SchoolInterface schoolInterface;

    public List<School> getAllSchool() {
        return  schoolInterface.getAllSchool();

    }

    public School getSchoolById(Integer id) {
        School school=schoolInterface.getSchoolBy(id);
        return school;
    }

    public School getSchoolByName(String name) {
        School school=schoolInterface.getSchoolByName(name);
        return school;
    }
    public List<School> getAllActiveSchools(){

        return schoolInterface.getAllActiveSchools();
    }

    public List<School> getAllInActive(){

        return schoolInterface.getAllInActive();
    }
    public School getLatestRow(){
       return schoolInterface.getLatestRow();

   }

    public School getLatestUpdated(){
        return schoolInterface.getLatestUpdated();

    }

    public School deleteSchoolById(Integer id) {
        School school=schoolInterface.deleteSchoolById(id);
        return school;
    }

    public void setCreatedDateByUserInput(String date, Integer id) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringToDateFormat = formatter.parse(date);
        School school = schoolInterface.getSchoolBy(id);
        school.setCreatedDate(convertedDateFromStringToDateFormat);
        schoolInterface.save(school);
    }

    public School getSchoolCreatedAfterDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringToDateFormat = formatter.parse(date);
      School school=schoolInterface.getSchoolCreatedAfterDate(convertedDateFromStringToDateFormat);
      return school;
    }

    public School getSchoolByCreatedDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringToDateFormat = formatter.parse(date);
        School school=schoolInterface.getSchoolByCreatedDateUserInput(convertedDateFromStringToDateFormat);
        return school;
    }

    public School getSchoolByUpdatedDateUserInput(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringToDateFormat = formatter.parse(date);
        School school=schoolInterface.getSchoolByUpdatedDateUserInput(convertedDateFromStringToDateFormat);
        return school;
    }

    public School deleteAllSchool() {
        School school=schoolInterface.deleteAllSchool();
        return school;
    }

    public School deleteAllSchoolCrEATEDaFTERdATE(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringToDateFormat = formatter.parse(date);
        School school=schoolInterface.deleteAllSchoolCreatedAfterDate(convertedDateFromStringToDateFormat);
        return school;
    }

    public School deleteSchoolByName(String name) {
        School school=schoolInterface.deleteBySchoolName(name);
        return school;
    }
    public School DeleteSchoolByCreatedDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringToDateFormat = formatter.parse(date);
        School school=schoolInterface.deleteSchoolByCreatedDate(convertedDateFromStringToDateFormat);
        return school;
    }

    public School DeleteSchoolByUpadteDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringToDateFormat = formatter.parse(date);
        School school=schoolInterface.deleteSchoolByUpdateDate(convertedDateFromStringToDateFormat);
        return school;
    }

}
