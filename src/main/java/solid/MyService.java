package solid;

import java.util.Random;

public class MyService {
    public String generateUUID() {
        String date = "DEMO";
        Random random = new Random();
        int number = random.nextInt(10);
        return date + number;
    }
}
