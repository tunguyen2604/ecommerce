
import java.util.List;

public class Inventory {
    List<Products> listProduct; 
    int lowStockTheshold;

    public int getLowStockTheshold() {
        return lowStockTheshold;
    }

    public void setLowStockTheshold(int lowStockTheshold) {
        this.lowStockTheshold = lowStockTheshold;
    }
}

    //List<Products> listProduct = new ArrayList<>();
