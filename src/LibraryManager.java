import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LibraryManager {
    private List<Book> books = new ArrayList<>(); // List to store books

    // Function to add a new book
    public void addBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        books.add(new Book(title, author, isbn)); // Adding new book to the list
        System.out.println("Book added successfully!");
    }

    // Function to display all books in the library
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available."); // Message if no books are found
            return;
        }
        System.out.println("\nAll Books:");
        System.out.println("-------------------------------");
        for (Book book : books) {
            System.out.println(book);
            System.out.println("-----------------------------------");
        }
    }

    // Function to search for a book by title
    public void searchBookByTitle(Scanner scanner) {
        System.out.print("Enter book title to search: ");
        String searchTitle = scanner.nextLine();

        boolean found = false;
        System.out.println("\nFound Books:");
        System.out.println("---------------------------------");
        for (Book book : books) {
            if (book.title.toLowerCase().contains(searchTitle.toLowerCase())) {
                System.out.println(book);
                System.out.println("---------------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with the title: " + searchTitle);
        }
    }

    // Function to check out a book
    public void checkOutBook(Scanner scanner) {
        System.out.print("Enter the ISBN of the book you want to check out: ");
        String isbn = scanner.nextLine();

        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                if (book.status.equals("Available")) {
                    book.status = "Checked Out"; // Mark the book as checked out
                    System.out.println("Book checked out successfully!");
                } else {
                    System.out.println("Book not found or already checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Function to return a checked-out book
    public void returnBook(Scanner scanner) {
        System.out.print("Enter the ISBN of the book you want to return: ");
        String isbn = scanner.nextLine();

        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                if (book.status.equals("Checked Out")) {
                    book.status = "Available"; // Mark the book as available again
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("This book was not checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

}

