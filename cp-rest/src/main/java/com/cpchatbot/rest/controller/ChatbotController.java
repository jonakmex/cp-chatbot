package com.cpchatbot.rest.controller;

import com.chatfuel.port.request.Request;
import com.chatfuel.port.response.*;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
        Message m = new Message();
        m.attachment = new Attachment();
        m.attachment.type="template";
        m.attachment.payload = new ButtonPayload();
        m.attachment.payload.buttons = new ArrayList<>();
        m.attachment.payload.buttons.add(new BlockButton("Restart",Arrays.asList("BLOCK_SAMLPE")));
        m.text = "Welcome "+request.firstName+ " "+request.lastName;
        response.messages = Arrays.asList(m);
        return response;
    }
}
