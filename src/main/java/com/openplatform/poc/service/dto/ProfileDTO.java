package com.openplatform.poc.service.dto;

import java.util.UUID;

/**
 * @author Maksym Khudiakov
 */
public class ProfileDTO {

    private UUID userId;
    private String pictureUri;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getPictureUri() {
        return pictureUri;
    }

    public void setPictureUri(String pictureUri) {
        this.pictureUri = pictureUri;
    }
}
