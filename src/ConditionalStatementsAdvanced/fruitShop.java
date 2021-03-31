package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double result = 0.0;
        if (day.equals("Monday") ||
        day.equals("Tuesday") ||
        day.equals("Wednesday") ||
        day.equals("Thursday") ||
        day.equals("Friday")) {
            if (fruit.equals("banana")){
                result = 2.50 * quantity;
            } else if (fruit.equals("apple")) {
                result = 1.20 * quantity;
            }else if (fruit.equals("orange")) {
                result = 0.85 * quantity;
            }else if (fruit.equals("grapefruit")){
                result = 1.45 * quantity;
            }else if (fruit.equals("kiwi")) {
                result = 2.70 * quantity;
            }else if (fruit.equals("pineapple")){
                result = 5.50 * quantity;
            }else if (fruit.equals("grapes")) {
                result = 3.85 * quantity;
            }else {
                System.out.println("error");
            }
            if (result > 0){
                System.out.printf("%.2f", result);
            }

        } else if (day.equals("Saturday") ||
        day.equals("Sunday")) {
            if (fruit.equals("banana")){
                result = 2.70 * quantity;
            } else if (fruit.equals("apple")) {
                result = 1.25 * quantity;
            }else if (fruit.equals("orange")) {
                result = 0.90 * quantity;
            }else if (fruit.equals("grapefruit")) {
                result = 1.60 * quantity;
            }else if (fruit.equals("kiwi")) {
                result = 3.00 * quantity;
            }else if (fruit.equals("pineapple")) {
                result = 5.60 * quantity;
            }else if (fruit.equals("grapes")) {
                result = 4.20 * quantity;
            } else {
                System.out.println("error");
            }
            if (result > 0){
               System.out.printf("%.2f", result);
            }

        } else {
            System.out.println("error");
        }

        }

    }


