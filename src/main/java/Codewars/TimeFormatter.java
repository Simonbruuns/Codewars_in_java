package Codewars;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        // Calculate the number of years, days, and remaining seconds
        int year = seconds / 31536000;  // 365 * 24 * 60 * 60
        int remainingSecondsInYear = seconds % 31536000;

        // Calculate the number of days and remaining seconds in a day
        int day = remainingSecondsInYear / 86400;
        int remainingSecondsInDay = remainingSecondsInYear % 86400;

        // Calculate hours, minutes, and seconds
        int H = remainingSecondsInDay / 3600;
        int M = (remainingSecondsInDay % 3600) / 60;
        int RS = remainingSecondsInDay % 60;

        // Ternary conditional operators/shorter if statements.
        // Checking whether it should be plural or not.
        String YS = year + (year == 1 ? " year" : " years");
        String DS = day + (day == 1 ? " day" : (day > 0 ? " days" : ""));
        String RHS = H + (H == 1 ? " hour" : (H > 0 ? " hours" : ""));
        String MS = M + (M == 1 ? " minute" : (M > 0 ? " minutes" : ""));
        String RSS = RS + (RS == 1 ? " second" : (RS > 0 ? " seconds" : ""));

        // Construct the result list
        List<String> components = new ArrayList<>();
        if (year > 0) {
            components.add(YS);
        }
        if (day > 0) {
            components.add(DS);
        }
        if (H > 0) {
            components.add(RHS);
        }
        if (M > 0) {
            components.add(MS);
        }
        if (RS > 0) {
            components.add(RSS);
        }

        // Handle "now" case
        if (components.isEmpty()) {
            return "now";
        }

        // Join the components with commas and "and" as needed
        String result = String.join(", ", components.subList(0, components.size() - 1))
                + (components.size() > 1 ? " and " : "")
                + components.get(components.size() - 1);

        return result;
    }
    public static void main(String[] args){
        System.out.println(formatDuration(86400120));
    }
}
