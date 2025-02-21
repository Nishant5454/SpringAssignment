package com.example.SpringProblems;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetApi {
    @GetMapping("/hello")// get the response from server
    public String hello(){
        return "Hello User";
    }
}
