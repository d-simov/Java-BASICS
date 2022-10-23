package p01Basics.WhileLoop;

import java.util.Scanner;

public class E03Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double currentAmount = Double.parseDouble(scanner.nextLine());
        int days = 0;
        boolean spendTooMuch = false;
        int spendingsInARow = 0;

        while (currentAmount < neededMoney) {

            if (spendingsInARow == 5) {
                spendTooMuch = true;
                break;
            }
            String actionType = scanner.nextLine();
            double nextAmount = Double.parseDouble(scanner.nextLine());

            if (actionType.equals("spend")) {
                spendingsInARow ++;
                currentAmount -= nextAmount;
                if (currentAmount < 0) {
                    currentAmount = 0;
                }
            }
            if (actionType.equals("save")) {
                spendingsInARow = 0;
                currentAmount += nextAmount;
            }
            days ++;
        }
        if (spendTooMuch) {
            System.out.printf("You can't save the money.%n%d", days);
        }
        if (!spendTooMuch) {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
