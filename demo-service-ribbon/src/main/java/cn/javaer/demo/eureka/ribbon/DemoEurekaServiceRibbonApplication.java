package cn.javaer.demo.eureka.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangpeng
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DemoEurekaServiceRibbonApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(DemoEurekaServiceRibbonApplication.class, args);
    }
    
    @Bean
    @LoadBalanced
    RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
