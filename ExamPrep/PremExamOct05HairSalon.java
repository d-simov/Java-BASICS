package PBPreliminaryExamOcrober21;

import java.util.Scanner;

public class PremExamOct05HairSalon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int aimForTheDay = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int earnedMoney = 0;
        boolean isAchieved = false;

        while (!input.equals("closed")) {

            if (input.equals("haircut")) {
                String haircut = scanner.nextLine();
                switch (haircut) {
                    case ("mens"):
                        earnedMoney = earnedMoney + 15;
                        break;
                    case ("ladies"):
                        earnedMoney = earnedMoney + 20;
                        break;
                    case ("kids"):
                        earnedMoney = earnedMoney + 10;
                        break;
                }
            } else if (input.equals("color")){
                String color = scanner.nextLine();
                switch (color) {
                    case ("touch up"):
                        earnedMoney = earnedMoney + 20;
                        break;
                    case ("full color"):
                        earnedMoney = earnedMoney + 30;
                        break;
                }
            }
            if (earnedMoney >= aimForTheDay) {
               isAchieved = true;
                break;
            }

            input = scanner.nextLine();
        }
        if (isAchieved) {
            System.out.println("You have reached your target for the day!");
        } else {
            System.out.printf("Target not reached! You need %dlv. more.%n", aimForTheDay - earnedMoney);
        }
        System.out.printf("Earned money: %dlv.", earnedMoney);
    }
}
