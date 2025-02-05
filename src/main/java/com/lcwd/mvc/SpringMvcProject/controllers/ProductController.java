package com.lcwd.mvc.SpringMvcProject.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/getProduct")
    public String getProduct(@RequestParam("productName") String name, @RequestParam(value = "productRating", defaultValue = "0", required = false) int rating, @RequestParam("productId") int id) {
        System.out.println("Product Name" +name);
        System.out.println("Product Id" + id);
        System.out.println("Product rating" +rating);
        return "This is testing product url";
    }

    // here we are expecting dynamic value here by pacing curly brackets ie. {productId}
    @RequestMapping("/checkProduct/{productId}/{productName}/{productRating}")
    public String checkProduct(
            @PathVariable("productId") int id,
            @PathVariable String productName,
            @PathVariable int productRating
    ) {
//        System.out.println("Product Name" + productName);
//        System.out.println("Product Id" + id);
//        System.out.println("Product rating" + productRating);

        logger.error("Product Name {} {}", productName, "testing");
        logger.warn("ProductId {}" , id);
        logger.info("Product rating {}", productRating);
        return "this is checking the concept of path variable";
    }
}
