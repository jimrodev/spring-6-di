package guru.springframework.spring6di.controllers.i18n;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// Branch 8-spring-profiles
// PROFILES
// Cuando tenemos varios @Bean -> [@Controller, @Service, @Component...] con el mismo @Qualifier, en el ejemplo @Qualifier("i18NService")
// Profiles es una forma de controlar que @Bean será wired dentro de Application context y cual no cuando tenemos varias posibilidades
@Controller
public class Myi18NController {

    private final GreetingService greetingService;

    public Myi18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}