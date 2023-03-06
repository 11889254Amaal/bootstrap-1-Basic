package com.example.demo.Services;

import com.example.demo.Controllers.StudentsControllers;
import com.example.demo.Models.School;
import com.example.demo.Models.Student;
import com.example.demo.Repositories.SchoolInterface;
import com.example.demo.Repositories.StudentsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class StuentsServices {
    @Autowired
    static
    StudentsInterface studentsInterface;
    @Autowired
    SchoolInterface schoolInterface;

    public void addStudents(){
        Student student =new Student();
        student.setFirstName("ali");
        student.setLastName("aljasria");
        student.setAge(30);
        studentsInterface.save(student);
    }

    public String deleteStudentById(Integer id){
        Student studentToDelete =studentsInterface.findById(id).get();
        studentsInterface.delete(studentToDelete);
        return "Student deleted";
    }

    public List<Student> getStudentsBySchoolName(String schoolName){
        School school = schoolInterface.getSchoolByName(schoolName);

        Integer schoolId = school.getId();
        List<Student> studentList = studentsInterface.getStudentsBySchoolId(schoolId);
        return studentList;
    }

    public static School getStudentById(Integer id) {
        School student=studentsInterface.getStudentBy(id);
        return student;
    }
    public List<School> getAllStudent() {
        return  studentsInterface.getAllStudent();

    }

    public List<Student> getAllActiveStudents(){

        return studentsInterface.getAllActiveStudents();
    }

    public List<Student> getAllInActive(){

        return studentsInterface.getAllInActive();
    }

    public Student getLatestRow(){
        return studentsInterface.getLatestRow();

    }
    public  Student getLatestUpdated(){
        return studentsInterface.getLatestUpdated();

    }
    public Student getStudentCreatedAfterDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringToDateFormat = formatter.parse(date);
        Student students=studentsInterface.getStudentsCreatedAfterDate(convertedDateFromStringToDateFormat);
        return students;
    }
    public Student getStudentsByName(String name) {
        Student student= studentsInterface.getStudentsByName(name);
        return student;
    }

    public Student getStudentsByRollNumber(Integer rollNumber) {
        Student student= studentsInterface.getStudentsByRollNumber(String.valueOf(rollNumber));
        return student;
    }

    public Student getStudentsById(Integer id) {
        Student student=studentsInterface.getStudentsBy(id);
        return student;
    }

    public Student getStudentsByCreatedDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringToDateFormat = formatter.parse(date);
        Student student=studentsInterface.getStudentsByCreatedDate(convertedDateFromStringToDateFormat);
        return student;
    }

    public Student getStudentsByUpdatedDateUserInput(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringToDateFormat = formatter.parse(date);
        Student student=studentsInterface.getSchoolByUpdatedDateUserInput(convertedDateFromStringToDateFormat);
        return student;
    }
    public Student deleteAllStudents() {
        Student student=studentsInterface.deleteAllStudent();
        return student;
    }
    public Student deleteStudentsById(Integer id) {
        Student student=studentsInterface.deleteSchoolById(id);
        return student;
    }

    public Student deleteAllStudentCrEATEDaFTERdATE(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringToDateFormat = formatter.parse(date);
        Student student=studentsInterface.deleteAllStudentCreatedAfterDate(convertedDateFromStringToDateFormat);
        return student;
    }

    public Student deleteStudentByName(String name) {
        Student student=studentsInterface.deleteByStudentName(name);
        return student;
    }

    public Student DeleteStudentByCreatedDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringToDateFormat = formatter.parse(date);
        Student student=studentsInterface.deleteStudentByCreatedDate(convertedDateFromStringToDateFormat);
        return student;
    }

    public Student DeleteSchoolByUpadteDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringToDateFormat = formatter.parse(date);
        Student student=studentsInterface.deleteStudentByUpdateDate(convertedDateFromStringToDateFormat);
        return student;
    }



}
