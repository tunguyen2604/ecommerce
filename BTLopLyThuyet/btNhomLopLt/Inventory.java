import java.util.ArrayList;
import java.util.List;

public class Inventory {
    int lowStockTheshold;
    List<Products> listProduct = new ArrayList<>();

    public int getLowStockTheshold() {
        return lowStockTheshold;
    }

    public void setLowStockTheshold(int lowStockTheshold) {
        this.lowStockTheshold = lowStockTheshold;
    }

    public void addBook(Book giaiTich1) {
        // TODO Auto-generated method stub
        listProduct.add(giaiTich1);

    }
}

