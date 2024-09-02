import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryManagementSystem {
    private static final int PAGE_SIZE = 10; // Number of books per page

    private final List<Book> books;
    private final Map<String, List<Book>> booksByAuthor;

    public LibraryManagementSystem() {
        books = new ArrayList<>();
        booksByAuthor = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
        booksByAuthor.computeIfAbsent(book.getAuthor(), k -> new ArrayList<>())
                     .add(book);
    }

    public List<Book> getBooksByAuthor(String author, int page) {
        List<Book> authorBooks = booksByAuthor.getOrDefault(author, new ArrayList<>());
        int startIndex = (page - 1) * PAGE_SIZE;
        int endIndex = Math.min(startIndex + PAGE_SIZE, authorBooks.size());
        return new ArrayList<>(authorBooks.subList(startIndex, endIndex));
    }

    public List<Book> getAllBooks(int page) {
        int startIndex = (page - 1) * PAGE_SIZE;
        int endIndex = Math.min(startIndex + PAGE_SIZE, books.size());
        return new ArrayList<>(books.subList(startIndex, endIndex));
    }

    public static class Book {
        private final String title;
        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }
}