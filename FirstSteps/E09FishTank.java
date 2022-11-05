package FirstSteps;

import java.util.Scanner;

public class E09FishTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int aSide = Integer.parseInt(scanner.nextLine());
        int bSide = Integer.parseInt(scanner.nextLine());
        int cSide = Integer.parseInt(scanner.nextLine());
        double percentageVolume = Double.parseDouble(scanner.nextLine());

        System.out.println(((aSide * 0.1) * (bSide * 0.1) * (cSide * 0.1)) * (100 -percentageVolume) * 0.01);

    }
}
