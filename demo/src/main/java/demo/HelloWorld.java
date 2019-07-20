package demo;

import org.springframework.stereotype.Component;


@Component // -> it will get registered in Spring Context as Spring Bean
public class HelloWorld {

    public void sayHello() {
        System.out.println("Hello World!!!!");
    }

}
