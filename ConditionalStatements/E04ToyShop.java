package ConditionalStatements;

import java.util.Scanner;

public class E04ToyShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tripCash = Double.parseDouble(scanner.nextLine());
        int puzzleNum = Integer.parseInt(scanner.nextLine());
        int dollNum = Integer.parseInt(scanner.nextLine());
        int teddyNum = Integer.parseInt(scanner.nextLine());
        int minionNum = Integer.parseInt(scanner.nextLine());
        int truckNum = Integer.parseInt(scanner.nextLine());

        double sum = puzzleNum * 2.6 + dollNum * 3 + teddyNum * 4.1 + minionNum * 8.2 + truckNum * 2;
        double amount = 0;

        if ((puzzleNum + dollNum + teddyNum + minionNum + truckNum) < 50) {
            amount = sum * 0.9;
        } else {
            amount = sum * 0.75 * 0.9;
        }

        if (amount >= tripCash) {
            System.out.printf("Yes! %.2f lv left.", amount - tripCash);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", tripCash - amount);
        }


    }
}
