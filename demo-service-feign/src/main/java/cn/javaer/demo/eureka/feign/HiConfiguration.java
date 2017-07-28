package cn.javaer.demo.eureka.feign;

import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("auth")
public class HiConfiguration
{
    @Bean
    public Contract feignContract()
    {
        return new feign.Contract.Default();
    }
    
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor()
    {
        return new BasicAuthRequestInterceptor("user", "password");
    }
}