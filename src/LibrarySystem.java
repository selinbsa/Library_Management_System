import java.util.Scanner;

public class LibrarySystem {
    private LibraryManager libraryManager = new LibraryManager(); // Creating an instance of LibraryManager

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Library Management System!");
            printMenu(); // Display menu to the user
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.libraryManager.addBook(scanner); // Add a new book
                    break;
                case 2:
                    library.libraryManager.displayAllBooks(); // Display all books
                    break;
                case 3:
                    library.libraryManager.searchBookByTitle(scanner); // Search for a book by title
                    break;
                case 4:
                    library.libraryManager.checkOutBook(scanner); // Check out a book
                    break;
                case 5:
                    library.libraryManager.returnBook(scanner); // Return a book
                    break;
                case 6:
                    System.out.println("Thank you for using the Library Management System!");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again."); // Handle invalid input
            }
        }
    }

    // Displays the menu options to the user
    public static void printMenu() {
        System.out.println("Please select an option: ");
        System.out.println("1. Add a new book");
        System.out.println("2. Display all books");
        System.out.println("3. Search for a book by title");
        System.out.println("4. Check out a book");
        System.out.println("5. Return a book");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }
}
