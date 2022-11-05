package FirstSteps;

import java.util.Scanner;

public class E08BasketballEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());
        double sneakers = tax * 0.6;
        double suit = sneakers * 0.8;
        double ball = suit / 4;
        double accessoaries = ball / 5;

        System.out.println(tax + sneakers + suit + ball + accessoaries);
    }
}
