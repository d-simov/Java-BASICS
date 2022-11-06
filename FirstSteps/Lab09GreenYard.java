package FirstSteps;

import java.util.Scanner;

public class Lab09GreenYard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double singlePrice = Double.parseDouble(scanner.nextLine());

        Double totalPrice = singlePrice * 7.61;
        Double discount = totalPrice * 0.18;
        Double finalPrice = totalPrice - discount;
//        System.out.println("The final price is: " + finalPrice + " lv.");
//        System.out.println("The discount is: " + discount + " lv.");

//        System.out.printf("The final price is: %.2f lv. %n", finalPrice);
//        System.out.printf("The discount is: %.2f lv.", discount);
        System.out.printf("The final price is: %.2f lv.%nThe discount is: %.2f lv.", finalPrice, discount);

    }
}
