package org.springframework.ai.gateway.server.client;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;

import java.util.List;

public class NestedChatClient implements ChatClient {

    private List<ChatClient> chatClients;

    public NestedChatClient(List<ChatClient> chatClients) {
        this.chatClients = chatClients;
    }

    @Override
    public ChatResponse call(Prompt prompt) {
        return null;
    }

}
