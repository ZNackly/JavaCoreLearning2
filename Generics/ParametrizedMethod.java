package Generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("L");
        array.add("O");
        array.add("L");
        String a = GenMethod.getSecondElement(array);
        System.out.println(a);
    }

}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> a1) {
        return a1.get(1);
    }
}