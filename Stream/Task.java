import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        ArrayList<String> employee = new ArrayList<>();
        employee.add("Johnson");
        employee.add("Statham");
        employee.add("Chan");
        employee.add("Jacobs");
        employee.add("Biden");
        List JList = employee.stream()
                .filter(element -> element.charAt(0) == ('J'))
                .collect(Collectors.toList());
        System.out.println(JList);
    }
}
