package PBPreliminaryExamOcrober21;

import java.util.Scanner;

public class PremExamOct06Substitute {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initialK = Integer.parseInt(scanner.nextLine());
        int initialL = Integer.parseInt(scanner.nextLine());
        int initialM = Integer.parseInt(scanner.nextLine());
        int initialN = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean isReady = false;

        for (int k = initialK; k <= 8 ; k++) {
            if (k % 2 != 0) {
                continue;
            }
            for (int l = 9; l >=initialL ; l--) {
                if (l % 2 == 0) {
                    continue;
                }
                for (int m = initialM; m <=8 ; m++) {
                    if (m % 2 != 0) {
                        continue;
                    }
                    for (int n = 9; n >=initialN ; n--) {
                        if (n % 2 == 0) {
                            continue;
                        } else {
                            String stringK = ("" + k);
                            String stringL = ("" + l);
                            String stringM = ("" + m);
                            String stringN = ("" + n);
                            if (stringK.equals(stringM) && stringL.equals(stringN)) {
                            System.out.println("Cannot change the same player.");
                            } else {
                                System.out.printf("%s%s - %s%s%n", stringK, stringL, stringM, stringN);
                                counter++;
                                if (counter >= 6) {
                                    return;
                                }
                            }
                        }


                    }

                }

                }

            }


        }
    }
