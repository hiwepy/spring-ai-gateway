package org.springframework.ai.gateway.server.client;

import org.springframework.ai.gateway.server.controller.ApiRecord;

public interface FileClient {

    /**
     * Upload a file that can be used across various endpoints.
     * @param request
     * @return
     */
    ApiRecord.FileResponseData call(ApiRecord.FileUploadRequest request);

    /**
     * Returns a list of files that belong to the user's organization.
     * @param request
     * @return
     */
    ApiRecord.FileListResponse call(ApiRecord.FileListRequest request);

    /**
     * Returns a list of files that belong to the user's organization.
     * @param request
     * @return
     */
    ApiRecord.FileListResponse call(ApiRecord.FileListRequest request);

    /**
     * Returns a list of files that belong to the user's organization.
     * @param request
     * @return
     */
    ApiRecord.FileListResponse call(ApiRecord.FileListRequest request);

    /**
     * Retrieve file content
     * @param request
     * @return
     */
    ApiRecord.FileListResponse call(ApiRecord.FileListRequest request);

}
