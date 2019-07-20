package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component// --> it will be managed as SpringBean in spring context
public class InjectedByConstructorService {
    private HelloWorldService helloWorldService;

    /**
     * @Autowired on constructor tells spring to inject constructor parameters
     * here when InjectedByConstructorService is created, an instance of HelloWorldService gets injected
     */
    @Autowired
    public InjectedByConstructorService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage() {
        helloWorldService.sayHello();
    }
}
