package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

/*
// Without Dependency Injection
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone Fron Base Service!!!";
    }
}
*/

// With Dependency Injection, con el stereotype @Service Spring Framework instanciará por nosotros la clase y la alojará en el Applicatión Context
// Spring Framework gestionará todo el ciclo de vida de la instancia
// Además inyectará la dependecia cuando sea necesario

// branch 7-using-qualifiers
// Al incluir varias implementaciones de la interfaz GrettingService GreetingServicePropertyInjected, GreetingServiceSeeterInjected, ... y estas
// Cualifier estableciendo el identificador en el stereotype @Service
// Indicamos la implementación que queremos injectar indicando @Qualifier("greetingServiceImpl") previo a la dependencia
@Service("greetingServiceImpl")
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!!!";
    }
}