package org.springframework.ai.gateway.server.controller;

import org.springframework.ai.embedding.EmbeddingClient;
import org.springframework.ai.gateway.server.client.NestedEmbeddingClient;
import org.springframework.ai.huaweiai.pangu.HuaweiAiPanguEmbeddingClient;
import org.springframework.ai.image.ImageClient;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EmbeddingController {

    private final NestedEmbeddingClient embeddingClient;

    @Autowired
    public EmbeddingController(ObjectProvider<EmbeddingClient> embeddingClientProvider) {
        this.embeddingClient = new NestedEmbeddingClient(embeddingClientProvider.orderedStream().toList());
    }

    @GetMapping("/ai/embedding")
    public Map embedding(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
        return Map.of("embeddings", embeddingClient.embed(message));
    }

}
