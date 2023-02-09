package com.example.demo.Services;

import com.example.demo.Models.Student;
import com.example.demo.Repositories.StudentsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuentsServices {
    @Autowired
    StudentsInterface studentsInterface;


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

}
