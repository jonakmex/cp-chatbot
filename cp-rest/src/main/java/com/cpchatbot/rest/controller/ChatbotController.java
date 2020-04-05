package com.cpchatbot.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatbotController {

    @PostMapping(path = "hello")
    public String helloWorld(){
        return "Hello World";
    }
}
