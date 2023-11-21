package Codewars;
import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    /**
     * Method which converts an integer value to a roman numeral. We create two arrays
     * which contains the values corresponding to symbols, this can also be done with a hashmap.
     * We use a while loop to go through the arrays and calculate the correct
     * roman numeral, from our input(n)
     * We calculate how many times we have to iterate the for loop with count
     *
     * @param n
     * @return
     */

    public static String toRoman(int n) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (n > 0) {
            int count = n / values[i];
            n %= values[i];

            for (int j = 0; j < count; j++) {
                result.append(symbols[i]);
            }

            i++;
        }
        return result.toString();
    }

    /**
     * In this mehtod we calculate from roman numeral to arabic numbers, with a string input.
     * Again, two arrays.
     * We use a custom method getValue().
     * We iterate through the roman numeral from right to left, excluding the last symbol.
     * We get the current and next value, and then we compare the values. Determining if we should subtract or add its value.
     * @param romanNumeral
     * @return translation to arabic numeral.
     */
    public static int fromRoman(String romanNumeral) {
        char[] symbols = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] values = {1, 5, 10, 50, 100, 500, 1000};

        int result = getValue(romanNumeral.charAt(romanNumeral.length() - 1), symbols, values);

        for (int i = romanNumeral.length() - 2; i >= 0; i--) {
            int currentValue = getValue(romanNumeral.charAt(i), symbols, values);
            int nextValue = getValue(romanNumeral.charAt(i + 1), symbols, values);

            if (currentValue < nextValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    private static int getValue(char symbol, char[] symbols, int[] values) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == symbol) {
                return values[i];
            }
        }
        return 0;  // Handle invalid symbols
    }
    public static void main(String[] args) {
        int integerValue = 2001;
        String romanNumeral = toRoman(integerValue);
        System.out.println("Integer Value: " + integerValue);
        System.out.println("Roman Numeral: " + romanNumeral);
        System.out.println(fromRoman("MM"));
    }

}
