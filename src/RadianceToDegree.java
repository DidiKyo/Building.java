import java.util.Scanner;

public class RadianceToDegree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double radians = Double.parseDouble(scanner.nextLine());

        Double degrees = radians * 180 / Math.PI;

        System.out.printf("%.0f", degrees);

    }
}
