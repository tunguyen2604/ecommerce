
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    int lowStockTheshold;
    List<Book> listBook = new ArrayList<>(); 

    public void addBook(Book book){
        listBook.add(book);
        
    }
    List<Toy> listToy = new ArrayList<>(); 

    public void addToy(Toy Toy){
        listToy.add(Toy);
        
    }
    List<Stationary> listStationary = new ArrayList<>(); 

    public void addStationary(Stationary Stationary){
        listStationary.add(Stationary);
        
    }
}
