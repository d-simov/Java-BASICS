package p01Basics.WhileLoop;

import java.util.Scanner;

public class ALab06MaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();
        int maxNum = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (number > maxNum) {
                maxNum = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(maxNum);
    }
}
