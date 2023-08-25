package com.esmabeydili.controller;

import com.esmabeydili.dto.User;
import com.esmabeydili.service.UserService;
import com.esmabeydili.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "/api")
public class UserController {

     @Autowired
     private UserService userService;

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable("userId") Long userId){
        return null;
    }
}

