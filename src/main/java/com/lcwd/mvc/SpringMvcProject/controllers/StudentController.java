package com.lcwd.mvc.SpringMvcProject.controllers;

import com.lcwd.mvc.SpringMvcProject.models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {


    @PostMapping("/create")
    // here @RequestBody will help us to get the data that has passed in post request body will get converted in Map(json serializing)
    // json -> java object ==>(deserialization)
//    java object -> json ==> (Serialization)
    // deserialization is automatic(jackson library)

    //not good way
//    public String createStudent(@RequestBody Map<String, Object> data) {

//    correct way: Custom type(Create custom model student)
        public Student createStudent(@RequestBody Student student) {
        // we have to create student
        // we are receiving data in json format
//        System.out.println(data);

//        Object id= data.get("id");
//        Object title= data.get("title");
//        System.out.println("Id: " +id);
//        System.out.println("Title: " +title);

        System.out.println(student);

//        if there was List of students:
//        public String createStudent(@RequestBody List<Student> students) {

//        return "created";
        return student;
    }
}
