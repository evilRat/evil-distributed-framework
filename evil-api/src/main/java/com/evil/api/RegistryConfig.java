package com.evil.api;

import com.evil.framework.ServiceRegistry;
import com.evil.framework.ServiceRegistryImpl;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "registry")
public class RegistryConfig {

    private String services;

    @Bean
    public ServiceRegistry serviceRegistry() {
        return new ServiceRegistryImpl();
    }

    public void setServices(String services) {
        this.services = services;
    }

}
