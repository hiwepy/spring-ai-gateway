package org.springframework.ai.gateway.server.client;

import org.springframework.ai.document.Document;
import org.springframework.ai.embedding.EmbeddingClient;
import org.springframework.ai.embedding.EmbeddingRequest;
import org.springframework.ai.embedding.EmbeddingResponse;

import java.util.List;

public class NestedEmbeddingClient implements EmbeddingClient {

    private List<EmbeddingClient> embeddingClients;

    public NestedEmbeddingClient(List<EmbeddingClient> embeddingClients) {
        this.embeddingClients = embeddingClients;
    }

    @Override
    public EmbeddingResponse call(EmbeddingRequest request) {
        return null;
    }

    @Override
    public List<Double> embed(Document document) {
        return null;
    }

}
