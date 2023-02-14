package com.example.demo.Controllers;

import com.example.demo.Models.Mark;
import com.example.demo.Services.MarkServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "Mark")
public class MarkControllers {
@Autowired
    MarkServices markServices;

    @RequestMapping(value="Mark/getAllMark1", method = RequestMethod.GET)
    public List<Mark> getAllMark(){

        List mark = new ArrayList<>();
        mark= markServices.getAllMark();
        return mark;
    }





    @RequestMapping(value="Mark/GetById", method = RequestMethod.GET)
    public Mark getMarkById(@RequestParam Integer MarkId){
        Mark mark= markServices
                .getMarkById(MarkId);
        return mark;
    }

}
