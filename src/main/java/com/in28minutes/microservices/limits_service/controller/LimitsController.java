package com.in28minutes.microservices.limits_service.controller;


import com.in28minutes.microservices.limits_service.config.Configuration;
import com.in28minutes.microservices.limits_service.model.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LimitsController {

    private final Configuration configuration;

    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
    @GetMapping("/hello")
    public String demo(){
        return "This is demo app deploy";
    }


}
