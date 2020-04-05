package com.chatfuel.port.response;

import java.util.List;

public class BlockButton extends Button {
    public List<String> block_names;

    public List<String> getBlock_names() {
        return block_names;
    }

    public void setBlock_names(List<String> block_names) {
        this.block_names = block_names;
    }
}
