package org.springframework.ai.gateway.server.client;

import org.springframework.ai.image.ImageClient;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;

import java.util.List;

public class NestedImageClient implements ImageClient {

    private List<ImageClient> imageClients;

    public NestedImageClient(List<ImageClient> imageClients) {
        this.imageClients = imageClients;
    }

    @Override
    public ImageResponse call(ImagePrompt request) {
        return null;
    }

}
