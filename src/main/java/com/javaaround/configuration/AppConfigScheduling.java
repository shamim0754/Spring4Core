package com.javaaround.configuration;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.javaaround.spring.scheduling.MyBean;

@Configuration
@EnableScheduling
public class AppConfigScheduling{
	
    
    @Bean
    public MyBean bean() {
        return new MyBean();
    }
	
}