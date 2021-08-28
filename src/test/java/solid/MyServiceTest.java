package solid;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyServiceTest {

    @Test
    void generateUUID() {
        Random random = new Random7();
        MyService myService = new MyService();
        myService.setRandom(random);
        assertEquals("DEMO7", myService.generateUUID());
    }
}

class Random7 extends Random {
    @Override
    public int nextInt(int bound) {
        return  7;
    }
}