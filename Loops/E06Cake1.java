package p01Basics.WhileLoop;

import java.util.Scanner;

public class E06Cake1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cakeLengthSm = Integer.parseInt(scanner.nextLine());
        int cakeWidthSm = Integer.parseInt(scanner.nextLine());
        int piecesEaten = 0;
        boolean isAllEaten = true;

        while ((cakeLengthSm * cakeWidthSm) > piecesEaten) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                isAllEaten = false;
                break;
            }
            int currentPieces = Integer.parseInt(input);
            piecesEaten += currentPieces;

        }
        if (isAllEaten) {
            System.out.printf("No more cake left! You need %d pieces more.", (piecesEaten - (cakeLengthSm * cakeWidthSm)));
        }
        if (!isAllEaten) {
            System.out.printf("%d pieces are left.", cakeLengthSm * cakeWidthSm - piecesEaten);
        }

    }
}
