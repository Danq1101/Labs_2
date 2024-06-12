package org.example.web.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
@RequiredArgsConstructor
public class UserLoginController {

    @Autowired
    private UserService userService;

    @RequestMapping()
    public void getInfo(
            @RequestParam(name = "email") String email,
            @RequestParam(name = "phoneNumber") String phoneNumber,
            @RequestParam(name = "city") String city,
            @RequestParam(name = "password") String password
    ){}

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/logout")
    public String logout(){
        return "logout";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @GetMapping("/registration/new-user")
    public String addUser(User user){
        userService.createUser(user);
        return "registration";
    }

}
