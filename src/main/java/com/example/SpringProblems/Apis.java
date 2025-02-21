package com.example.SpringProblems;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
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
    @GetMapping("/hello/{params}")// Get the Get Response according to the params
    public String getUserbyparams(@PathVariable String params){
        return "Hello "+params;
    }
    @PostMapping("/create")
    public String postname(@RequestBody userDTO user){
        return "Hello "+user.getFirstname()+" " +""+user.getLastname()+" from Bridge Labz";
    }
    @PutMapping("/put/{firstname}")
    public String putname(@PathVariable String firstname,@RequestParam(name="lastname")String lastname){
        return "Hello "+firstname+" "+lastname+" from BridgeLabz";
    }





}
