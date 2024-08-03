package com.example.springtest.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.springtest.flows.HelloWebRestService;

@Component
public class RestResourceMainConfig extends ResourceConfig {
    public RestResourceMainConfig(){
        System.out.println("Registering Rest Configuration...");
        register(HelloWebRestService.class);
    }
}
