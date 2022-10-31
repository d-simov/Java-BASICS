package PB1021ExamPrep;

import java.util.Scanner;

public class PBExamPrep04EasterEggsBattle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int eggsPlayerOne = Integer.parseInt(scanner.nextLine());
        int eggsPlayerTwo = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("End of battle")) {
            if (command.equals("one")) {
                eggsPlayerTwo--;
            } else if (command.equals("two")) {
                eggsPlayerOne--;
            }

            if (eggsPlayerOne == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsPlayerTwo);
                break;
            }
            if (eggsPlayerTwo == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsPlayerOne);
                break;
            }

            command = scanner.nextLine();
        }
        if (eggsPlayerOne != 0 && eggsPlayerTwo != 0) {
            System.out.printf("Player one has %d eggs left.%n", eggsPlayerOne);
            System.out.printf("Player two has %d eggs left.%n", eggsPlayerTwo);
        }
    }
}
