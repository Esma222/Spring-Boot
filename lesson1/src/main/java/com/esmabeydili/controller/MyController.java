package com.esmabeydili.controller;

import com.esmabeydili.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class MyController {

    @GetMapping("/header")
    public String getHeader(@RequestHeader("MyHeader") String myHeader){
       return "your header is :"+ myHeader;
    }

    @PostMapping("/userSave")
    public User saveUser(@RequestBody User user){
        System.out.println("User savedd!");
        user.setPassword("");
        return user;
    }

    @PostMapping("/userSaveAll")
    public List<User> saveAllUser(@RequestBody List<User> users){
        System.out.println("All user savedd!");
        users.forEach(user -> user.setPassword(""));
        return users;
    }

   @GetMapping({"/message1","/message1/{message}"})
    public String getMyMessageWithVariable(@PathVariable(name = "message",required = false) String message){
        return "your variable message is : "+ message;
    }

    @GetMapping(path="/message2")
    public String getMyMessageWithParam(@RequestParam(name = "message",required = false,defaultValue = "my default message with param") String message){
        return "your param message is : "+ message;
    }
}
