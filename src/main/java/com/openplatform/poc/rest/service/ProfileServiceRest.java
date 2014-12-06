package com.openplatform.poc.rest.service;

import com.google.inject.Inject;
import com.openplatform.poc.rest.dto.Profile;
import com.openplatform.poc.service.ProfileServiceClient;
import com.openplatform.poc.service.dto.ProfileDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.UUID;

/**
 * @author Maksym Khudiakov
 */
@Path("/profile")
public class ProfileServiceRest {

    private ProfileServiceClient service;

    @GET
    @Path("/{userId}")
    @Produces("application/json")
    public Profile getByUserId(@PathParam("userId") String userId)
    {
        ProfileDTO dto = service.getByUser(UUID.randomUUID());

        // Create response
        Profile profile = new Profile();
        profile.setPictureUri(dto.getPictureUri());
        profile.setUserId(dto.getUserId().toString());

        return profile;
    }

    @Inject
    public void setService(ProfileServiceClient service) {
        this.service = service;
    }
}
