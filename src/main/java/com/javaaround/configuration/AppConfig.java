package com.javaaround.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.javaaround.domain.HelloWorld;
import com.javaaround.domain.HelloWorldImpl;

@Configuration
public class AppConfig{
	
	@Bean(name="helloWorldBean")
    @Description("This is a sample HelloWorld Bean")
	public HelloWorld helloWorld(){
		return new HelloWorldImpl();
	}
}