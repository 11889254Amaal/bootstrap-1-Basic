package com.example.demo.Repositories;

import com.example.demo.Models.Students;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsInterface extends CrudRepository <Students,Integer>{
}
