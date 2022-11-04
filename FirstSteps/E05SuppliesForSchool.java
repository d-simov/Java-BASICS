package FirstSteps;

import java.util.Scanner;

public class E05SuppliesForSchool {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please, insert number of pens");
        int pens = Integer.parseInt(scanner.nextLine());
//        System.out.println("Please, insert number of markers");
        int markers = Integer.parseInt(scanner.nextLine());
//        System.out.println("Please, insert quantity of board liquit");
        int liquid = Integer.parseInt(scanner.nextLine());
//        System.out.println("Please, insert discount (0-100)");
        int discount = Integer.parseInt(scanner.nextLine());

        System.out.println((pens * 5.8 + markers * 7.2 + liquid * 1.2)*(1 - discount / 100.0));
    }
}
