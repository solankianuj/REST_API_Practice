package com.bridglabz.firstspringapp.controller;

import com.bridglabz.firstspringapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @PostMapping("/post")
    public String sayHelllo(@RequestBody User user)
    {
        return "Hello  "+user.getfName()+" "+user.getlName()+" !";
    }


}
