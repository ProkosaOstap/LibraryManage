public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Librarian librarian = new Librarian("Anna", 1);
        Reader reader1 = new Reader("Oleh", 101);
        Reader reader2 = new Reader("Marta", 102);

        library.registerReader(reader1);
        library.registerReader(reader2);

        Book book1 = new Book("1984", "George Orwell", "1111");
        Book book2 = new Book("Brave New World", "Aldous Huxley", "2222");

        library.addBook(book1);
        library.addBook(book2);

        library.listBooks();

        library.lendBook("1984", reader1);
        library.lendBook("Brave New World", reader2);

        library.listBooks();

        library.returnBook("1984", reader1);
        library.listBooks();
    }
}
