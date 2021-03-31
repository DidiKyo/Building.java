package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberNights = Integer.parseInt(scanner.nextLine());

        double sumPriceApartment = 0.0;
        double sumPriceStudio = 0.0;

        if (month.equals("May") || month.equals("October")) {
            sumPriceStudio = numberNights * 50;
            sumPriceApartment = numberNights * 65;
            if (numberNights > 7 && numberNights <= 14) {
                sumPriceStudio = sumPriceStudio * 0.95;
            } else if (numberNights > 14) {
                sumPriceStudio = sumPriceStudio * 0.70;
                sumPriceApartment = sumPriceApartment * 0.9;
            }
        } else if (month.equals("June") || month.equals("September")) {
            sumPriceStudio = numberNights * 75.20;
            sumPriceApartment = numberNights * 68.70;
            if (numberNights > 14) {
                sumPriceStudio = sumPriceStudio * 0.8;
                sumPriceApartment = sumPriceApartment * 0.9;
            }
        } else if (month.equals("July") || month.equals("August")) {
            sumPriceStudio = numberNights * 76;
            sumPriceApartment = numberNights * 77;
            if (numberNights > 14) {
                sumPriceApartment = sumPriceApartment * 0.9;
            }
        }
        System.out.printf( "Apartment: %.2f lv.%n" , sumPriceApartment );
        System.out.printf("Studio: %.2f lv.", sumPriceStudio);
            }
        }




