package Codewars;

public class LikesIt {
    public static String whoLikesIt(String names) {
        int count = names.split(",").length;

        if (names.isEmpty()) {
            return "No one likes this.";
        } else if (count == 1) {
            return names + " likes this.";
        } else if (count == 2) {
            String[] splitNames = names.split(",");
            return splitNames[0] + " and " + splitNames[1] + " like this.";
        } else if (count == 3) {
            String[] splitNames = names.split(",");
            return splitNames[0] + "," + splitNames[1] + " and" + splitNames[2] + " likes this.";

        } else {
            String[] splitNames = names.split(",");
            int remainingCount = count - 2;
            return splitNames[0] + "," + splitNames[1] + " and " + remainingCount + " others like this.";
        }
    }
    public static void main(String[] args){
        String name = "Alice, bob, charlie, jens, john, børge";
        String displayText = whoLikesIt(name);
        System.out.println(displayText);
    }
    }

