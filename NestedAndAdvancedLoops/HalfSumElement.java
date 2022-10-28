package AdditionalPractice;

import java.util.Scanner;

public class HalfSumElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int numSum = 0;

        for (int i = 0; i < num; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            numSum += currentNum;
            if (currentNum > maxNum) maxNum = currentNum;

        }
        int sumWithoutMaxNum = numSum - maxNum;
        if (sumWithoutMaxNum == maxNum) {
            System.out.printf("Yes%nSum = %d", maxNum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(maxNum - sumWithoutMaxNum));
        }
    }
}
