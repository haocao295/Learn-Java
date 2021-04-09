package E2_3;
import java.util.*;

public class Catalog {

    private int id;
    private String name;

    public Catalog() {
    }

    public Catalog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Catalog{" + "id=" + id + ", name=" + name + '}';
    }

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book b) {
        books.add(b);
        b.setCatalog(null);
    }

    public void removeBook(Book b) {
        books.remove(b);
        b.setCatalog(null);
    }


}
