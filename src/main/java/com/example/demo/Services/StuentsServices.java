package com.example.demo.Services;

import com.example.demo.Models.Students;
import com.example.demo.Repositories.StudentsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuentsServices {
    @Autowired
    StudentsInterface studentsInterface;


    public void addStudents(){
        Students students=new Students();
        students.setFirstName("ali");
        students.setLastName("aljasria");
        students.setAge(30);
        studentsInterface.save(students);
    }

    public String deleteStudentById(Integer id){
        Students StudentsToDelete=studentsInterface.findById(id).get();
        studentsInterface.delete(StudentsToDelete);
        return "Student deleted";
    }

}
