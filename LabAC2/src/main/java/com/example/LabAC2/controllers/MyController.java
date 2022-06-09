package com.example.LabAC2.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Slf4j
@Controller
@RequestMapping("home")
public class MyController {
    @RequestMapping({"/login"}) // either type '/' or index
    public  String showlogin(){
        return "inboxpage";
    }
    @RequestMapping("/")
    public String simplemethod(){
        //mapped to hostname:port/home/
return "inboxpage";

    }
    @RequestMapping("/index")
    public String showindex(){
        //mapped to hostname:port/home/index/
        log.info("hello");
        return "inboxpage";

    }
}
