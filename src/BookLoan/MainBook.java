package BookLoan;

import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];
        int bookIndex = 0;

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Enter loan details");
            System.out.println("2. Check loan status");
            System.out.println("3. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (bookIndex < books.length) {
                        books[bookIndex] = enterLoanDetails(scanner);
                        bookIndex++;
                    } else {
                        System.out.println("Maximum number of books reached.");
                    }
                    break;
                case 2:
                    checkLoanStatus(books, bookIndex);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }

    public static Book enterLoanDetails(Scanner scanner) {
        Book book = new Book();

        System.out.println("Enter loan code:");
        book.loanCode = scanner.nextInt();

        scanner.nextLine(); // Clear the buffer

        System.out.println("Enter loan date:");
        book.loanDate = scanner.nextLine();

        System.out.println("Enter book title:");
        book.bookTitle = scanner.nextLine();

        System.out.println("Enter user code:");
        book.userCode = scanner.nextInt();

        System.out.println("Enter loan days:");
        book.loanDays = scanner.nextInt();

        System.out.println("Enter loan status (1 for loaned, 0 for available):");
        book.loanStatus = scanner.nextInt();

        return book;
    }

    public static void checkLoanStatus(Book[] books, int bookIndex) {
        if (bookIndex == 0) {
            System.out.println("No books registered.");
        } else {
            System.out.println("General loan status:");

            for (int i = 0; i < bookIndex; i++) {
                System.out.println("Book " + i + ": " + (books[i].loanStatus == 1 ? "Loaned" : "Available"));
            }
        }
    }
}
