package com.example.l1_20206331.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/principal")
public class HomeController {

    @GetMapping(value = "/")
    public String principal(){
        return "index";
    }
}
