package src.main.java.com.models;

public class Customers {
    private int customerID;
    private String nameCustomer;
    private String address;
    private String phone;
    private String email;

    public Customers(int customerID, String nameCustomer, String address, String phone, String email) {
        this.customerID = customerID;
        this.nameCustomer = nameCustomer;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void getPhone() {
        // logic getPhone
    }

    public void getAddress() {
        // logic Address
    }

    public void updateCustomers() {
        // logic updateCustomers
    }

    // Getters và Setters
}
