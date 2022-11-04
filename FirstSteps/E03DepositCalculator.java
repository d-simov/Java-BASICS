package FirstSteps;

import java.util.Scanner;

public class E03DepositCalculator {

    public static void main (String [] args) {

        Scanner scanner = new Scanner (System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());

        double sum = depositSum + term * (( interest /100 / 12) * depositSum);

        System.out.println(sum);
    }
}
