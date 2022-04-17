package com.ruochen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotDeployApplication {

    public static void main(String[] args) {
        // 可覆盖配置文件中关闭热部署配置
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(HotDeployApplication.class, args);
    }

}
