package Codewars;

public class armstrongNumber {
    public static boolean isNarcissistic(int number) {
        // TODO replace with your code
        int digits = (int) (Math.log10(number) + 1);
        int orignalNumber, remainder, result = 0;
        orignalNumber = number;
        while (orignalNumber != 0) {
            remainder = orignalNumber % 10;
            result += Math.pow(remainder, digits);
            orignalNumber /= 10;
        }

        if (result == number)

            return true;
        else

            return false;
    }

    public static void main(String[] args) {
        System.out.println(isNarcissistic(1634));

    }
}

