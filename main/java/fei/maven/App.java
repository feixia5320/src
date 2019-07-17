package fei.maven;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
//        SpringApplicationBuilder builder = new SpringApplicationBuilder(App.class);
//        builder.bannerMode(Banner.Mode.OFF).run(args);
        
    }
}
