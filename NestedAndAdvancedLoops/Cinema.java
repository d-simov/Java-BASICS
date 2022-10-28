package AdditionalPractice;

import java.util.Scanner;

public class Cinema {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, insert type of tickets");
        String ticketType = scan.nextLine();
        System.out.println("Please, insert number of raws");
        int r = Integer.parseInt(scan.nextLine());
        System.out.println("Please, insert number of columns");
        int c = Integer.parseInt(scan.nextLine());

        double ticketPrice = 0.0;

        switch (ticketType) {
            case "Premiere":
                ticketPrice = 12.0;
                break;
            case "Normal":
                ticketPrice = 7.5;
                break;
            case "Discount":
                ticketPrice = 5;
                break;
            default:
                System.out.println("Invalid Ticket type");
                break;
        }
        switch (ticketType) {
            case "Premiere":
            case "Normal":
            case "Discount":
                if (r>0 && c>0) {
                    System.out.print("The income from the projection is ");
                    System.out.printf("%.2f", (ticketPrice * r * c));
                    System.out.print(" leva");}
                else System.out.println("Not valid number of seats");
                break;
            default:
                System.out.println("Price can not be calculated");
                break;
        }
    }

}
