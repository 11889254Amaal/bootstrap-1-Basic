package com.example.demo.Services;

import com.example.demo.Models.Mark;
import com.example.demo.Repositories.MarkInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkServices {
    @Autowired
    MarkInterface markInterface;

    public List<Mark> getAllMark() {
        return  markInterface.getAllMark();

    }
}
