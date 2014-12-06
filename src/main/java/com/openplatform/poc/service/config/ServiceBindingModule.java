package com.openplatform.poc.service.config;

import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import com.openplatform.poc.rest.service.ProfileServiceRest;
import com.openplatform.poc.service.ProfileServiceClient;
import com.openplatform.poc.service.impl.ProfileServiceClientImpl;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;

/**
 * @author Maksym Khudiakov
 */
public class ServiceBindingModule extends JerseyServletModule {

    @Override
    protected void configureServlets() {

        /* Bind the REST resources */
        bind(ProfileServiceRest.class);

        /* Bind jackson converters for JAXB/JSON serialization */
        bind(MessageBodyReader.class).to(JacksonJsonProvider.class);
        bind(MessageBodyWriter.class).to(JacksonJsonProvider.class);

        bind(ProfileServiceClient.class).to(ProfileServiceClientImpl.class);

        serve("/api/*").with(GuiceContainer.class);
    }
}
