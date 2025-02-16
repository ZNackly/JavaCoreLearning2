import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");
        // for (int i = 0; i < list.size(); i++) {
        // list.set(i, String.valueOf(list.get(i).length()));
        // }
        List<Integer> list2 = list.stream()
                .map(element -> element.length())
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list2);
        int[] array = { 9, 5, 3, 74, 23, 43, 15 };
        array = Arrays.stream(array).map((int i) -> {
            if (i % 3 == 0) {
                i /= 3;
            }
            return i;
        }).toArray();
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}