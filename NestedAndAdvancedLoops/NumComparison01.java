package AdditionalPractice;

import java.util.Scanner;

public class NumComparison01 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
//        if ((a >=100 && a<=200) || (c + b >=300 && c <= 400)) {
//                System.out.println("Yes");
//        }
//        else System.out.println("No");
        if (a >=100 || (a<=200 || c + b >=300) && c <= 400) {
                System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
