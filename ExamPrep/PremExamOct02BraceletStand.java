package PBPreliminaryExamOcrober21;

import java.util.Scanner;

public class PremExamOct02BraceletStand {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pocketMoneyPerDay = Double.parseDouble(scanner.nextLine());
        double incomePerDay = Double.parseDouble(scanner.nextLine());
        double expencesTotal = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double pocketMoneyTotal = 5 * pocketMoneyPerDay;
        double incomeTotal = 5 * incomePerDay;
        double totalMoney = pocketMoneyTotal + incomeTotal - expencesTotal;

        if (totalMoney >= giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", totalMoney);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", Math.abs(totalMoney - giftPrice));
        }

    }
}
