package solid;

import java.util.Random;

public class MyService {
    Random random;

    public String generateUUID() {
        String date = "DEMO";
        int number = random.nextInt(10);
        return date + number;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
