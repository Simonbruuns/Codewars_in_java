package Codewars;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        //minutes calculated
        int M = seconds / 60;
        //hours calculated
        int H = seconds / 3600;
        //Remaining seconds
        int RS = seconds % 60;
        int RM = M % 60;
      if (seconds < 60) {
            return seconds + (seconds == 1 ? " second" : " seconds");
        }
      else if (seconds >= 60 && seconds < 3600) {
            String MS = M + (M == 1 ? " minute" : " minutes");
            String RSS = RS + (RS == 1 ? " second" : " seconds");
            if(RS == 0)
                return MS;
            else
            return MS + " and " + RSS;
        }
      else if (seconds >= 3600) {
            //ternary conditional operators/shortere if statements.
          // Checking whether it should be plural or not.
            String HS = H + (H == 1 ? " hour" : " hours");
            String MS = RM + (RM == 1 ? " minute" : " minutes");
            String RSS = RS + (RS == 1 ? " second" : " seconds");
            if(RM == 0 && RS == 0)
                return HS;
            else
                return HS + ", " + MS + " and "+ RSS;
        } else if (seconds >=86400) {

          
      }
        return "now";
    }

    public static void main(String[] args){
        System.out.println(formatDuration(3788));
    }
}
