package com.javaaround;
 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.javaaround.configuration.AppConfig;
import com.javaaround.domain.HelloWorld;
import com.javaaround.spring.Communication;
import com.javaaround.spring.Application;
import com.javaaround.spring.Employee;

/**
 * App Main class
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//spring 4
         AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //spring < 4
        //AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        
        //hello world spring
        HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
        bean.sayHello("Spring 4");

        System.out.println("DI demo : ");
        //setter & constructor DI
        Communication app = (Communication)context.getBean("communication");
        app.communicate();

        //autowire=byName 
        System.out.println("Autowire byName demo : ");
        Application application = (Application)context.getBean("application");
        System.out.println("Application Details  : "+application);

        System.out.println("Autowire byType demo : ");
        //autowire=byType
        Employee employee = (Employee)context.getBean("employee");
        System.out.println("Employee Details : "+employee);
        context.close();



    }
}
