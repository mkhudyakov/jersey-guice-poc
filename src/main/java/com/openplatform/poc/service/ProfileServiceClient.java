package com.openplatform.poc.service;

import com.openplatform.poc.service.dto.ProfileDTO;

import java.util.UUID;

/**
 * @author Maksym Khudiakov
 */
public interface ProfileServiceClient {

    /**
     * Returns profile for specific user
     */
    public ProfileDTO getByUser(UUID userId);
}
