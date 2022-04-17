## 宽松绑定
- `@ConfigurationProperties` 绑定属性支持属性名宽松绑定
- 驼峰、下划线、中划线、常量
- 绑定前缀名称命名规范(prefix=xxx)：仅能使用纯小写字母、数字、下划线作为合法的字符
>`@Value`不支持

## 数据校验
- `pom.xml` 坐标
```xml
<dependency>
    <groupId>javax.validation</groupId>
    <artifactId>validation-api</artifactId>
</dependency>
```
- `validation-api` 只是一组接口，运行需要有实现类，这里我们使用 hibernate 提供的校验器做实现类

## 进制数据转换规则
- 八进制：0(0-7)
- 十六进制：0x(0-9,a-f)