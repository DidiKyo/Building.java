package ConditionalStatements.exercises;

import java.util.Scanner;

public class scholarShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double income = Double.parseDouble(scanner.nextLine());
        Double averageGrade = Double.parseDouble(scanner.nextLine());
        Double minSalary = Double.parseDouble(scanner.nextLine());

        Double socialScholarShip = 0.0;
        Double excellentScholarShip = 0.0;

        if (income < minSalary) {

            if (averageGrade >= 4.5) {
                socialScholarShip = Math.floor(minSalary * 0.35);

            }
        }
        if (averageGrade >= 5.5) {
            excellentScholarShip = Math.floor(averageGrade * 25);
        }

        boolean isSocial = false;

        if (socialScholarShip != 0) {
            if (socialScholarShip > excellentScholarShip) {
                isSocial = true;
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarShip));

            }
        }
        if (excellentScholarShip != 0) {
            if (!isSocial) {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentScholarShip));
            }

        }
        if (socialScholarShip == 0){
            if (excellentScholarShip == 0){
                System.out.println("You cannot get a scholarship!");
            }
        }
    }
}