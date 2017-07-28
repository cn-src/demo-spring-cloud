package cn.javaer.demo.eureka.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author zhangpeng
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DemoEurekaServiceFeignApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(DemoEurekaServiceFeignApplication.class, args);
    }
}
