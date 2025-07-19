package orders;

public class Order {
    public int orderId;
    public String customerName;
    public double totalPrice;

    public Order(int id, String name, double price) {
        this.orderId = id;
        this.customerName = name;
        this.totalPrice = price;
    }
}