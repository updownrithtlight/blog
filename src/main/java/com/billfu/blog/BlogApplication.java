package com.billfu.blog;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BlogApplication {
    @Bean
    public ExitCodeGenerator exitCodeGenerator(){
        return () ->46;
    }
	public static void main(String[] args) {
       // System.exit(SpringApplication.exit(SpringApplication.run(BlogApplication.class, args)));
		SpringApplication.run(BlogApplication.class, args);
	}

}
