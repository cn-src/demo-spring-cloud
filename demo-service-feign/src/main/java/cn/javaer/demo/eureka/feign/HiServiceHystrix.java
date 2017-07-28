package cn.javaer.demo.eureka.feign;

import org.springframework.stereotype.Component;

/**
 * @author zhangpeng
 */
@Component
public class HiServiceHystrix implements HiService
{
    @Override
    public String sayHiFromClientOne()
    {
        return "Hi, Feign, ERROR";
    }
}
