package p01Basics.NestedLoops;

import java.util.Scanner;

public class E06CinemaTickets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int studentTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;
        int totalTickets = 0;
        boolean isFinished = false;

        while (!movieName.equals("Finish")) {

            int freeSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int numberOfTickets = 0;


            while (!ticketType.equals("End")) {

                if (ticketType.equals("student")) {
                    studentTickets++;
                } else if (ticketType.equals("standard")) {
                    standardTickets++;
                } else if (ticketType.equals("kid")) {
                    kidsTickets++;
                } else if (ticketType.equals("Finish")){
                    isFinished = true;
                    break;}

                numberOfTickets++;
                if (numberOfTickets == freeSeats) {
                    break;
                }

                ticketType = scanner.nextLine();

            }
            totalTickets += numberOfTickets;
            System.out.printf("%s - %.2f%% full.%n", movieName, numberOfTickets * 1.0 / freeSeats * 100 );
            if (isFinished) {
                break;
            }

            movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidsTickets * 1.0 / totalTickets * 100);


    }
}
