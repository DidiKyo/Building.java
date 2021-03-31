import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double length = Double.parseDouble(scanner.nextLine());
        Double width =  Double.parseDouble(scanner.nextLine());
        Double height =  Double.parseDouble(scanner.nextLine());
        Double persent = Double.parseDouble(scanner.nextLine());

        Double volume = length * width * height / 1000;
        Double neededLitres = volume - volume * persent / 100;


        System.out.printf("%.2f", neededLitres);



    }
}
