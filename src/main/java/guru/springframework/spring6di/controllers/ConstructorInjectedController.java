package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/*
// Without Dependency Injection
public class ConstructorInjectedController {
    private final GreetingService greetingService;
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }

}
*/

// With Dependency Injection, con el stereotype @Controller Spring Framework instanciará por nosotros la clase y la alojará en el Applicatión Context
// Spring Framework gestionará todo el ciclo de vida de la instancia
// Además inyectará la dependecia cuando sea necesario
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // branch 7-using-qualifiers
    // Al incluir varias implementaciones de la interfaz GrettingService GreetingServicePropertyInjected, GreetingServiceSeeterInjected, ... y estas
    // Cualifier estableciendo el identificador en el stereotype @Service
    // Indicamos la implementación que queremos injectar indicando @Qualifier("greetingServiceImpl") previo a la dependencia
    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }

}