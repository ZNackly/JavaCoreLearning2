package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        // String s1 = "ABCD ABCD ABCF ABCG ABCH";
        // Pattern pattern1 = Pattern.compile("ABCD");

        // String s1 = "ABDOP";
        // Pattern pattern1 = Pattern.compile("AB[C-F]OPx`");
        String s1 = "abcd abce abc5abcg57abch";
        Pattern pattern1 = Pattern.compile("\\w+");
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " " + matcher.group());
        }
    }

}
