package Lambda;

// public class Main3 implements Interface3 {
//     public static void main(String[] args) {
//         Interface3 interface13 = (x) -> x % 13 == 0;
//         System.out.println(interface13.Method(13));
//     }
// }
public class Main3 {
    public static void main(String[] args) {
        DivisibleBy divisibleBy13 = (number) -> number % 13 == 0;
        System.out.println(divisibleBy13.isDivisible(26)); // true
        System.out.println(divisibleBy13.isDivisible(27)); // false
    }
}