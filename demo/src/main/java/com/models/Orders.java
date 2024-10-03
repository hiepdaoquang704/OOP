package src.main.java.com.models;

import java.util.Date;

public class Orders {
    private int ordersID;
    private Date ordersDate;
    private String orderDetails;
    private float totalAmount;

    public Orders(int ordersID, Date ordersDate, String orderDetails, float totalAmount) {
        this.ordersID = ordersID;
        this.ordersDate = ordersDate;
        this.orderDetails = orderDetails;
        this.totalAmount = totalAmount;
    }

    public void addOrders() {
        // addOrders
    }

    public void deleteOrders() {
        // logic delete
    }

    public void updateOrders() {
        // logic update
    }

    // Getters and Setters
}
