package p01Basics.WhileLoop;

import java.util.Scanner;

public class ALab03SumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < firstNumber) {
           int nextNumber = Integer.parseInt(scanner.nextLine());
            sum += nextNumber;

        }
        System.out.println(sum);
    }
}
