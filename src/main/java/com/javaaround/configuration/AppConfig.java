package com.javaaround.configuration;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;


import com.javaaround.domain.HelloWorld;
import com.javaaround.impl.HelloWorldImpl;
import com.javaaround.spring.Communication;
import com.javaaround.domain.Encryption;
import com.javaaround.domain.Messaging;
import com.javaaround.impl.ActiveMQMessaging;
import com.javaaround.impl.RSAEncryption;
import com.javaaround.spring.scheduling.MyBean;

@Configuration
////Spring auto detect the annotated beans like @Resource or @Autowired
@ComponentScan("com.javaaround") 
@PropertySource(value = { "classpath:application.properties" })
@EnableScheduling
public class AppConfig{
	
    @Autowired
    public DataSource dataSource;

	@Bean(name="helloWorldBean")
    @Description("This is a sample HelloWorld Bean")
	public HelloWorld helloWorld(){
		return new HelloWorldImpl();
	}
    @Bean
    public MyBean bean() {
        return new MyBean();
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
    /*
     * PropertySourcesPlaceHolderConfigurer Bean only required for @Value("{}") annotations.
     * Remove this bean if you are not using @Value annotations for injecting properties.
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}