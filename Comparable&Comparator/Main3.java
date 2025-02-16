import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main3 {
    public static void main(String[] args) {
        String s1 = "zz";
        String s2 = "aaa";
        ArrayList<String> array = new ArrayList<>();
        array.add(s1);
        array.add(s2);
        Collections.sort(array, new compareString());
        System.out.println(s1.compareTo(s2));
        System.out.println(array);
    }

}

class compareString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

}
