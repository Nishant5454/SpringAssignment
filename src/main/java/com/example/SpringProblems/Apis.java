package com.example.SpringProblems;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apis {
    @GetMapping("/hello")// get the response from server
    public String hello(){
        return "Hello User";
    }
    @GetMapping("/greet")// get the response according to the query parameter
    public String getUser(@RequestParam(name="name")String name){
      {
            return "Hello" + name;
        }
    }
    @GetMapping("/hello/{params}")
    public String getUserbyparams(@PathVariable String params){
        return "Hello "+params;
    }



}
