package cn.javaer.demo.eureka.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService
{
    
    private final RestTemplate restTemplate;
    
    @Autowired
    public HelloService(final RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }
    
    public String hiService()
    {
        return restTemplate.getForObject("http://DEMO-EUREKA-CLIENT-APPLICATION/hi", String.class);
    }
    
}