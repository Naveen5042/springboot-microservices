package com.limits.service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("limits-service")
@Data
public class ApplicationConfig {

    private int maximum;
    private int minimum;

}
