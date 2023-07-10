package Codewars;

import java.lang.Math;

public class Square {
    public static boolean isSquare(int n) {
        int squared = (int) Math.sqrt(n);
        if (squared * squared == n){
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args){

        System.out.println(isSquare(3));
    }
}