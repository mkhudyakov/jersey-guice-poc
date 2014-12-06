package com.openplatform.poc.service.impl;

import com.google.inject.Singleton;
import com.openplatform.poc.service.ProfileServiceClient;
import com.openplatform.poc.service.dto.ProfileDTO;

import java.util.UUID;

/**
 * @author Maksym Khudiakov
 */
@Singleton
public class ProfileServiceClientImpl implements ProfileServiceClient {

    @Override
    public ProfileDTO getByUser(UUID userId)
    {
        ProfileDTO profile = new ProfileDTO();
        profile.setUserId(UUID.randomUUID());
        profile.setPictureUri("http://.../picure.png");

        return profile;
    }
}
