package AdditionalPractice;

import java.util.Scanner;

public class Shortcuts {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int counter = 0;
    int totalCases = 0;
    double capacity = Double.parseDouble(scanner.nextLine());

    String input = scanner.nextLine();
    while (!input.equals("End")) {
        double nextBag = Double.parseDouble(input);
        counter++;

        if (counter == 3) {
            counter = 0;
            nextBag = nextBag + nextBag * 0.10;
        }

        if (capacity < nextBag) {

            System.out.printf("No more space!%nStatistic: %d suitcases loaded", totalCases);
        } else {
            capacity = capacity - nextBag;
            totalCases++;
        }

        input = scanner.nextLine();

    }
    System.out.printf("Congratulations! All suitcases are loaded!%nStatistic: %d suitcases loaded.", totalCases);


}

}
