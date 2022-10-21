package p01Basics.WhileLoop;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class E01OldBooks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        int countBooks = 0;
        String nextBook = scanner.nextLine();
        boolean isFound = false;

        while (!nextBook.equals("No More Books")) {
            if (nextBook.equals(bookName)) {
                isFound = true;
                break;
            }
            countBooks++;
            nextBook = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.%n",countBooks);
        }
        if (!isFound) {
            System.out.printf("The book you search is not here!%nYou checked %d books.",countBooks);
        }
    }
}
