package ConditionalStatements;

import java.util.Scanner;

public class E06WorldSwimmingRecord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double worldRecordSecs = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double secsPerM = Double.parseDouble(scanner.nextLine());

        double resultTime = distanceMeters * secsPerM + Math.floor(distanceMeters / 15) * 12.5;

        if (resultTime < worldRecordSecs) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", resultTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", resultTime - worldRecordSecs);
        }


    }
}
