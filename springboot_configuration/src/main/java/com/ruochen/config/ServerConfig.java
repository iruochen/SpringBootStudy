package com.ruochen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

// @Component
@Data
@ConfigurationProperties(prefix = "servers")
public class ServerConfig {
    private String ipAddress;
    private int port;
    // ms
    private long timeout;

    // 默认为ms，可自定义单位
    @DurationUnit(ChronoUnit.HOURS)
    private Duration serverTimeOut;

    // 存储容量大小，默认为 B
    @DataSizeUnit(DataUnit.MEGABYTES)
    private DataSize dataSize;
}
