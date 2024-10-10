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

    public int getCustomerID() {
        return customerID;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public String getEmail() {
        return email;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
