# Library Management System

## Overview
This is a simple Library Management System implemented in Java. It allows users to manage books in a library, including adding new books, displaying all books, searching for books by title, checking out books, and returning books.

## Features
- **Add a Book**: Users can add books by entering the title, author, and ISBN.
- **Display All Books**: Lists all available books in the library.
- **Search for a Book by Title**: Finds books that match a given title.
- **Check Out a Book**: Users can borrow a book using its ISBN.
- **Return a Book**: Users can return a borrowed book using its ISBN.
- **Exit the System**: Users can exit the program gracefully.

## How to Use
1. Run the `LibrarySystem` class.
2. Select an option from the menu by entering the corresponding number.
3. Follow the prompts to complete the chosen operation.
4. The menu will be displayed after each operation, allowing further actions.
5. To exit, select option `6`.

## Code Structure
- `LibrarySystem.java` - Main entry point of the program.
- `LibraryManager.java` - Handles all library operations.
- `Book.java` - Represents a book with attributes such as title, author, ISBN, and status.

## Example Usage
```
Welcome to the Library Management System!
Please select an option:
1. Add a new book
2. Display all books
3. Search for a book by title
4. Check out a book
5. Return a book
6. Exit
Enter your choice: 1
Enter book title: The Great Gatsby
Enter author name: F. Scott Fitzgerald
Enter ISBN: 1234567898
Book added successfully!
```

## Requirements
- Java 8 or later

## Author
Developed by Selin Ağan

