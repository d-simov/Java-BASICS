package FirstSteps;

import java.util.Scanner;

public class Lab03SquareArea {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //"10"

        int a = Integer.parseInt(input); //10

        String input2 = scanner.nextLine(); //"10"

        int b = Integer.parseInt(input2);

        int area = a * b;

        System.out.println(area);
    }
}
