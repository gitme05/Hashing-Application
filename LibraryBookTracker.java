import java.util.Hashtable;
import java.util.Scanner;

public class LibraryBookTracker {
    public static void main(String[] args) {
        Hashtable<Integer, String> books = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Book Tracker");
            System.out.println("1. Add Book");
            System.out.println("2. Retrieve Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 : {
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    books.put(id, title);
                    System.out.println("Book added successfully.");
                }
                case 2 : {
                    System.out.print("Enter Book ID to retrieve: ");
                    int id = scanner.nextInt();
                    if (books.containsKey(id)) {
                        System.out.println("Book Title: " + books.get(id));
                    } else {
                        System.out.println("Book not found.");
                    }
                }
                case 3 : {
                    System.out.println("All Books in Library:");
                    books.forEach((id, title) -> System.out.println("ID: " + id + ", Title: " + title));
                }
                case 4 : System.out.println("Exiting...");
                default : System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
