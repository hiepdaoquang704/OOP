public class OrderDetails {
    private String product;
    private int quantity;
    private float price;

    // Constructor
    public OrderDetails(String product, int quantity, float price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
