package FirstSteps;

import java.util.Scanner;

public class E04VacationBookList {

    public static void main (String [] args) {

        Scanner scanner = new Scanner (System.in);

        int pageNum = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hours = pageNum / pagesPerHour / days;

        System.out.println(hours);
    }
}
