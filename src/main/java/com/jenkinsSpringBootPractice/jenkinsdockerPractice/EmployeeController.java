package com.jenkinsSpringBootPractice.jenkinsdockerPractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/getData")
    public String name(){
        return "hi iam nothing";
    }
}
