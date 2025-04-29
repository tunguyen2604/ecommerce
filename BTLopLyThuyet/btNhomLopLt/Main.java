
import javax.print.attribute.standard.MediaSize;

public class Main{
    public static void main(String[] args) {
        //ket tap
    Customer customer1 = new  Customer();
     Book giaiTich1 = new Book(0001, "giai tich 1", "abc");
    Inventory inventory = new Inventory();
    inventory.addBook(giaiTich1);
    //Order order1 = new Order(1, customer1, 1);
    OrderItem orderItem1 = new OrderItem(giaiTich1,100 );
     }
}