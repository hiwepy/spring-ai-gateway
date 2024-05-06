package org.springframework.ai.gateway.server.controller;

import org.springframework.ai.gateway.server.client.NestedEmbeddingClient;
import org.springframework.ai.gateway.server.client.NestedImageClient;
import org.springframework.ai.image.ImageClient;
import org.springframework.ai.image.ImageMessage;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ImageController {

    private final NestedImageClient nestedImageClient;

    @Autowired
    public ImageController(ObjectProvider<ImageClient> imageClientProvider) {
        this.nestedImageClient = new NestedImageClient(imageClientProvider.orderedStream().toList());
    }

    @PostMapping("/v1/images/generations")
    public ImageResponse generations(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
        ImagePrompt request = new ImagePrompt(message);
        List<ImageMessage> messages = List.of(new ImageMessage(message));
        return nestedImageClient.call(null);
    }

}
