package com.srikanth.actuator.controller;

import com.srikanth.actuator.dto.User;
import com.srikanth.actuator.dao.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDatabase database;

    @GetMapping("/loadUsers")
    public List<User>  getUsers(){
        return database.getAllUsers();
    }


}
