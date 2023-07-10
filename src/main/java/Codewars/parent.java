package Codewars;

public class parent {
    public static boolean validParentheses(String parens) {
        int countLeft = 0;
        int countRight = 0;
        int parensCount = 0;
        for (int i = 0; i < parens.length(); i++) {
            if (parens.contains("(")) {
                countLeft++;
            }
            if (parens.contains(")")) {
                countRight++;

            }
        }
            if ((countRight + countLeft) % 2 == 0) {
                return true;
            }
            else
                return false;
        }
    }



