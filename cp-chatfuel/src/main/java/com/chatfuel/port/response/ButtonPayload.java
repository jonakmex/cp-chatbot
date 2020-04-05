package com.chatfuel.port.response;

public class ButtonPayload extends Payload {
    public ButtonPayload() {
        this.template_type = "button";
        this.text = "Payload Text";
    }
}
