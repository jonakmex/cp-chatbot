package com.chatfuel.port.response;

import java.util.List;

public class Response {
    public List<Message> messages;

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
