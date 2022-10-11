package ConditionalStatements;

import java.util.Scanner;

public class Lab07AreaOfFigures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Моля, въведете вида на фигурата:");
        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            System.out.println("Моля, въведете дължина на страната на квадрата:");
            double squareSide = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", squareSide * squareSide);
        }
        if (figure.equals("rectangle")) {
            System.out.println("Моля, въведете дължина на страна A:");
            double sideA = Double.parseDouble(scanner.nextLine());
            System.out.println("Моля, въведете дължина на страна B:");
            double sideB = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", sideA * sideB);
        }
        if (figure.equals("circle")) {
            System.out.println("Моля, въведете дължината на радиуса на кръга:");
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", radius * radius * Math.PI);
        }
        if (figure.equals("triangle")) {
            System.out.println("Моля, въведете дължина на страната на триъгълника:");
            double side = Double.parseDouble(scanner.nextLine());
            System.out.println("Моля, въведете дължина на височината към тази страна:");
            double height = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (side * height) / 2);
        }
    }
}
