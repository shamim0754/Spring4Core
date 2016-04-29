package com.javaaround.spring.scheduling;
 
import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;
 
@Component("myBean")
public class MyBean {
 	
    @Scheduled(fixedRate=5000)
    public void printMessage() {
        System.out.println("I am called by Spring scheduler");
    }
}