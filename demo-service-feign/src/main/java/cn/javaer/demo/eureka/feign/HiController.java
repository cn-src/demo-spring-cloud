package cn.javaer.demo.eureka.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController
{
    
    private final HiService hiService;
    
    @Autowired
    public HiController(final HiService hiService)
    {
        this.hiService = hiService;
    }
    
    @GetMapping("/b/call")
    public String sayHi()
    {
        return hiService.sayHiFromClientOne()+"::/b/call";
    }
}