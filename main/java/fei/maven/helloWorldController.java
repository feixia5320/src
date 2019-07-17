package fei.maven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
	@RequestMapping("/hello")
	public String say(){
        return "Hello Spring Boot";
    }
	
	@GetMapping("/hello2")
	public String say2(){
        return "Hello Spring Boot2";
    }

}
