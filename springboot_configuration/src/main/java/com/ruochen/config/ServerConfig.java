package com.ruochen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

// @Component
@Data
@ConfigurationProperties(prefix = "servers")
public class ServerConfig {
    private String ipAddress;
    private int port;
    private long timeout;
}
