public class Librarian extends User {
    public Librarian(String name, int userId) {
        super(name, userId);
    }

    @Override
    public String getRole() {
        return "Librarian";
    }
}

