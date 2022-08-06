package com.bridglabz.firstspringapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @GetMapping("/p/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello "+name+ " From BridgeLabz"+"!";
    }


}
