package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class invalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isInRange = false;

        if (number >= 100 && number <= 200 || number == 0){
            isInRange = true;
            System.out.println();

        }else if (!isInRange){
            System.out.println("invalid");
        }
    }
}
