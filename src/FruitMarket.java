import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     //   1.	Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
      //  2.	Количеството бананите в килограми – реално число в интервала [0.00 … 10000.00]
      //  3.	Количеството портокалите в килограми – реално число в интервала [0.00 … 10000.00]
      //  4.	Количеството малините в килограми – реално число в интервала [0.00 … 10000.00]
      //  5.	Количеството ягодите в килограми – реално число в интервала [0.00 … 10000.00]
        Double strawberriesPrize = Double.parseDouble(scanner.nextLine());
        Double bananas = Double.parseDouble(scanner.nextLine());
        Double oranges = Double.parseDouble(scanner.nextLine());
        Double raspberries = Double.parseDouble(scanner.nextLine());
        Double strawberries = Double.parseDouble(scanner.nextLine());

        Double raspberriesPrize = strawberriesPrize / 2;
        Double orangesPrize = raspberriesPrize - raspberriesPrize * 0.40;
        Double bananasPrize = raspberriesPrize - raspberriesPrize* 0.80;

        Double result = raspberries * raspberriesPrize + oranges * orangesPrize +
                bananas *   bananasPrize + strawberries * strawberriesPrize;

        System.out.printf("%.2f", result);








    }
}
