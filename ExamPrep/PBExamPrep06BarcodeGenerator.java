package PB1021ExamPrep;

import java.util.Scanner;

public class PBExamPrep06BarcodeGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstBarcode = Integer.parseInt(scanner.nextLine());
        int lastBarcode = Integer.parseInt(scanner.nextLine());
        int currentBarcode = 0;
        boolean isEven = false;

        for (currentBarcode = firstBarcode; currentBarcode <= lastBarcode; currentBarcode++) {
            String currentNum = "" + currentBarcode;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (currentDigit % 2 == 0) {
                    isEven = true;
                    break;
                }
                if (!isEven) {
                    System.out.printf("%d ", currentBarcode);
                } else {
                    continue;

                }
            }


        }
    }
}

