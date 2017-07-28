package cn.javaer.demo.eureka.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("DEMO-EUREKA-CLIENT-APPLICATION")
// 可开启安全配置
// @FeignClient(name = "DEMO-EUREKA-CLIENT-APPLICATION",configuration = HiConfiguration.class)
public interface HiService
{
    @GetMapping("/hi")
    String sayHiFromClientOne();
}