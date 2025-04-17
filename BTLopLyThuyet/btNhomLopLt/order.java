
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    int orderID;
    Customer customer;
    LocalDate orderDate;
    int totalAmount;
    short status;
    List<OrderItem> list_OrderItems = new ArrayList<>();

    public void addOrderItem(OrderItem orderItem){
        list_OrderItems.add(orderItem);
        
    }

    public Order(int orderID, Customer customer,  int totalAmount, short  status) {
        this.orderID = orderID;
        this.customer = customer;
        this.totalAmount = totalAmount;
        this.status = status;
    }
    


}
