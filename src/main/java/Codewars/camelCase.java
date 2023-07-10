package Codewars;

public class camelCase {
    public static void main(String[] args){
        System.out.println(splitUp("OogaBooga"));
    }

    //Uses replaces replaceAll and Regex, to split the camelcase, in letters from A to Z.
    public static String splitUp(String text){
        return text.replaceAll("(?=[A-Z]+)", " ").trim();

    }
}
