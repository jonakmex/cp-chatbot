package com.cpchatbot.rest.controller;

import com.cpchatbot.rest.model.Message;
import com.cpchatbot.rest.model.Request;
import com.cpchatbot.rest.model.Response;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@RestController
public class ChatbotController {

    @Autowired
    private Mapper mapper;

    @PostMapping(path = "hello")
    public Response helloWorld(@RequestBody Map<String, ?> input){
        Request request = new Request();
        mapper.map(input,request);
        Response response = new Response();
        Message m= new Message();
        m.text = "Welcome "+request.firstName+ " "+request.lastName;
        response.messages = Arrays.asList(m);
        return response;
    }
}
