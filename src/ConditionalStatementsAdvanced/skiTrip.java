package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class skiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String feedbag = scanner.nextLine();

        double result = 0;
        int nights = days - 1;

        if (type.equals("room for one person")){
            result = 18 * nights;

        } else if (type.equals("apartment")){
            result = 25 * nights;
            if (days < 10){
                result = result * 0.70;
            } else if (days < 15){
                result = result * 0.65;
            } else if (days > 15){
                result = result * 0.50;

            }

        } else if (type.equals("president apartment")){
            result = 35 * nights;
            if (days < 10){
                result = result * 0.90;
            } else if (days < 15){
                result = result * 0.85;
            } else if (days > 15){
                result = result * 0.80;
            }
        }
      if (feedbag.equals("positive")){
          result = result * 1.25;
      } else {
          result = result * 0.90;
      }
      System.out.printf("%.2f", result);

    }
}
