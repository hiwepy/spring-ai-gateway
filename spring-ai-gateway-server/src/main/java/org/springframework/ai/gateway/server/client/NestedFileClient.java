package org.springframework.ai.gateway.server.client;

import org.springframework.ai.image.ImageClient;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;

import java.util.List;

public class NestedFileClient implements ImageClient {

    private List<FileClient> fileClients;

    public NestedFileClient(List<FileClient> fileClients) {
        this.fileClients = fileClients;
    }

    @Override
    public ImageResponse call(ImagePrompt request) {
        return null;
    }

}
