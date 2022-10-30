package PB1021ExamPrep;

import java.util.Scanner;

public class PBExamPrep03MovieDestination {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double dayPrice = 0;

        if (season.equals("Winter")) {
            switch (destination) {
                case ("Dubai"):
                    dayPrice = 45000;
                    break;
                case ("Sofia"):
                    dayPrice = 17000;
                    break;
                case ("London"):
                    dayPrice = 24000;
                    break;
            }
        } else if (season.equals("Summer")) {
            switch (destination) {
                case ("Dubai"):
                    dayPrice = 40000;
                    break;
                case ("Sofia"):
                    dayPrice = 12500;
                    break;
                case ("London"):
                    dayPrice = 20250;
                    break;
            }

        }
        double movieAmount = days * dayPrice;

        switch (destination) {
            case ("Dubai"):
                movieAmount = movieAmount * 0.7;
                break;
            case ("Sofia"):
                movieAmount = movieAmount * 1.25;
                break;
        }
        double sumDifference = Math.abs(filmBudget - movieAmount);

        if (filmBudget >= movieAmount) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", sumDifference);
        } else {
            System.out.printf("The director needs %.2f leva more!", sumDifference);
        }

    }
}
