package org.springframework.ai.gateway.server.controller;

import org.springframework.ai.embedding.EmbeddingClient;
import org.springframework.ai.embedding.EmbeddingRequest;
import org.springframework.ai.embedding.EmbeddingResponse;
import org.springframework.ai.gateway.server.client.NestedEmbeddingClient;
import org.springframework.ai.huaweiai.pangu.HuaweiAiPanguEmbeddingClient;
import org.springframework.ai.image.ImageClient;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

@RestController
public class EmbeddingController {

    private final NestedEmbeddingClient embeddingClient;

    @Autowired
    public EmbeddingController(ObjectProvider<EmbeddingClient> embeddingClientProvider) {
        this.embeddingClient = new NestedEmbeddingClient(embeddingClientProvider.orderedStream().toList());
    }

    @PostMapping("/v1/embeddings")
    public EmbeddingResponse embeddings(@RequestBody ApiRecord.EmbeddingRequest request) {
        EmbeddingRequest embeddingRequest = new EmbeddingRequest(Arrays.asList(request.input()), null);
        EmbeddingResponse embeddingResponse = embeddingClient.call(embeddingRequest);
        return embeddingResponse;
    }

}
