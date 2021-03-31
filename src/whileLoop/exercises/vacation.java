package whileLoop.exercises;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int spendDays = 0;
        boolean isFailed = false;
        int days = 0;

        while (money < excursionPrice){
            days++;
            String command = scanner.nextLine();
            double currentMoney = Double.parseDouble(scanner.nextLine());

            switch (command) {
                case "spend":
                    money -= currentMoney;
                    spendDays++;
                    if (money < 0){
                        money = 0;
                    }
                    break;
                case "save":
                    money += currentMoney;
                    spendDays = 0;
                    break;
            }
            if (spendDays == 5){
                isFailed = true;
                break;
            }
        }
        if (isFailed){
            System.out.printf("You can't save the money.%n"+
                    "%d", days);

        }else {
            System.out.printf("You saved the money for %d days.", days);

        }
    }
}
