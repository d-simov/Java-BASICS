package AdditionalPractice;

import java.util.Scanner;

public class Try {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String stringK = ("" + k);
        String stringL = ("" + l);
        String stringM = ("" + m);
        String stringN = ("" + n);
        if (stringK.equals(stringM) && stringL.equals(stringN)) {
            System.out.println("FUCK YOU!");
        }
    }
}
