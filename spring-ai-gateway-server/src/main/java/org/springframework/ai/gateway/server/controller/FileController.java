package org.springframework.ai.gateway.server.controller;

import org.springframework.ai.gateway.server.client.NestedImageClient;
import org.springframework.ai.image.ImageClient;
import org.springframework.ai.image.ImageMessage;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class FileController {

    private final NestedImageClient nestedImageClient;

    @Autowired
    public FileController(ObjectProvider<ImageClient> imageClientProvider) {
        this.nestedImageClient = new NestedImageClient(imageClientProvider.orderedStream().toList());
    }

    /**
     * Returns the contents of the specified file.
     * https://platform.openai.com/docs/api-reference/files/retrieve-contents
     * @param request The file to upload.
     * @return
     */
    @PostMapping("/v1/files")
    public ApiRecord.FileResponseData generations(@RequestPart ApiRecord.FileUploadRequest request) {
        return nestedImageClient.call(null);
    }

    /**
     * Returns the contents of the specified file.
     * https://platform.openai.com/docs/api-reference/files/retrieve-contents
     * @param fileId The ID of the file to retrieve.
     * @return
     */
    @GetMapping("/v1/files/{file_id}/content")
    public ImageResponse generations(@PathVariable(value = "file_id") String fileId) {
        return nestedImageClient.call(null);
    }

    /**
     * Returns the contents of the specified file.
     * https://platform.openai.com/docs/api-reference/files/retrieve-contents
     * @param fileId The ID of the file to retrieve.
     * @return
     */
    @GetMapping("/v1/files/{file_id}/content")
    public ImageResponse generations(@PathVariable(value = "file_id") String fileId) {
        return nestedImageClient.call(null);
    }

    /**
     * Retrieve file content
     * Returns the contents of the specified file.
     * https://platform.openai.com/docs/api-reference/files/retrieve-contents
     * @param fileId The ID of the file to retrieve.
     * @return
     */
    @GetMapping("/v1/files/{file_id}/content")
    public ImageResponse generations(@PathVariable(value = "file_id") String fileId) {
        return nestedImageClient.call(null);
    }

}
