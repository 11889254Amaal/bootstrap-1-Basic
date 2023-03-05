package com.example.demo.Controllers;

import com.example.demo.Models.School;
import com.example.demo.RequestObject.SchoolRequestForCreateDateUpdate;
import com.example.demo.Services.SchoolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "school")
public class SchoolControllers {
    @Autowired
    SchoolServices schoolServices;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<School> getAllSchool() {

        List<School> schools = new ArrayList<>();
        schools = schoolServices.getAllSchool();
        return schools;
    }


    @RequestMapping(value = "/GetById", method = RequestMethod.GET)
    public School getSchoolById(@RequestParam Integer schoolId) {
        School school = schoolServices.getSchoolById(schoolId);
        return school;
    }
    @RequestMapping(value = "school/GetBySchoolName", method = RequestMethod.GET)
    public School getSchoolBySchoolName(@RequestParam String schoolName) {
        School school = schoolServices.getSchoolByName(schoolName);
        return school;
    }

    @RequestMapping(value = "School/getAllSchoolByIsActive")
    public List<School> getAllActiveSchools() {
        List<School> activeSchoolsList = schoolServices.getAllActiveSchools();
        return activeSchoolsList;
    }

    @RequestMapping(value = "School/getAllSchoolByIsInActive")
    public List<School> getAllInActive(){
        List<School> InactiveSchoolsList = schoolServices.getAllInActive();
        return InactiveSchoolsList;
    }

    @RequestMapping(value = "/getLatestRow", method = RequestMethod.GET)
    public School getLatestRow() {
        return schoolServices.getLatestRow();


    }

    @RequestMapping(value = "/getLatestUpdated", method = RequestMethod.GET)
    public School getLatestUpdated() {
        School school = schoolServices.getLatestUpdated();
        return school;
    }

    @RequestMapping(value = "/DeleteById", method = RequestMethod.POST)
    public School  deleteSchoolById(@RequestParam Integer schoolId) {
        School school = schoolServices.deleteSchoolById(schoolId);
        return school;
    }

    @RequestMapping(value = "updateCreatedDateByUserInput")
    public void setCreatedDateByUserInput(@RequestBody  SchoolRequestForCreateDateUpdate data) throws ParseException {
        schoolServices.setCreatedDateByUserInput(data.getDate(), data.getId());

    }

    @RequestMapping(value = "/GetSchoolCreatedAfterDate", method = RequestMethod.GET)
      public School  getSchoolCreatedAfterDate(@RequestParam String  dateInput) throws ParseException {
        School school = schoolServices.getSchoolCreatedAfterDate(dateInput);
        return school;
    }

    @RequestMapping(value = "/GetSchoolByCreatedDate", method = RequestMethod.GET)
    public School  getSchoolByCreatedDate(@RequestParam String  dateInput) throws ParseException {
        School school = schoolServices.getSchoolByCreatedDate(dateInput);
        return school;
    }

    @RequestMapping(value = "/GetSchoolByUpdateDate", method = RequestMethod.GET)
    public School  getSchoolByUpdatedDateUserInput(@RequestParam String  dateInput) throws ParseException {
        School school = schoolServices.getSchoolByUpdatedDateUserInput(dateInput);
        return school;
    }

    @RequestMapping(value = "/DeleteALL", method = RequestMethod.POST)
    public School deleteAll() {
        School school = schoolServices.deleteAllSchool();
        return school;
    }

    @RequestMapping(value = "/DeleteAllSchoolCreatedAfterDate", method = RequestMethod.POST)
    public School  deleteAllSchoolCrEATEDaFTERdATE(@RequestParam String  dateInput) throws ParseException {
        School school = schoolServices.deleteAllSchoolCrEATEDaFTERdATE(dateInput);
        return school;
    }
    @RequestMapping(value = "/DeleteByName", method = RequestMethod.POST)
    public School deleteByName(@RequestParam String SchoolName) {
        School school = schoolServices.deleteSchoolByName(SchoolName);
        return school;
    }

    @RequestMapping(value = "/DeleteSchoolByCreatedDate", method = RequestMethod.GET)
    public School DeleteSchoolByCreatedDate(@RequestParam String  dateInput) throws ParseException {
        School school = schoolServices.DeleteSchoolByCreatedDate(dateInput);
        return school;
    }

    @RequestMapping(value = "/DeleteSchoolByUpdatedDate", method = RequestMethod.GET)
    public School DeleteSchoolByUpdatedDate(@RequestParam String  dateInput) throws ParseException {
        School school = schoolServices.DeleteSchoolByUpadteDate(dateInput);
        return school;
    }

}
