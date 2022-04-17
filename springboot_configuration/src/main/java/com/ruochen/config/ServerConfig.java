package com.ruochen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

// @Component
@Data
@ConfigurationProperties(prefix = "servers")
// 开启对当前 Bean 的属性注入校验
@Validated
public class ServerConfig {
    private String ipAddress;

    // 设置具体的规则
    @Max(value = 8888, message = "最大值不能超过8888")
    @Min(value = 202, message = "最小值不能低于202")
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
