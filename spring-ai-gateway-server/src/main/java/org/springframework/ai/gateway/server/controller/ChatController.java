package org.springframework.ai.gateway.server.controller;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.Generation;
import org.springframework.ai.chat.StreamingChatClient;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.gateway.server.client.NestedChatClient;
import org.springframework.ai.gateway.server.client.NestedStreamingChatClient;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;

@RestController
public class ChatController {

    private final NestedChatClient chatClient;

    private final NestedStreamingChatClient streamingChatClient;

    @Autowired
    public ChatController(ObjectProvider<ChatClient> chatClientProvider,
                          ObjectProvider<StreamingChatClient> streamingChatClientProvider) {
        this.chatClient = new NestedChatClient(chatClientProvider.orderedStream().toList());
        this.streamingChatClient = new NestedStreamingChatClient(streamingChatClientProvider.orderedStream().toList());
    }

    @GetMapping("/v1/generate")
    public Map generate(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
        return Map.of("generation", chatClient.call(message));
    }

    @GetMapping("/v1/prompt")
    public List<Generation> prompt(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
        PromptTemplate promptTemplate = new PromptTemplate("Tell me a {adjective} joke about {topic}");
        Prompt prompt = promptTemplate.create(Map.of("adjective", "funny", "topic", "cats"));
        return chatClient.call(prompt).getResults();
    }

    @GetMapping("/v1/chat/completions")
    public Flux<ChatResponse> chatCompletions(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
        Prompt prompt = new Prompt(new UserMessage(message));
        return streamingChatClient.stream(prompt);
    }

}
