package solid;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyServiceTest {

    @Test
    void generateUUID() {
        MyService myService = new MyService();
        assertEquals("DEMO7", myService.generateUUID());
    }
}