package guru.springframework.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

// Branch 8-spring-profiles
// PROFILES
// Cuando tenemos varios @Bean -> [@Controller, @Service, @Component...] con el mismo @Qualifier, en el ejemplo @Qualifier("i18NService")
// Profiles es una forma de controlar que @Bean será wired dentro de Application context y cual no cuando tenemos varias posibilidades
// ERROR
// Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'myi18NController'
// Unsatisfied dependency expressed through constructor parameter 0: No qualifying bean of type 'guru.springframework.spring6di.services.GreetingService' available:
// expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Qualifier("i18NService")}
// SOLUCIÓN
// Establecer el profice activo mediante @ActiveProfiles("EN"), de esta manera Spring Framework sabrá que @Bean deberá injectar

// default profile es un profile especial que se usa cuando no se ha establecido ningún profile, probar esto comentando //@ActiveProfiles("EN")
//@ActiveProfiles("EN")
@SpringBootTest
public class Myi18NControllerTestEN {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void name() {

        System.out.println(myi18NController.sayHello());
    }
}
