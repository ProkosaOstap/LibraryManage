import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        books = new ArrayList<>();
        readers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void registerReader(Reader reader) {
        readers.add(reader);
        System.out.println("Registered reader: " + reader.getName());
    }

    public void lendBook(String bookTitle, Reader reader) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                reader.borrowBook(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String bookTitle, Reader reader) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                reader.returnBook(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void listBooks() {
        System.out.println("=== Library Books ===");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

