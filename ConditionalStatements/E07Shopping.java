package ConditionalStatements;

import java.util.Scanner;

public class E07Shopping {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoNum = Integer.parseInt(scanner.nextLine());
        int procNum = Integer.parseInt(scanner.nextLine());
        int ramNum = Integer.parseInt(scanner.nextLine());

        double finalPrice = videoNum * 250 + (videoNum * 250) * 0.35 * procNum + (videoNum * 250) * 0.1 * ramNum;

        if (videoNum > procNum) {
            finalPrice = finalPrice * 0.85;
        }
        if (budget >= finalPrice) {
            System.out.printf("You have %.2f leva left!", budget - finalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", finalPrice - budget);
        }


    }
}
