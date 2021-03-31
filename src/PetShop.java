import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfDogs = Integer.parseInt(scanner.nextLine());
        int numberOfOther = Integer.parseInt(scanner.nextLine());

        double total = 2.50 * numberOfDogs + 4 * numberOfOther;

        System.out.println(total + "lv.");

    }
}
