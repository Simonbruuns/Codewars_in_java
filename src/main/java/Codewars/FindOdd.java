package Codewars;

public class FindOdd {
    public static String disemvowel(String str) {
        String pattern = "(?i)[aeiou]";

        String result = str.replaceAll(pattern, "");
        return result;
            }






        // Code away...

}