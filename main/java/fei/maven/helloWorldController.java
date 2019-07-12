package fei.maven;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
	@RequestMapping("/hello")
	public String say(){
        return "Hello Spring Boot";
    }

}
