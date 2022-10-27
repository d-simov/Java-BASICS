package p01Basics.NestedLoops;

import java.util.Scanner;

public class E04TrainTheTrainers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double totalAverage = 0;
        int counter = 0;

        while (!input.equals("Finish")) {
            double taskAverage = 0;
            counter++;

            for (int i = 0; i < n; i++) {
                double currentTask = Double.parseDouble(scanner.nextLine());
                taskAverage +=currentTask;
            }
            System.out.printf("%s - %.2f.%n", input, taskAverage / n);
            totalAverage += (taskAverage / n);
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.%n", totalAverage / counter);
    }
}
