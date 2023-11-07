package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/*
// Without Dependency Injection
class SetterInjectedControllerTest {

    // Dependency Injection without Spring Framework
    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        // En el inicializador de cada test inicializamos las instancias del controller y del services (A través del setter)
        setterInjectedController = new SetterInjectedController();

        // Setter Injected
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {

        System.out.println(setterInjectedController.sayHello());
    }
}
 */

// With Dependency Injection, con el stereotype @SpringBootTest le decimos a J Unit que queremos cargar el contexto (Spring Context)
// Además inyectará la dependecia cuando sea necesario con @Autowired
@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController setterInjectedController;

    @Test
    void sayHello() {

        System.out.println(setterInjectedController.sayHello());
    }
}