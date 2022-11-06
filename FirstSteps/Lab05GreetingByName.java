package FirstSteps;

import java.util.Scanner;

public class Lab05GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.print("Hello, ");
        System.out.print(name);
        System.out.print("!");
    }
}
