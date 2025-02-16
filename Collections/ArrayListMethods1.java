package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Zaur");
        arrayList.add("Ivan");
        arrayList.add("Marya");
        Iterator<String> iterator = arrayList.iterator();
        System.out.println(arrayList);
        for (String s : arrayList) {
            System.out.println(s + ' ');

        }

    }
}
