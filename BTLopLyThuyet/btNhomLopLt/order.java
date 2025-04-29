import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Order {
    int orderID;
    Customer customer;
    LocalDate orderDate;
    int totalAmount;
    List<OrderItem> list_OrderItems = new ArrayList<>();
    public void addOrderItem(OrderItem orderItem){
        list_OrderItems.add(orderItem);
        
    }
    public Order(int orderID, Customer customer,  int totalAmount) {
        this.orderID = orderID;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }
}