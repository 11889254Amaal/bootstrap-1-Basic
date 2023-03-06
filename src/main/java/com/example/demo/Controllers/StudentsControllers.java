package com.example.demo.Controllers;

import com.example.demo.Models.School;
import com.example.demo.Models.Student;
import com.example.demo.Services.SchoolServices;
import com.example.demo.Services.StuentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "Student")
public class StudentsControllers {

    @Autowired
    StuentsServices stuentsServices;

    @GetMapping(value = "/addStudent()")
    public void addStudent(){
        stuentsServices.addStudents();
        stuentsServices.addStudents();
    }
    @GetMapping(value = "deletebyId")
    public void deletebyId(@RequestParam Integer id){
        stuentsServices.deleteStudentById(id);
    }


    @RequestMapping(value = "/GetById", method = RequestMethod.GET)
    public School getStudentById(@RequestParam Integer studentId) {
        School student = StuentsServices.getStudentById(studentId);
        return student;
    }

    public List<School> getAllStudent() {

        List<School> students = new ArrayList<>();
        students  = stuentsServices.getAllStudent();
        return students;
    }

    @RequestMapping(value = "Students/getAllStudentByIsActive")
    public List<Student> getAllActiveStudents() {
        List<Student> activeStudentsList = stuentsServices.getAllActiveStudents();
        return activeStudentsList;
    }

    @RequestMapping(value = "Students/getAllStudentsByIsInActive")
    public List<Student> getAllInActive(){
        List<Student> InactiveStudentsList = stuentsServices.getAllInActive();
        return InactiveStudentsList;
    }

    @RequestMapping(value = "/getLatestRow", method = RequestMethod.GET)
    public Student getLatestRow() {
        return stuentsServices.getLatestRow();


    }

    @RequestMapping(value = "/getLatestUpdated", method = RequestMethod.GET)
    public Student getLatestUpdated() {
        Student student = stuentsServices.getLatestUpdated();
        return student;
    }

    @RequestMapping(value = "/GetStudentsCreatedAfterDate", method = RequestMethod.GET)
    public Student  getStudentsCreatedAfterDate(@RequestParam String  dateInput) throws ParseException {
        Student student = stuentsServices.getStudentCreatedAfterDate(dateInput);
        return student;
    }

    @RequestMapping(value = "students/GetByStudentsName", method = RequestMethod.GET)
    public Student getStudentsBySchoolName(@RequestParam String studentsName) {
        Student student = stuentsServices.getStudentsByName(studentsName);
        return student;
    }

    @RequestMapping(value = "students/GetByStudentsByRollNumber", method = RequestMethod.GET)
    public Student getByStudentsByRollNumber(@RequestParam Integer rollNumber) {
        Student student = stuentsServices.getStudentsByRollNumber(rollNumber);
        return student;
    }

    @RequestMapping(value = "/GetById", method = RequestMethod.GET)
    public Student getStudentsById(@RequestParam Integer studentsId) {
        Student student = stuentsServices.getStudentsById(studentsId);
        return student;
    }

    @RequestMapping(value = "/GetStudentsByCreatedDate", method = RequestMethod.GET)
    public Student  getSchoolByCreatedDate(@RequestParam String  dateInput) throws ParseException {
        Student student = stuentsServices.getStudentsByCreatedDate(dateInput);
        return student;
    }
    @RequestMapping(value = "/GetStudentsByUpdateDate", method = RequestMethod.GET)
    public Student  getSchoolByUpdatedDateUserInput(@RequestParam String  dateInput) throws ParseException {
        Student student = stuentsServices.getStudentsByUpdatedDateUserInput(dateInput);
        return student;
    }

    @RequestMapping(value = "/DeleteById", method = RequestMethod.POST)
    public Student  deleteSchoolById(@RequestParam Integer schoolId) {

        Student student = stuentsServices.deleteStudentsById(schoolId);
        return student;
    }

    @RequestMapping(value = "/DeleteALL", method = RequestMethod.POST)
    public Student deleteAll() {
        Student student = stuentsServices.deleteAllStudents();
        return student;
    }

    @RequestMapping(value = "/DeleteAllStudentCreatedAfterDate", method = RequestMethod.POST)
    public Student  deleteAllStudentCrEATEDaFTERdATE(@RequestParam String  dateInput) throws ParseException {
        Student student = stuentsServices.deleteAllStudentCrEATEDaFTERdATE(dateInput);
        return student;
    }
    @RequestMapping(value = "/DeleteByName", method = RequestMethod.POST)
    public Student deleteByName(@RequestParam String studentName) {
        Student student = stuentsServices.deleteStudentByName(studentName);
        return student;
    }



    @RequestMapping(value = "/DeleteStudentByCreatedDate", method = RequestMethod.GET)
    public Student DeleteSchoolByCreatedDate(@RequestParam String  dateInput) throws ParseException {
        Student student = stuentsServices.DeleteStudentByCreatedDate(dateInput);
        return student;
    }

    @RequestMapping(value = "/DeleteStudentByUpdatedDate", method = RequestMethod.GET)
    public Student DeleteSchoolByUpdatedDate(@RequestParam String  dateInput) throws ParseException {
        Student student = stuentsServices.DeleteSchoolByUpadteDate(dateInput);
        return student;
    }
}
