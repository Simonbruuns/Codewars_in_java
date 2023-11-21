package Codewars;

public class sentenceSmash {
    public static void main(String[] args){

        String test[] = {"Hello", "How"};
        System.out.println(smash(test));
    }

    public static String smash(String[] words){
        String joint = String.join(" ", words);
        return joint;

    }
}
