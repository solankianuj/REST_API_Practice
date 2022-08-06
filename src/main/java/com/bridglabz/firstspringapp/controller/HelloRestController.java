package com.bridglabz.firstspringapp.controller;

import com.bridglabz.firstspringapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @PutMapping("/put/{fName}")
    public String sayHello(@PathVariable String fName,@RequestParam(value = "lName") String lName){
        return "Hello  "+fName+" "+lName+" !";
    }


}
