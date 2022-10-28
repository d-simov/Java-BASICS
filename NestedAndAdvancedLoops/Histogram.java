package AdditionalPractice;

import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum >= 1 && currentNum < 200) p1 = p1+1;
            else if (currentNum >=200 && currentNum < 400) p2 = p2+1;
            else if (currentNum >=400 && currentNum < 600) p3 = p3+1;
            else if (currentNum >=600 && currentNum < 800) p4 = p4+1;
            else if (currentNum >=800 && currentNum <= 1000) p5 = p5+1;
            else System.out.println("Incorrect number input");
        }
        double pr1 = p1 / n;
        double pr2 = p2 / n;
        double pr3 = p3 / n;
        double pr4 = p4 / n;
        double pr5 = p5 / n;

        System.out.printf("%.2f%% %n", pr1*100);
        System.out.printf("%.2f%% %n", pr2*100);
        System.out.printf("%.2f%% %n", pr3*100);
        System.out.printf("%.2f%%%n", pr4*100);
        System.out.printf("%.2f%%%n", pr5*100);
    }
}
