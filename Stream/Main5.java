import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        int result = list.stream()
                .reduce((accumulator, element) -> (accumulator * element))
                .get();
        System.out.println(result);
        // List<Integer> list100 = new ArrayList<>();
        // Optional<Integer> o = list.stream()
        // .reduce((accumulator, element) -> (accumulator * element));

        // if (o.isPresent()) {
        // System.out.println(o.get());
        // } else {
        // System.out.println("No value");
        // }
        // List<Integer> list100 = new ArrayList<>();
        int o = list.stream()
                .reduce(2, (accumulator, element) -> (accumulator * element));
        System.out.println(o);
        List<String> list2 = new ArrayList<>();
        list2.add("Privet");
        list2.add("Andrey");
        list2.add("\nPoka");
        String listString = list2.stream()
                .reduce("", (accumulator, element) -> accumulator + element + " ");
        System.out.println(listString);
    }
}
