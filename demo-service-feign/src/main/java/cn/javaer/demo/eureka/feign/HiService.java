package cn.javaer.demo.eureka.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("DEMO-EUREKA-CLIENT-APPLICATION")
public interface HiService
{
    @GetMapping("/hi")
    String sayHiFromClientOne();
}