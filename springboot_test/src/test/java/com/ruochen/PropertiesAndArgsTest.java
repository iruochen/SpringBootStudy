package com.ruochen;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

// 当前测试用例添加临时属性
// 可覆盖 application.yml 中的配置
// @SpringBootTest(properties = {"test.prop=testValue1"})
// args 属性可以为当前测试用例添加临时的命令行参数
@SpringBootTest(args = {"--test.prop=testValue2"})
public class PropertiesAndArgsTest {

    @Value("${test.prop}")
    private String msg;

    @Test
    void testProperties() {
        System.out.println(msg);
    }

}
