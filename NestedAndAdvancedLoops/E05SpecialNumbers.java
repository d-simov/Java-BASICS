package p01Basics.NestedLoops;

import java.util.Scanner;

public class E05SpecialNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999 ; i++) {

            String number = ("" + i);
            boolean isSpecial = true;
            for (int j = 0; j < number.length(); j++) {

                int digit = Integer.parseInt("" + number.charAt(j));
                if (digit == 0) {
                    isSpecial = false;
                    break;
                }
                if (n % digit != 0) {
                    isSpecial = false;
                    break;
                }
            }
            if (isSpecial) {
                System.out.print(number + " ");
            }
            
        }
    }
}
