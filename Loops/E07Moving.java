package p01Basics.WhileLoop;

import java.util.Scanner;

public class E07Moving {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int roomLengthM = Integer.parseInt(scanner.nextLine());
        int roomWidthM = Integer.parseInt(scanner.nextLine());
        int roomHeightM = Integer.parseInt(scanner.nextLine());
        int freeSpaceAvailable = roomLengthM * roomWidthM * roomHeightM;
        int spaceOccupied = 0;
        boolean isAllFull = false;

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int currentBoxes = Integer.parseInt(input);
           spaceOccupied += currentBoxes;

            if (spaceOccupied > freeSpaceAvailable) {
                isAllFull = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (isAllFull) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(spaceOccupied - freeSpaceAvailable));
        } else {
            System.out.printf("%d Cubic meters left.", Math.abs(spaceOccupied - freeSpaceAvailable));
        }

    }
}
