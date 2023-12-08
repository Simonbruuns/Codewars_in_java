package Codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * Doesnt work. Might update it later.
 */
public class Decomposer {

    public String decompose(long n){
        List<Long> result = helper(n, n*n);
        return result == null ? "null" : formatResult(result);

    }
    public static List<Long> helper(long remaining, long target){
        if (remaining < 0) {
            return null;
        }
        if (remaining == 0) {
            return new ArrayList<>();
        }
        for (long i = (long) Math.floor(Math.sqrt(remaining)); i > 0; i--) {
            if (i * i <= remaining) {
                List<Long> subRes = helper(remaining - i * i, target);
                if (subRes != null) {
                    subRes.add(i);
                    // Ensure the sequence is strictly increasing
                    if (isValidStrictlyIncreasing(subRes)) {
                        return subRes;
                    }
                    subRes.remove(subRes.size() - 1);
                }
            }
        }
        return null;
    }
    private static boolean isValidStrictlyIncreasing(List<Long> sequence) {
        for (int i = 1; i < sequence.size(); i++) {
            if (sequence.get(i) >= sequence.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static String formatResult(List<Long> result){
        StringBuilder sb = new StringBuilder();
        for (int i = result.size()-1; i >= 0; i--) {
            sb.append(result.get(i));
            if(i>0){
                sb.append(" ");
            }
           }
        return sb.toString();

        }

    public static void main(String[] args){
        Decomposer decomposer = new Decomposer();
        System.out.println(decomposer.decompose(11));



        }

    }

