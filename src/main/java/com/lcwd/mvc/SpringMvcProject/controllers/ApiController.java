package com.lcwd.mvc.SpringMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

// jab aapko view nahi bhejna ho aur api(json, data) banani ho to to @RestController(@Controller+@ResponseBody) use kare otherwise @Controller
@Controller
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/hello")
    // @ResponseBody this annotation indicated that ye data bound ho jayega response body ke saath (ie. we are not sending html file here, we are directly passing data in response body)
    @ResponseBody
    // again here, we have alternative for (@RequestMapping and @ResponseBody) ie. RestController
    // jab hum @Controller annotation use krte hai to springboot smjht hai ki hum .html file banane wale hai, to jab hum @RestController use krte hai to @Controller ke sath apne aap @ResponseBody bhi add ho jati hai
    public String helloApi() {
        return "Hello, how are you";
    }

    @RequestMapping("/users")
    @ResponseBody
    public List<String> getUserData() {
        return Arrays.asList("Sneha", "Gouri", "Priya");
    }

}
