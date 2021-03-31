package examPreparation;

import java.util.Scanner;

public class cinemaVaucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vaucherPrice = Integer.parseInt(scanner.nextLine());

        String purchase = scanner.nextLine();

        int tickets = 0;
        int others = 0;

        while (!purchase.equals("End")){

            if (purchase.length() > 8){
                int ticketPrice = purchase.charAt(0) + purchase.charAt(1);
                if (ticketPrice <= vaucherPrice){
                    vaucherPrice -= ticketPrice;
                tickets++;
                }else {
                    break;
                }

            }else {
                int price = purchase.charAt(0);
                if (price <= vaucherPrice){
                    vaucherPrice -= price;
                others++;
                } else {
                    break;
                }
            }
            purchase = scanner.nextLine();
        }
        System.out.println(tickets);
        System.out.println(others);


    }
}
