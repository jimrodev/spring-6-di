package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;

import static org.junit.jupiter.api.Assertions.*;

/*
// Without Dependency Injection
class PropertyInjectedControllerTest {

    // Dependency Injection without Spring Framework
    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        // En el inicializador de cada test inicializamos las instancias del controller y del services (A través de la propiedad pública)
        propertyInjectedController = new PropertyInjectedController();

        // Property Injected
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {

        System.out.println(propertyInjectedController.sayHello());
    }
}
*/

// With Dependency Injection, con el stereotype @SpringBootTest le decimos a J Unit que queremos cargar el contexto (Spring Context)
// Además inyectará la dependecia cuando sea necesario con @Autowired
@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;

    @Test
    void sayHello() {

        System.out.println(propertyInjectedController.sayHello());
    }
}