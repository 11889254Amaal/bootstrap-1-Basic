package com.example.demo.Repositories;

import com.example.demo.Models.Mark;
import com.example.demo.Models.School;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarkInterface extends CrudRepository<Mark,Integer> {
    @Query("select s from Mark s")
    List<Mark> getAllMark();

    @Query("select s from Mark s where s.id=:MarkId")
    Mark getMarkBy(@Param("MarkId") Integer id);



}
