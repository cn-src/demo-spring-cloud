package cn.javaer.demo.eureka.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    
    private final HelloService helloService;
    
    @Autowired
    public HelloController(final HelloService helloService) {this.helloService = helloService;}
    
    @GetMapping(value = "/call")
    public String call()
    {
        return helloService.hiService();
    }
    
}