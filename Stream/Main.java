import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = { 0, 1, 7, 56, 35, 11, 509 };
        Arrays.stream(array)
                // .forEach(n -> System.out.println(n % 3))
                .forEach(Utils::mysum);
    }
}

class Utils {
    public static void mysum(int a) {
        a = a + 5;
        System.out.println(a);
    }
}