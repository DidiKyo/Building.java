package ForLoop.exercises;

import java.util.Scanner;

public class histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        double result1 = 0;
        double result2 = 0;
        double result3 = 0;
        double result4 = 0;
        double result5 = 0;

        for (int i = 1; i <= n; i++) {
            double number = Integer.parseInt(scanner.nextLine());

            if (number < 200){
                 p1++;
                result1 = p1 / n * 100;
            }else if (number >= 200 && number < 400){
                 p2++;
                result2 = p2 / n * 100;
            }else if (number >= 400 && number < 600){
                 p3++;
                result3 = p3 / n * 100;
            }else if (number>= 600 && number < 800){
                 p4++;
                result4 = p4 / n * 100;
            }else {
                 p5++;
                result5 = p5 / n * 100;
            }
        }
        System.out.printf("%.2f%%%n", result1);
        System.out.printf("%.2f%%%n", result2);
        System.out.printf("%.2f%%%n", result3);
        System.out.printf("%.2f%%%n", result4);
        System.out.printf("%.2f%%", result5);


    }
}
