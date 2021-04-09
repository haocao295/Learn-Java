package E2_3;
import java.util.*;

public class main {
    public static void main(String[] args) {
       List<Catalog> catalogs = new ArrayList<>();
       Catalog cata1, cata2, cata3;
       
       cata1 = new Catalog(1,"Java");
       cata1.addBook(new Book(1,"Java can ban",5000));
       cata1.addBook(new Book(2,"Java nang cao",7000));
       
       cata2 = new Catalog(2,"Mobile");
       cata2.addBook(new Book(3,"Lap Trinh Android",10000));
       cata2.addBook(new Book(4,"Swish",12000));
       
       cata3 = new Catalog(3,"Web");
       cata3.addBook(new Book(5,"JSF",6000));
       
       catalogs.add(cata1);
       catalogs.add(cata2);
       catalogs.add(cata3);
       
       for(Catalog catalog:catalogs){
           System.out.println("\n" + catalog);
           for(Book b:catalog.getBooks()){
                System.out.println(b);   
            }
        } 
    }
}
