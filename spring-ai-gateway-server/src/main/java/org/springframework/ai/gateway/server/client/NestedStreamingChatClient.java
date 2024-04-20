package org.springframework.ai.gateway.server.client;

import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.StreamingChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import reactor.core.publisher.Flux;

import java.util.List;

public class NestedStreamingChatClient implements StreamingChatClient {

    private List<StreamingChatClient> streamingChatClients;

    public NestedStreamingChatClient(List<StreamingChatClient> streamingChatClients) {
        this.streamingChatClients = streamingChatClients;
    }

    @Override
    public Flux<ChatResponse> stream(Prompt prompt) {
        return null;
    }

}
