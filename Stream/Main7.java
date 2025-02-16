import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        int[] array = { 38, 37, 93, 55, 37, 27, 71, 27, 52, 52 };
        int chislo = Arrays.stream(array)
                .filter(x -> x % 2 == 0)
                .map(x -> {
                    if (x % 3 == 0) {
                        x = x / 3;
                    }
                    return x;
                })
                .reduce((accumulator, element) -> accumulator + element).getAsInt();
        System.out.println(chislo);
    }
}
