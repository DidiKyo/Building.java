package ConditionalStatements.exercises;

import java.util.Scanner;

public class worldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double record = Double.parseDouble(scanner.nextLine());
        Double distance = Double.parseDouble(scanner.nextLine());
        Double timePerMeter = Double.parseDouble(scanner.nextLine());

        Double lag = Math.floor( distance / 15) * 12.5;
        Double time = distance * timePerMeter + lag;

        if (time < record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        } else {
            System.out.printf( "No, he failed! He was %.2f seconds slower.", time - record);

        }




    }
}
