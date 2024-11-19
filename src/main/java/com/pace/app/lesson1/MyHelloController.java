package com.pace.app.lesson1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyHelloController {
    // read application.properties
    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String port;

    @GetMapping("/app-info")
    public String getAppInfo() {
      return "App " + appName + " is running on port: " + port + ".";
  }

    // GET with no param
    @GetMapping("/hello")
    public String hello(){
      return "Hello World.";
    }

  
    // Get mapping with query parameters using @RequestParam
	  // e.g. localhost:8080/greet?name=Tony&role=inventor
    @GetMapping("/greet")
    public String greet(
      @RequestParam(defaultValue="name-unknown") String name,
       @RequestParam(defaultValue="role-unknown") String role
       ) {
        return new String("Hello " + name + ". You are a " + role + ".");
    }
    
    // path variables
    @GetMapping("/users/{id}")
    public String getUser(@PathVariable int id) {
        return new String("User ID: " + id);
    }



    
}
