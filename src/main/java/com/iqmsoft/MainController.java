package com.iqmsoft;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping(value = "/")
    public String landing(){
        return "Spring Boot Gradle Wrapper Example";
    }
    
    @RequestMapping(value = "/test")
    public String hello(){
        return "Spring Boot Gradle Wrapper Test";
    }
}
