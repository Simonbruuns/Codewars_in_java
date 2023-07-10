package Codewars;
//Mispelled, supposed to be age. To lazy to edit it.
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


//Just primitive testing of the method.
    public static void main(String[] args){
        System.out.println(nbYear(1000,2,50,1200));
    }
}
