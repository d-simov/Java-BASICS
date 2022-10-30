package PB1021ExamPrep;

import java.util.Scanner;

public class PBExamPrep02FamilyTrip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vacationBudget = Double.parseDouble(scanner.nextLine());
        int nightsSpent = Integer.parseInt(scanner.nextLine());
        double hotelPrice = Double.parseDouble(scanner.nextLine());
        int addSpendings = Integer.parseInt(scanner.nextLine());

        if (nightsSpent > 7) {
            hotelPrice = 0.95 * hotelPrice;
        }

        double realExpenditures = (nightsSpent * hotelPrice) + ((addSpendings * vacationBudget) / 100);

        if (vacationBudget >= realExpenditures) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", vacationBudget - realExpenditures);
        } else {
            System.out.printf("%.2f leva needed.", realExpenditures - vacationBudget);
        }
    }
}
