package com.lcwd.mvc.SpringMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// you can use @RequestMapping on class level also
@RequestMapping("/admin")
public class AdminController {

    // use /admin/login
    @RequestMapping("/login")
    public String ShowLoginPageHandler() {
        return "login";
    }
}
