package com.evil.api;

import com.evil.framework.ServiceRegistry;
import com.evil.framework.ServiceRegistryImpl;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author kongzheng1993
 * zk配置类
 */

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "registry")
public class RegistryConfig {

    private String servers;

    @Bean
    public ServiceRegistry serviceRegistry() {
        return new ServiceRegistryImpl(servers);
    }

    public void setServers(String servers) {
        this.servers = servers;
    }

}
