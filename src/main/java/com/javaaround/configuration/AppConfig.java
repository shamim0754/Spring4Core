package com.javaaround.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.javaaround.domain.HelloWorld;
import com.javaaround.impl.HelloWorldImpl;
import com.javaaround.spring.Communication;
import com.javaaround.domain.Encryption;
import com.javaaround.domain.Messaging;
import com.javaaround.impl.ActiveMQMessaging;
import com.javaaround.impl.RSAEncryption;

@Configuration
public class AppConfig{
	
	@Bean(name="helloWorldBean")
    @Description("This is a sample HelloWorld Bean")
	public HelloWorld helloWorld(){
		return new HelloWorldImpl();
	}

	@Bean(name = "communication")
    public Communication communication() {
        Communication communication = new Communication(encryption());
        communication.setMessaging(messaging());
        return communication;
    }

    @Bean(name = "encryption")
    @Description("This bean will be injected via setter injection")
    public Encryption encryption() {
        return new RSAEncryption();
    }
 
    @Bean(name = "messaging")
    @Description("This bean will be injected via setter injection")
    public Messaging messaging() {
        return new ActiveMQMessaging();
    }
}