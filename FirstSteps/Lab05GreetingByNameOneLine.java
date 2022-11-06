package FirstSteps;

import java.util.Scanner;

public class Lab05GreetingByNameOneLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

//        System.out.println("Hello, " + name + "!");
        System.out.printf("Hello, %s!", name);
    }
}
