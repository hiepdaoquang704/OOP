import java.time.LocalDateTime;

public class Payment {
    private int paymentId;
    private float amountPaid;
    private LocalDateTime paymentDate;
    private String product;
    private String paymentMethods;

    // Constructor
    public Payment(int paymentId, float amountPaid, LocalDateTime paymentDate, String product, String paymentMethods) {
        this.paymentId = paymentId;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
        this.product = product;
        this.paymentMethods = paymentMethods;
    }

    // Getters and setters
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public float getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(String paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    // Method
    public void payUponReceipt() {
        // Code to handle payment upon receipt
    }
}
