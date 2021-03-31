package whileLoop;

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (true){
            int num = Integer.parseInt(scanner.nextLine());
            sum = sum + num;

            if (sum >= initialNum){
                break;
            }

        }
        System.out.println(sum);
    }
}
