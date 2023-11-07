package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// Spring Framework intenta hacer el @Autowire by type, del tipo GreetingService pero encuentra dos opciones, dos implementaciones
// ERROR
// GreetingServiceImpl, GreetingServicePrimary y no sabe cual de las dos usar
// Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'constructorInjectedController'
// Unsatisfied dependency expressed through constructor parameter 0: No qualifying bean of type 'guru.springframework.spring6di.services.GreetingService' available: expected single matching bean but found 2: greetingServiceImpl,greetingServicePrimary
// SOLUCION
// cada vez que Spring Framework intente injectar un GreetingService (La interfaz genérica), selecionará la implementación que esté marcada con @Primary
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello From the Primary Bean!!";
    }
}
