package Lambda;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.Random;

public class RussianRoulette {
    public static void main(String[] args) {
        ArrayList<String> magazine = new ArrayList<>();
        magazine.add("empty");
        magazine.add("empty");
        magazine.add("empty");
        magazine.add("empty");
        magazine.add("empty");
        magazine.add("bullet....KABOOM");
        Random random = new Random();
        Supplier<String> supplier = () -> {
            int value = random.nextInt(6);
            return magazine.get(value);
        };
        System.out.println(supplier.get());
    }
}