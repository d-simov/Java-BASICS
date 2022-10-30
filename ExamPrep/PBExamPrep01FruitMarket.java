package PB1021ExamPrep;

import java.util.Scanner;

public class PBExamPrep01FruitMarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceStrawb = Double.parseDouble(scanner.nextLine());
        double bananaKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double raspKg = Double.parseDouble(scanner.nextLine());
        double strawbKg = Double.parseDouble(scanner.nextLine());

        double priceRasp = priceStrawb / 2;
        double priceOrange = 0.6 * priceRasp;
        double priceBanana = 0.2 * priceRasp;

        System.out.printf("%.2f", priceStrawb * strawbKg + priceBanana * bananaKg + priceRasp * raspKg + priceOrange * orangeKg);
    }
}
