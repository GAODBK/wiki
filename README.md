# Getting Started

![nihao](https://tgimgbed-f3l.pages.dev/file/1749461755254_图片.png)

[file: src/main/resources/generator/generator-config.xml](src/main/resources/generator/generator-config.xml)

这个文件在使用是缺失依赖，需要下载：[[mybatis-generator-config_1_0.dtd](doc%2Fmybatis-generator-config_1_0.dtd)](doc/mybatis-generator-config_1_0.dtd)

> windows version:
> 
> idea: 2023.1.7 ，jdbc: 8.0.22, @vue/cli 5.0.8, npm: 10.5.0, mysql: 5.7

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.0/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.0/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.0/reference/web/servlet.html)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the
parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

# web

## Project setup
```
yarn install
```

### Compiles and hot-reloads for development
```
yarn serve
```

### Compiles and minifies for production
```
yarn build
```

### Lints and fixes files
```
yarn lint
```


| 缩写  | 全称      | 中文含义 |
|-------|-----------|---------|
| req   | request   | 请求    |
| resp  | response  | 响应/返回 |