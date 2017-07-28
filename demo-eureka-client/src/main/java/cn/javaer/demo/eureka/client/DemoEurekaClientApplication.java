package cn.javaer.demo.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class DemoEurekaClientApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(DemoEurekaClientApplication.class, args);
    }
    
    @Value("${server.port}")
    String port;
    
    @GetMapping("/hi")
    public String home()
    {
        return "hi:" + port;
    }
}
