package FirstSteps;

import java.util.Scanner;

public class E07FoodDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int poultryMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegeMenu = Integer.parseInt(scanner.nextLine());

        System.out.println((poultryMenu * 10.35 + fishMenu * 12.4 + vegeMenu * 8.15) * 1.2 + 2.50);


    }
}
