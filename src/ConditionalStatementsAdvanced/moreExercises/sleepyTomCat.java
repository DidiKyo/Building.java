package ConditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class sleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());


        int yearDays = 365;
        int workingDays = yearDays - daysOff;
        double playTime = (workingDays * 63) + (daysOff * 127);
        double difference = Math.abs(30000 - playTime);
        double hours = difference / 60;
        double minutes = difference % 60;


        if (30000 > playTime){
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", hours, minutes);

        }else {
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", hours, minutes);

        }


    }
}
