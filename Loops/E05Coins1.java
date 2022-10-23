package p01Basics.WhileLoop;

import java.util.Scanner;

public class E05Coins1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        int coins = 0;
        int currentChange = (int) (change * 100);

            coins = coins + currentChange / 200;
            currentChange = currentChange % 200;
            coins = coins + currentChange / 100;
            currentChange = currentChange % 100;
            coins = coins + currentChange / 50;
            currentChange = currentChange % 50;
            coins = coins + currentChange / 20;
            currentChange = currentChange % 20;
            coins = coins + currentChange / 10;
            currentChange = currentChange % 10;
            coins = coins + currentChange / 5;
            currentChange = currentChange % 5;
            coins = coins + currentChange / 2;
            currentChange = currentChange % 2;
            coins = coins + currentChange;


        System.out.println(coins);
    }
}
