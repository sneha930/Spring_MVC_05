package com.lcwd.mvc.SpringMvcProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/getProduct")
    public String getProduct(@RequestParam("productName") String name, @RequestParam(value = "productRating", defaultValue = "0", required = false) int rating, @RequestParam("productId") int id) {
        System.out.println("Product Name" +name);
        System.out.println("Product Id" + id);
        System.out.println("Product rating" +rating);
        return "This is testing product url";
    }
}
