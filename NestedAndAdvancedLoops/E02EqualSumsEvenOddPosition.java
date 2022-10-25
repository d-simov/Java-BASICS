package p01Basics.NestedLoops;

import java.util.Scanner;

public class E02EqualSumsEvenOddPosition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());


        for (int currentNum = firstNum; currentNum <= secondNum; currentNum++) {
            int oddSum = 0;
            int evenSum = 0;
            int currentNumForCalc = currentNum;

            while (currentNumForCalc > 0) {
                int lastDigit = currentNumForCalc % 10;
                String textCurrentNum = "" + currentNumForCalc;

                if (textCurrentNum.length() % 2 == 0) {
                    evenSum += lastDigit;
                } else {
                    oddSum += lastDigit;
                }
                currentNumForCalc /= 10;
            }
            if (oddSum == evenSum) {
                System.out.print (currentNum + " ");
            }


        }
    }
}
