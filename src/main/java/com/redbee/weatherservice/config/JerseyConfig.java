package com.redbee.weatherservice.config;

import com.redbee.weatherservice.web.BoardResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

  public JerseyConfig() {
    register(BoardResource.class);
  }
}
