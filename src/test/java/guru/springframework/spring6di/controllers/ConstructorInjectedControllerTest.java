package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/*
// Without Dependency Injection
class ConstructorInjectedControllerTest {

    // Dependency Injection without Spring Framework
    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        // En el inicializador de cada test inicializamos las instancias del controller y del services (A través de la propiedad pública)
        // Construct Injected
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}
*/

// With Dependency Injection, con el stereotype @SpringBootTest le decimos a J Unit que queremos cargar el contexto (Spring Context)
// Además inyectará la dependecia cuando sea necesario con @Autowired
@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController constructorInjectedController;

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}