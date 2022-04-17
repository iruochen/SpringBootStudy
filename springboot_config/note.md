## 自定义配置文件
### 方式一：Edit Configurations
- 运行参数指定配置文件名：`--spring.config.name=ebank`
- 运行参数指定配置文件路径：`--spring.config.location=classpath:/ebank.yml`

## 多环境开发控制
- 当 Maven 与 SpringBoot 同时对多环境进行控制时，以 Maven 为主，SpringBoot 使用 `@..@` 占位符读取 Maven 对应的配置属性值 
- 基于 SpringBoot 读取 Maven 配置属性的前提下，如果在 IDEA 下测试工程时 `pom.xml` 每次更新需要手动 `compile` 方可生效
