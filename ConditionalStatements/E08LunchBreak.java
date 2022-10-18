package ConditionalStatements;

import java.util.Scanner;

public class E08LunchBreak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String series = scanner.nextLine();
        double watchLength = Double.parseDouble(scanner.nextLine());
        double restLength = Double.parseDouble(scanner.nextLine());

        double freeTime = restLength - restLength * 0.125 - restLength * 0.25;

        if (freeTime >=watchLength) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, Math.ceil(freeTime - watchLength));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, Math.ceil(watchLength - freeTime));
        }


    }
}
