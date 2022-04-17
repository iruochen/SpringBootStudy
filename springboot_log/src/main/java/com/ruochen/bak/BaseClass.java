package com.ruochen.bak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseClass {

    private Class clazz;
    // 创建记录日志的对象
    public static Logger log;

    public BaseClass() {
        clazz = this.getClass();
        log = LoggerFactory.getLogger(clazz);
    }
}
