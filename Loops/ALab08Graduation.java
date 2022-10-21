package p01Basics.WhileLoop;

import java.util.Scanner;

public class ALab08Graduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String studentName = scanner.nextLine();
        int year = 1;
        int lowGrade = 0;
        double gradeSum = 0;

        while (year <= 12) {
            if (lowGrade >= 2) {
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                lowGrade++;
                continue;
            }
            gradeSum += grade;
            year ++;
        }
        if (lowGrade >= 2) {
            System.out.printf("%s has been excluded at %d grade",studentName, year);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, gradeSum / 12);
        }
    }
}
