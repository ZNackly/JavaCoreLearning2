package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
        List<?> list2 = new ArrayList<Double>();

    }

    static void showListInfo(List<?> list) {
        System.out.println("List elements:" + list);
    }
}
