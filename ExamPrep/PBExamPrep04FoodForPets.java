package PB1021ExamPrep;

import java.util.Scanner;

public class PBExamPrep04FoodForPets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysNum = Integer.parseInt(scanner.nextLine());
        double foodQuantity = Double.parseDouble(scanner.nextLine());

        double totalDogFood = 0;
        double totalCatFood = 0;
        double totalFoodEaten = 0;
        double bisquitsQuantity = 0;

        for (int i = 1; i <= daysNum ; i++) {
            int dogPerDay = Integer.parseInt(scanner.nextLine());
            int catPerDay = Integer.parseInt(scanner.nextLine());
            totalDogFood = totalDogFood + dogPerDay;
            totalCatFood = totalCatFood + catPerDay;
            totalFoodEaten = totalFoodEaten + dogPerDay + catPerDay;
            if (i % 3 == 0) {
                bisquitsQuantity = bisquitsQuantity + (dogPerDay + catPerDay) * 0.1;
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n", bisquitsQuantity);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalFoodEaten / foodQuantity * 100.0);
        System.out.printf("%.2f%% eaten from the dog.%n", totalDogFood / totalFoodEaten * 100.0);
        System.out.printf("%.2f%% eaten from the cat.%n", totalCatFood / totalFoodEaten * 100.0);

    }

}
