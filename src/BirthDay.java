import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallRent = Integer.parseInt(scanner.nextLine());

        //	Торта  – цената ѝ е 20% от наема на залата
        double cakePrize = hallRent * 0.20;


        //	Напитки – цената им е 45% по-малко от тази на тортата
        double drinksPrize = cakePrize - cakePrize * 0.45;

        //	Аниматор – цената му е 1/3 от цената за наема на залата
        double animatorPrize = hallRent / 3;

        double result = hallRent + cakePrize + drinksPrize + animatorPrize;
        System.out.println(result);

        }
    }

