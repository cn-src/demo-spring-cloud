# demo-spring-cloud
spring cloud 样例
[原教程地址](http://blog.csdn.net/forezp/article/details/70148833)
====

+ `demo-eureka-client` 服务提供者(开启多个)
+ `demo-eureka-server` 服务注册中心
+ `demo-service-ribbon` 服务消费者（rest+ribbon）
+ `demo-service-feign` 服务消费者（Feign）
  - 基于注解和接口，调用直观
  - 整合了ribbon
  - 自带断路器
