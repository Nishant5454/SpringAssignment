package com.example.SpringProblems;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apis {
    @GetMapping("/hello")// get the response from server
    public String hello(){
        return "Hello User";
    }
    @GetMapping("/greet")
    public String getUser(@RequestParam(name="name")String name){
      {
            return "Hello" + name;
        }
    }
}
