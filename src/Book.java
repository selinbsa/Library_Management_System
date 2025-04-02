class Book {
    String title; // Book title
    String author; // Book author
    String isbn; // Unique ISBN number
    String status; // Book status (Available or Checked Out)

    // Constructor to initialize a new book (default status: Available)
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = "Available";
    }

    // Returns book details in a formatted string
    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "ISBN: " + isbn + "\n" +
                "Status: " + status;
    }
}
