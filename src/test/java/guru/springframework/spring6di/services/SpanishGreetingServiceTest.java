package guru.springframework.spring6di.services;

import guru.springframework.spring6di.controllers.i18N.Myi18NController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


//@ActiveProfiles("ES")
@SpringBootTest
class SpanishGreetingServiceTest {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void sayGreeting() {
        System.out.println(myi18NController.sayHello());
    }
}