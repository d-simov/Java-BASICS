package p01Basics.NestedLoops;

import java.util.Scanner;

public class ALab06Building {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int floorNum = Integer.parseInt(scanner.nextLine());
        int roomNum = Integer.parseInt(scanner.nextLine());

        for (int i = floorNum; i > 0 ; i--) {
            for (int j = 0; j < roomNum; j++) {

                if (i == floorNum) {
                    System.out.printf("L%d%d ", i, j);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                } else if (i % 2 != 0)  {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.println();
        }
    }
}
