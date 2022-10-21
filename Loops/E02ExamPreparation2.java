package p01Basics.WhileLoop;

import java.util.Scanner;

public class E02ExamPreparation2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int failNum = Integer.parseInt(scanner.nextLine());
        String lastProblem = "";
        int poorGrades = 0;
        int problemNum = 0;
        double gradeSum = 0;
        boolean needBreak = true;

        while (poorGrades < failNum) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                needBreak = false;
                break;
            }
            lastProblem = problemName;
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade <= 4) {
                poorGrades ++;
            }
            problemNum++;
            gradeSum += currentGrade;
        }
        if (needBreak) {
            System.out.printf("You need a break, %d poor grades.", poorGrades);
        }
        if (!needBreak) {
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s%n", gradeSum / problemNum, problemNum, lastProblem);
        }
    }
}
