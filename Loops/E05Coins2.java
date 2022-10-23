package p01Basics.WhileLoop;

import java.util.Scanner;

public class E05Coins2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        int coins = 0;
        double currentChange = change * 100;

        while (currentChange != 0) {
            if (currentChange >= 200) {
                currentChange -= 200;
                coins ++;
            } else if (currentChange >= 100) {
                currentChange -= 100;
                coins ++;
            } else if (currentChange >= 50) {
                currentChange -= 50;
                coins ++;
            } else if (currentChange >= 20) {
                currentChange -= 20;
                coins ++;
            } else if (currentChange >= 10) {
                currentChange -= 10;
                coins ++;
            } else if (currentChange >= 5) {
                currentChange -= 5;
                coins ++;
            } else if (currentChange >= 2) {
                currentChange -= 2;
                coins ++;
            } else if (currentChange >= 1) {
                currentChange -= 1;
                coins++;
            } else {
                break;
            }

        }
        System.out.println(coins);

    }
}
