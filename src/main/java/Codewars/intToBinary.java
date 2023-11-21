package Codewars;

public class intToBinary {
    public static int countBits(int n){
        String result = Integer.toBinaryString(n);
        char someChar = '1';
        int p = 0;
        for (int i = 0; i < result.length(); i++) {
            if(result.charAt(i) == someChar){
                p++;

            }

        }
        // Show me the code!
        return p;
    }

    public static void main(String[] args){
        System.out.println(countBits(1234));
        System.out.println(countBits(10));
    }
}
