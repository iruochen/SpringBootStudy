# 热部署
## 手动启动热部署
- 添加 maven 坐标
```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
</dependency>
```
- 修改代码后手动点击 `Build Project`(Ctrl + F9)

## 自动启动热部署
- IDEA 配置：`File > Settings > Build > Compiler > Build project automatically`
- `Ctrl + Shift + Alt + /` 点击 `Registry`，勾选 `complier.automake.allow.when.app.running` 
- 激活方式：IDEA失去焦点5s后启动热部署
>新版本IDEA：`File > Settings > Advanced Settings`