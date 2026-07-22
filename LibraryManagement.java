import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter book name: ");
                    String book = sc.nextLine();
                    books.add(book);
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.println("\nAvailable Books:");
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (String b : books) {
                            System.out.println("- " + b);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter book name to issue: ");
                    String issueBook = sc.nextLine();
                    if (books.remove(issueBook)) {
                        System.out.println("Book issued successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter book name to return: ");
                    String returnBook = sc.nextLine();
                    books.add(returnBook);
                    System.out.println("Book returned successfully.");
                    break;

                case 5:
                    System.out.println("Thank you for using Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}