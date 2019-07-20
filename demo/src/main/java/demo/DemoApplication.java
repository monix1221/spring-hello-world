package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld"); // -> helloWorld bean
        // bean name is class name with first letter lower case (the rest letters exactly like in class name
        // 1. Spring scans demo package
        // 2. finds "helloWorld" bean
        // 3. initializes bean
        // 4. put bean in context
        // 5. context gives us instance of beaan

        helloWorld.sayHello();
    }
}
