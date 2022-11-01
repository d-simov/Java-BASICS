package PBPreliminaryExamOcrober21;

import java.util.Scanner;

public class PremExamOct01Excursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleNum = Integer.parseInt(scanner.nextLine());
        int nightsNum = Integer.parseInt(scanner.nextLine());
        int transportCardsNum = Integer.parseInt(scanner.nextLine());
        int museumTicketsNum = Integer.parseInt(scanner.nextLine());

        double nightsPrice = nightsNum * 20;
        double transportCardsSum = transportCardsNum * 1.6;
        double museumTicketsSum = museumTicketsNum * 6;

        double finalSum = peopleNum * (nightsPrice + transportCardsSum + museumTicketsSum) * 1.25;

        System.out.printf("%.2f", finalSum);
    }
}
