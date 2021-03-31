package whileLoop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int count = 1;
        int excluded = 0;
        double sum = 0;

        while (count <= 12){
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4){
                excluded++;
            }else {
                count++;
            }

            if (excluded > 1){

                break;
            }
            sum = sum + grade;
        }
        double avg = sum/12;

        if (excluded > 1){
            System.out.printf("%s has been excluded at %d grade", name, count);

        }else {
            System.out.printf("%s graduated. Average grade: %.2f", name, avg);
        }

    }
}
