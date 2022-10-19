package p01Basics.WhileLoop;

import java.util.Scanner;

public class ALab02Password {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String passwordAttempt = scanner.nextLine();

        while (!passwordAttempt.equals(password)) {
            passwordAttempt = scanner.nextLine();
        }
        System.out.println("Welcome " + username + '!');
    }
}
