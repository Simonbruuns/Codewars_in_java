package Codewars;

public class squareUp {
    public static int squareSum(int[] n)
    {
        int currentNumber = 0;
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
             currentNumber = n[i];
             int calc = currentNumber * currentNumber;
             sum += calc;
        }
        return sum;
    }

    public static void main(String[] args){
        int[] number = {1,2,3};
        System.out.println(squareSum(number));


    }

}
