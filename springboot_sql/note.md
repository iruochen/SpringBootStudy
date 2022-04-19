## 数据源配置
- SpringBoot 内嵌数据源对象
    - HikariCP(默认)
    - Tomcat 提供 DataSource：HikariCP不可用的情况下，且在 web 环境中，将使用 tomcat 服务器配置的数据源对象
    - Commons DBCP：Hikari不可用，tomcat 数据源也不可用，将使用 dbcp 数据源
  
## 内置持久化解决方案
- springboot 内置 JdbcTemplate 持久化解决方案
- 使用 JdbcTemplate 需要导入 `spring-boot-starter-jdbc`