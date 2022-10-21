package p01Basics.WhileLoop;

import java.util.Scanner;

public class E02ExamPreparation1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int failNum = Integer.parseInt(scanner.nextLine());
        String lastProblem = "";
        String input = scanner.nextLine();
        int lowScores = 0;
        int problemNum = 0;
        double gradeSum = 0;
        boolean needBreak = false;

        while (!input.equals("Enough")) {
            lastProblem = input;
            double grade = Double.parseDouble(scanner.nextLine());
            problemNum++;
            gradeSum += grade;
            if (grade <= 4) {
                lowScores++;
            }
            if (lowScores >= failNum) {
                needBreak = true;
                break;
            }


            input = scanner.nextLine();
        }
        if (needBreak) {
            System.out.printf("You need a break, %d poor grades.", lowScores);
        }
        if (!needBreak) {
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", (gradeSum / problemNum), problemNum, lastProblem);
        }
    }
}
