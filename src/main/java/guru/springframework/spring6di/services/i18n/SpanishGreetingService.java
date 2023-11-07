package guru.springframework.spring6di.services.i18n;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Branch 8-spring-profiles
// PROFILES
// Cuando tenemos varios @Bean -> [@Controller, @Service, @Component...] con el mismo @Qualifier, en el ejemplo @Qualifier("i18NService")
// Profiles es una forma de controlar que @Bean será wired dentro de Application context y cual no cuando tenemos varias posibilidades
@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
