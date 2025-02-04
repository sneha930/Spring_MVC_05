package com.lcwd.mvc.SpringMvcProject.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// @Component with this annotation, Springboot container managing bean of this class
//@Component
//we can't directly map method of the class, we have to map this class also using @RequestMapping annotation along with @Component
// Here the classes who are accepting the request are called as a controllers, so here inspite of using (@Component and @RequestMapping) together, we can simply use @Controller annotation
//@RequestMapping("/project")

// so always use a @Controller to make a Controller
@Controller
public class SuperMan {

    @RequestMapping("/about")
    public String aboutRequestHandler() {
        System.out.println("Processing about request");
        return "about";
    }

    @RequestMapping("/services")
    public String serviceRequestHandler() {
        System.out.println("Processing service request");
        return "services";
    }
}
