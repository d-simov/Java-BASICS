package PBPreliminaryExamOcrober21;

import java.util.Scanner;

public class PremExamOct04ComputerFirm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int compModelsNum = Integer.parseInt(scanner.nextLine());
        double totalRating = 0;
        double totalSales = 0;

        for (int i = 0; i < compModelsNum; i++) {
            int salesRatingNum = Integer.parseInt(scanner.nextLine());
            int rating = salesRatingNum % 10;
            int salesPossible = salesRatingNum / 10;
            double currentSales = 0;
            switch (rating) {
                case (2):
                    currentSales = 0 * salesPossible;
                    break;
                case (3):
                    currentSales = 0.5 * salesPossible;
                    break;
                case (4):
                    currentSales = 0.7 * salesPossible;
                    break;
                case (5):
                    currentSales = 0.85 * salesPossible;
                    break;
                case (6):
                    currentSales = salesPossible;
                    break;
            }
            totalRating = totalRating + rating;
            totalSales = totalSales + currentSales;
        }
        System.out.printf("%.2f%n", totalSales);
        System.out.printf("%.2f%n", totalRating / compModelsNum);

    }
}
