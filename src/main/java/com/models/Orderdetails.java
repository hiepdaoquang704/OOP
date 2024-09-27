package src.main.java.com.models;

public class OrderDetails {
    private String product;
    private int quantity;
    private int price;

    public OrderDetails(String product, int quantity, int price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
    // Getters and Setters
}