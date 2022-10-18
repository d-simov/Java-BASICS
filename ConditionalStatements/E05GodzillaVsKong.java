package ConditionalStatements;

import java.util.Scanner;

public class E05GodzillaVsKong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesSinglePrice = Double.parseDouble(scanner.nextLine());

        double decor  = 0.1 * budget;
        double filmExpences = 0;

        if (statists <= 150) {
            filmExpences = statists * clothesSinglePrice + decor;
        } else {
            filmExpences = (statists * clothesSinglePrice) * 0.9 + decor;
        }

        if (filmExpences > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", filmExpences - budget);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - filmExpences);
        }

    }
}
