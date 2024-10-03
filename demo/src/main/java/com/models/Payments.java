package src.main.java.com.models;

import java.util.Date;

public class Payments {
    private int paymentID;
    private float amountPaid;
    private Date paymentDate;
    private String product;
    private String paymentMethods;

    public Payments(int paymentID, float amountPaid, Date paymentDate, String product, String paymentMethods) {
        this.paymentID = paymentID;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
        this.product = product;
        this.paymentMethods = paymentMethods;
    }

    public void payUponReceipt() {
        // logic payUponReceipt
    }

    // Getters and Setters
}
