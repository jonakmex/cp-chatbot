package com.cpchatbot.rest.controller;

import com.cpchatbot.rest.model.Message;
import com.cpchatbot.rest.model.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@RestController
public class ChatbotController {

    @PostMapping(path = "hello")
    public Response helloWorld(@RequestBody Map<String, ?> input){
        Response response = new Response();
        Message m= new Message();
        m.text = "You Are "+input.get("first name");
        response.messages = Arrays.asList(m);
        return response;
    }
}
