public class LibraryApp {
    public static void main(String[] args) {
        LibraryManagementSystem librarySystem = new LibraryManagementSystem();

        // Add some books to the library
        librarySystem.addBook(new LibraryManagementSystem.Book("The Great Gatsby", "F. Scott Fitzgerald"));
        librarySystem.addBook(new LibraryManagementSystem.Book("To Kill a Mockingbird", "Harper Lee"));
        librarySystem.addBook(new LibraryManagementSystem.Book("1984", "George Orwell"));
        librarySystem.addBook(new LibraryManagementSystem.Book("Pride and Prejudice", "Jane Austen"));
        librarySystem.addBook(new LibraryManagementSystem.Book("The Catcher in the Rye", "J.D. Salinger"));

        // Retrieve books by author, with paging
        List<LibraryManagementSystem.Book> booksbyFitzgerald = librarySystem.getBooksByAuthor("F. Scott Fitzgerald", 1);
        System.out.println("Books by F. Scott Fitzgerald:");
        for (LibraryManagementSystem.Book book : booksbyFitzgerald) {
            System.out.println("- " + book.getTitle());
        }

        // Retrieve all books, with paging
        List<LibraryManagementSystem.Book> allBooks = librarySystem.getAllBooks(1); // Changed the page number to 1
        System.out.println("\nAll books in the library:");
        for (LibraryManagementSystem.Book book : allBooks) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}