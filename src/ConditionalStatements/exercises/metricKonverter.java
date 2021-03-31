package ConditionalStatements.exercises;

import java.util.Scanner;

public class metricKonverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String measure = scanner.nextLine();
        String changedMeasure = scanner.nextLine();

        if (measure.equals("mm")) {
            number = number / 1000;

        } else if (measure.equals("cm")) {
            number = number / 100;
        } else if (measure.equals("m")) {
            number = number;

        }
        if (changedMeasure.equals("mm")) {
            number = number * 1000;

        } else if (changedMeasure.equals("cm")) {
            number = number * 100;
        } else if (changedMeasure.equals("m")) {
            number = number * 1;

        }
        System.out.printf("%.3f", number);
    }
}
