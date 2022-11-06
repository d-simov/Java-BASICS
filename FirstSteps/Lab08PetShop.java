package FirstSteps;

import java.util.Scanner;

public class Lab08PetShop {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int countDogs = Integer.parseInt(scan.nextLine());
        int countCats = Integer.parseInt(scan.nextLine());

        double TotalPrice = countDogs * 2.5 + countCats * 4;

        System.out.printf("%.1f lv.",TotalPrice);
    }
}
