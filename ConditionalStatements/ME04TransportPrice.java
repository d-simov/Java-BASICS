package ConditionalStatements;

import java.util.Scanner;

public class ME04TransportPrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        double priceTaxi = 0;

        if (time.equals("day")) {
            priceTaxi = 0.79;
        } else if (time.equals("night")) {
            priceTaxi = 0.90;
        }
        if (kilometers < 20) {
            System.out.printf("%.2f", kilometers * priceTaxi + 0.7);
        } else if (kilometers < 100) {
            System.out.printf("%.2f", kilometers * 0.09);
        } else {
            System.out.printf("%.2f", kilometers * 0.06);
        }

    }
}
