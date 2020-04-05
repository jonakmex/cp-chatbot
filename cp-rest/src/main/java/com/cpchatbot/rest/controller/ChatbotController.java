package com.cpchatbot.rest.controller;

import com.cpchatbot.rest.model.Message;
import com.cpchatbot.rest.model.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class ChatbotController {

    @PostMapping(path = "hello")
    public Response helloWorld(){
        Response response = new Response();
        Message m= new Message();
        m.text = "Hello World";
        response.messages = Arrays.asList(m);
        return response;
    }
}
