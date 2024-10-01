package src.main.java.com.models;

public class Stock {
    private int productID;
    private String nameProduct;
    private int quantity;
    private float price;

    public Stock(int productID, String nameProduct, int quantity, float price) {
        this.productID = productID;
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.price = price;
    }

    public void addProduct() {
        try {
            if (quantity < 0) {
                throw new IllegalArgumentException("quantity less than 0");
            }
            System.err.println("product added");
        } catch (IllegalArgumentException e) {
            System.err.println("error when adding product: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unknow error has occurred: " + e.getMessage());
        }

    }

    public void deleteProduct() {
        try {
            if (quantity <= 0) {
                throw new IllegalAccessException("cannot delete product because quantity equals 0");
            }
            System.err.println("product deleted");
        } catch (IllegalAccessException e) {
            System.err.println("Cannot delete product" + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unknow error has occurred: " + e.getMessage());
        }
    }

    public void updateProduct() {
        // logic update
    }

    public void checkProduct() {
        try {
            if (nameProduct == null || nameProduct.isEmpty()) {
                throw new IllegalArgumentException("The name of product is Empty");
            }
            System.err.println("Eligible products");
        } catch (IllegalArgumentException e) {
            System.err.println("Error when cheking products");
        }
    }
}

// Getters and Setters
