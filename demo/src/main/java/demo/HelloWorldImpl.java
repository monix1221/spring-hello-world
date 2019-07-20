package demo;

import org.springframework.stereotype.Component;


@Component // -> it will get registered in Spring Context as Spring Bean
public class HelloWorldImpl implements HelloWorldService { // it's an implementation

    public void sayHello() {
        System.out.println("Hello World!!!!");
    }

}
