package com.lcwd.mvc.SpringMvcProject.controllers;

import com.lcwd.mvc.SpringMvcProject.models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {


    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody List<Student> students) {

        System.out.println("Student list size:" +students.size());
        System.out.println(students);

//        String str = null;
//        System.out.println(str.length());
        Student student = students.get(0);

        ResponseEntity<Student> response = new ResponseEntity<>(student, HttpStatus.CREATED);

//        another way
//        ResponseEntity<Student> response = ResponseEntity.status(HttpStatus.OK).body(student);

        return response;

//        Map<String, Object> data = new HashMap<>();
//        data.put("content", students);
//        data.put("error", "No error found");
//        data.put("current data", new Date());
//        data.put("System Information", System.getProperties());

//        return data;
    }
}
