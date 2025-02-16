package Lambda;

public class Main6 {
    public static void main(String[] args) {
        ToBinaryForm toBinaryForm = (a) -> a.toBinaryString(10);
        System.out.println(toBinaryForm.toBinary(255));
    }
}
