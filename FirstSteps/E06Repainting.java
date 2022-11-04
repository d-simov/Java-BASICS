package FirstSteps;

import java.util.Scanner;

public class E06Repainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int paintDissolver = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double materials = ((nylon+2) * 1.5 + (paint * 1.1) * 14.5 + paintDissolver * 5 + 0.4);
        double work = (materials * 0.30) * hours;

        System.out.println(materials + work);
    }
}
