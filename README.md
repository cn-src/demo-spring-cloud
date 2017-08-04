# demo-spring-cloud
spring cloud 学习样例
* [原教程作者:方志朋](http://blog.csdn.net/forezp)
* [原教程地址](http://blog.csdn.net/forezp/article/details/70148833)
* [原教程源码地址](https://github.com/forezp/SpringCloudLearning)
====

+ `demo-eureka-client` 服务提供者(开启多个)
+ `demo-eureka-server` 服务注册中心
+ `demo-service-ribbon` 服务消费者（rest+ribbon）
+ `demo-service-feign` 服务消费者（Feign）
  - 基于注解和接口，调用直观
  - 整合了ribbon
  - 自带断路器
+ `demo-service-zuul` 路由
+ `demo-config-server` 配置管理服务端
+ `demo-config-client` 配置管理客户端
