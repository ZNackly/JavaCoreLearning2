package Lambda;

public class Main4 {
    public static void main(String[] args) {
        Strings strings = (String s1, String s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            } else {
                return s2;
            }
        };
        System.out.println(strings.compareStrings("biba", "abiba"));
    }
}
