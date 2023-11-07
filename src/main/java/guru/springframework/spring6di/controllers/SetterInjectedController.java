package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/*
// Without Dependency Injection
public class SetterInjectedController {

    // Interfaz
    private GreetingService greetingService;

    // Setter para asignar la dependencia a través de él posteriormente
    public void setGreetingService(GreetingService greetingService) {
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
public class SetterInjectedController {

    // Interfaz
    // ! Field Injection is not recommended !
    // branch 7-using-qualifiers
    // Al incluir varias implementaciones de la interfaz GrettingService GreetingServicePropertyInjected, GreetingServiceSeeterInjected, ... y estas
    // Cualifier estableciendo el identificador en el stereotype @Service
    // Indicamos la implementación que queremos injectar indicando @Qualifier("greetingServiceImpl") previo a la dependencia
    @Qualifier("setterGreetingBean")
    @Autowired
    private GreetingService greetingService;

    // Setter para asignar la dependencia a través de él posteriormente
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("Dentro del Setter");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
