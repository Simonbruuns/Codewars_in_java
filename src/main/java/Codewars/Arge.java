package Codewars;

public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        int pop = p0;


        while(pop<p){
            pop += pop * percent/100 + aug;
            years++;
        }
        return years;
    }



    public static void main(String[] args){
        System.out.println(nbYear(1000,2,50,1200));
    }
}
