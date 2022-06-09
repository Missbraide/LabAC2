package com.example.LabAC2.AC3controller;

import com.example.LabAC2.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Usercontroller {

    @PostMapping("/users")
    public void printDate(@RequestBody User user){
        System.out.println("Printing the user data: "+user);

    }
}
