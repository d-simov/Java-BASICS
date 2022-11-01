package PBPreliminaryExamOcrober21;

import java.util.Scanner;

public class PremExamOct03CourierExpress {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double packageWeight = Double.parseDouble(scanner.nextLine());
        String deliveryType = scanner.nextLine();
        int distanceKm = Integer.parseInt(scanner.nextLine());

        double pricePerKm = 0;
        double extraPricePerKg = 0;

        if (deliveryType.equals("standard")) {
            if (packageWeight < 1) {
                pricePerKm = 0.03;
            } else if (packageWeight < 10) {
                pricePerKm = 0.05;
            }else if (packageWeight < 40) {
                pricePerKm = 0.1;
            }else if (packageWeight < 90) {
                pricePerKm = 0.15;
            } else {
                pricePerKm = 0.2;
            }
        }

        if (deliveryType.equals("express")) {
            if (packageWeight < 1) {
                pricePerKm = 0.03;
                extraPricePerKg = 0.03 * 0.8;
            } else if (packageWeight < 10) {
                pricePerKm = 0.05;
                extraPricePerKg = 0.05 * 0.4;
            }else if (packageWeight < 40) {
                pricePerKm = 0.1;
                extraPricePerKg = 0.1 * 0.05;
            }else if (packageWeight < 90) {
                pricePerKm = 0.15;
                extraPricePerKg = 0.15 * 0.02;
            } else {
                pricePerKm = 0.2;
                extraPricePerKg = 0.2 * 0.01;
            }
        }
        double totalPrice = pricePerKm * distanceKm + (extraPricePerKg * packageWeight) * distanceKm;

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", packageWeight, totalPrice);

    }
}
