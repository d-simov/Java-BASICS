package p01Basics.NestedLoops;

import java.util.Scanner;

public class E03SumPrimeNonPrime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int primeNumberSum = 0;
        int nonPrimeNumberSum = 0;

        while (!input.equals("stop")) {

            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumberSum += number;
            }
            if (!isPrime) {
                nonPrimeNumberSum += number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeNumberSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeNumberSum);
    }
}
