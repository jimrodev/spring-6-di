package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void sayHello() {

        // Dependency without injection, esto no utiliza Spring Framework y por supuesto el application context
        // Aquí nosotros gestionamos la vida de la instancia, la creación...
        MyController myController = new MyController();

        System.out.println(myController.sayHello());
    }
}