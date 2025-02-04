package com.lcwd.mvc.SpringMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// jab aapko view nahi bhejna ho aur api(json, data) banani ho to  @RestController(@Controller+@ResponseBody) use kare otherwise @Controller
@RestController //(@Controller+@ResponseBody)
@RequestMapping("/api")
public class ApiController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloApi() {
        return "Hello, how are you";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET )
    public List<String> getUserData() {
        return Arrays.asList("Sneha", "Gouri", "Priya");
    }

    @RequestMapping(value = "/create-user", method = RequestMethod.POST)
    public String createUser() {
        System.out.println("Creating User");
        return "User created";
    }

}
