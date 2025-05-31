public class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    // Static block to initialize static variables
    static {
        totalBooks = 0;
    }

    // Instance initializer block (runs when object is created)
    {
        totalBooks++;
    }

    // Constructor with all details
    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Constructor with only ISBN
    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    // Static method to get total number of books
    static int getTotalNoOfBooks() {
        return totalBooks;
    }

    // Method to borrow a book
    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already Borrowed: " + title);
        } else {
            System.out.println("Enjoy the book: " + title);
            isBorrowed = true;
        }
    }

    // Method to return a book
    void returnBook() {
        if (isBorrowed) {
            System.out.println("Hope you enjoyed! Please leave a review for: " + title);
            isBorrowed = false;
        } else {
            System.out.println("This book is already in the library: " + title);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        // Creating books
        Book designOfThings = new Book("1", "Design", "Maxwel");
        Book myBook = new Book("2");

        // Printing total books
        System.out.println("Total books: " + Book.getTotalNoOfBooks());

        // Borrowing and returning books
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();  // Should show already borrowed

        designOfThings.returnBook();
        designOfThings.borrowBook();  // Now should allow borrowing again
    }
}







