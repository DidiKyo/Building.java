package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class tradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double result = 0;

        if (city.equals("Sofia")) {
            if (quantity >= 0 && quantity <= 500) {
                result = quantity * 0.05;
            } else if (quantity > 500 && quantity <= 1000) {
                result = quantity * 0.07;
            } else if (quantity > 1000 && quantity <= 10000) {
                result = quantity * 0.08;
            } else if (quantity > 10000) {
                result = quantity * 0.12;
            } else {
                System.out.println("error");
            }

        } else if (city.equals("Varna")) {
            if (quantity >= 0 && quantity <= 500) {
                result = quantity * 0.045;
            } else if (quantity > 500 && quantity <= 1000) {
                result = quantity * 0.075;
            } else if (quantity > 1000 && quantity <= 10000) {
                result = quantity * 0.10;
            } else if (quantity > 10000) {
                result = quantity * 0.13;
            } else {
                System.out.println("error");
            }

        } else if (city.equals("Plovdiv")) {
            if (quantity >= 0 && quantity <= 500) {
                result = quantity * 0.055;
            } else if (quantity > 500 && quantity <= 1000) {
                result = quantity * 0.08;
            } else if (quantity > 1000 && quantity <= 10000) {
                result = quantity * 0.12;
            } else if (quantity > 10000) {
                result = quantity * 0.145;
            } else {
                System.out.println("error");
            }

        } else {
            if (quantity < 0) {
                System.out.println("error");
            }

        }
        System.out.printf("%.2f", result);
    }
}

