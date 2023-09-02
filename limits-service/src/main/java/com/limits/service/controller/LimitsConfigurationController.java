package com.limits.service.controller;

import com.limits.service.config.ApplicationConfig;
import com.limits.service.response.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private ApplicationConfig configuration;

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfigurations()
    {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
