package ForLoop;

import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (i % 2 != 0){
                oddSum += num;
            }else {
                evenSum += num;

            }
            
        }
        if (oddSum == evenSum){
            System.out.println("Yes");
            System.out.printf("Sum = %d", oddSum);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(oddSum - evenSum) );
        }
    }
}
