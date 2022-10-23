package p01Basics.WhileLoop;

import java.util.Scanner;

public class E04Walking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalSteps = 0;
        int currentSteps = 0;

        while (!input.equals("Going home")) {

            currentSteps = Integer.parseInt(input);
            totalSteps += currentSteps;
            if (totalSteps >= 10000) break;

            input = scanner.nextLine();
        }
        if (input.equals("Going home")) {
            currentSteps = Integer.parseInt(scanner.nextLine());
            totalSteps += currentSteps;
        }
        int stepsDifference = 10000 - totalSteps;

        if (totalSteps >= 10000) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", Math.abs(stepsDifference));
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(stepsDifference));
        }
    }
}
