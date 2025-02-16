package Lambda;

import java.lang.Math;

public class Main5 {
    public static void main(String[] args) {
        Discriminant discriminant = (a, b, c) -> (b * b - 4 * a * c);
        Discriminant discriminant2 = (a, b, c) -> (a * Math.pow(b, c));
        System.out.println(discriminant.Discriminant(4.0, 3.0, -4.0));
        System.out.println(discriminant2.Discriminant(3.0, 4.0, 5.0));
    }
}
