package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class newHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double result = 0.0;

        switch (flowers) {
            case "Roses":
                if (quantity >= 10 && quantity <= 80) {
                    result = quantity * 5;

                } else if (quantity > 80 && quantity <=1000){
                    result = (quantity * 5) * 0.90;
                }
                break;
            case "Dahlias":
                if (quantity >= 10 && quantity <= 90) {
                    result = quantity * 3.80;

                } else if (quantity > 90 && quantity <=1000) {
                    result = (quantity * 3.80) * 0.85;
                }
                break;
            case "Tulips":

                if (quantity >= 10 && quantity <= 80) {
                    result = quantity * 2.80;

                } else if (quantity > 80 && quantity <=1000) {
                    result = (quantity * 2.80) * 0.85;
                }
                break;
            case "Narcissus":

                if (quantity >= 10 && quantity < 120) {
                    result = (quantity * 3) * 1.15;

                } else if (quantity >= 120 && quantity <=1000) {
                    result = quantity * 3;
                }
                break;
            case "Gladiolus":
                if (quantity >= 10 && quantity < 80) {
                    result = (quantity * 2.50) * 1.20;
                } else if (quantity >= 80 && quantity <=1000) {
                    result = quantity * 2.50;
                    break;
                }


        }


        if ( budget >= result ) {
            double leftMoney = budget - result;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    quantity, flowers, leftMoney);

        } else {
            double neededMoney = result - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", neededMoney );
        }
    }
}
