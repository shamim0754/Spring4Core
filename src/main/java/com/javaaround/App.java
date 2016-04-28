package com.javaaround;
 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.javaaround.configuration.AppConfig;
import com.javaaround.domain.HelloWorld;
import com.javaaround.spring.Communication;

/**
 * App Main class
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//spring 4
        //AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //spring < 4
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        
        //hello world spring
        HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
        bean.sayHello("Spring 4");

        //setter DI
        Communication app = (Communication)context.getBean("communication");
        app.communicate();

        context.close();

    }
}
