
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main8 {
    public static void main(String[] args) {
        List<Integer> arrayIntegers = new ArrayList<>();
        arrayIntegers.add(1);
        arrayIntegers.add(6);
        arrayIntegers.add(2);
        arrayIntegers.add(1);
        arrayIntegers.add(4);
        arrayIntegers.add(7);
        arrayIntegers.add(1);
        arrayIntegers.add(9);
        arrayIntegers.add(6);
        List<Integer> arrayIntegers2 = new ArrayList<>();
        arrayIntegers2.add(1);
        arrayIntegers2.add(6);
        arrayIntegers2.add(2);
        arrayIntegers2.add(1);
        arrayIntegers2.add(4);
        arrayIntegers2.add(7);
        arrayIntegers2.add(1);
        arrayIntegers2.add(9);
        arrayIntegers2.add(6);

        List array = arrayIntegers.stream()
                .sorted()
                .distinct()
                .toList();

        long count = arrayIntegers2.stream()
                .distinct()
                .peek(System.out::println)
                .count();
        System.out.println(array);
        System.out.println(count);

    }
}
