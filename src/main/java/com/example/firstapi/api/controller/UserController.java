package com.example.firstapi.api.controller;

import com.example.firstapi.api.model.UserTo;
import com.example.firstapi.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping("/user")
    public UserTo getUser(@RequestParam int id){
        return userService.getUser(id);
    }
}
