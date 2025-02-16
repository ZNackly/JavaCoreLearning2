package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
    public static void main(String[] args) {
        // String s1 = "Privet, moy Tom! Kak twoi dela?";
        // System.out.println(s1);
        // // s1 = s1.replace("dela", "sam");
        // s1 = s1.replaceAll("\\bt|T\\w+", "4444");
        // System.out.println(s1);
        String myString = "12345678912345670325987;" +
                "98765432165498709216546;" +
                "85274196345612381122333";
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);
        // String mynewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        // System.out.println(mynewString);
        while (matcher.find()) {
            System.out.println(matcher.group(7));
        }
    }
}
