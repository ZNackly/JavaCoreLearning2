package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(-3);
        array.add(8);
        array.add(12);
        array.add(-8);
        array.add(0);
        array.add(5);
        array.add(10);
        array.add(1);
        array.add(150);
        array.add(-30);
        array.add(19);
        Collections.sort(array);
        int index = Collections.binarySearch(array, 12);
        System.out.println(index);
    }
}
