package p01Basics.WhileLoop;

import java.util.Scanner;

public class E06Cake2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int cakeLengthSm = Integer.parseInt(scanner.nextLine());
        int cakeWidthSm = Integer.parseInt(scanner.nextLine());
        int allPiecesAvailable = cakeLengthSm * cakeWidthSm;
        int piecesEaten = 0;
        boolean isAllEaten = false;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int currentEaten = Integer.parseInt(input);
            piecesEaten += currentEaten;

            if (piecesEaten > allPiecesAvailable) {
                isAllEaten = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (isAllEaten) {
            System.out.printf("No more cake left! You need %d pieces more.", (piecesEaten - allPiecesAvailable));
        } else {
            System.out.printf("%d pieces are left.", allPiecesAvailable - piecesEaten);
        }

    }
}
