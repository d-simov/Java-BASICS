package p01Basics.NestedLoops;

import java.util.Scanner;

public class E01NumberPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        boolean ready = false;

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                if (number > n) {
                    ready = true;
                    break;
                }
                System.out.print(number + " ");
                number++;

            }
            System.out.println();
            if (ready) break;
        }
    }
}
