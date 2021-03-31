import java.util.Scanner;

public class InchesSantimeters {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Double inches = Double.parseDouble(scaner.nextLine());
        double centimeters = inches * 2.54;
        System.out.println(centimeters);
    }
}
