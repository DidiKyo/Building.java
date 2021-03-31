package ConditionalStatements;


import java.util.Scanner;

public class toyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double travelPrice = Double.parseDouble(scanner.nextLine());
        int puzzelsNumber = Integer.parseInt(scanner.nextLine());
        int dolsNumber = Integer.parseInt(scanner.nextLine());
        int bearsNumber = Integer.parseInt(scanner.nextLine());
        int minionsNumber = Integer.parseInt(scanner.nextLine());
        int trucksNumber = Integer.parseInt(scanner.nextLine());

       int toysNumber = puzzelsNumber + dolsNumber + bearsNumber + minionsNumber +trucksNumber;
       Double prize = puzzelsNumber * 2.6 + dolsNumber * 3.0 + bearsNumber * 4.1
               + minionsNumber * 8.2 + trucksNumber * 2.0;

       if (toysNumber >= 50) {
           prize = prize - prize * 0.25;
       }

       prize *= 0.9;
      // String output = "";

       if (travelPrice <= prize) {
           System.out.printf("Yes! %.2f lv left.", prize - travelPrice);
       } else {
           System.out.printf("Not enough money! %.2f lv needed.", travelPrice - prize);

       }


    }
}
