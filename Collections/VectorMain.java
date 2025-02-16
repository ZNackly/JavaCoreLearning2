package Collections;

import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Kate");
        vector.add("Zaur");
        vector.add("Misha");
        vector.add("Dan");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
    }

}