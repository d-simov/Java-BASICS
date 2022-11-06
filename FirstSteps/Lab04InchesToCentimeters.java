package FirstSteps;

import java.util.Scanner;

public class Lab04InchesToCentimeters {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            Double inch = Double.parseDouble(input);

            Double cm = inch * 2.54;

            System.out.println(cm);
    }
}
