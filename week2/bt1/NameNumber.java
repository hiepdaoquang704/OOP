

public class NameNumber {
    private String lastName;
    private String telNumber;

    NameNumber() {}

    public NameNumber(String name, String num) {
        this.lastName = name;
        this.telNumber = num;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    // Thêm phương thức main để kiểm tra
    public static void main(String[] args) {
        // Tạo một đối tượng NameNumber
        NameNumber nn = new NameNumber("Nguyen", "0123456789");
        System.out.println("Name: " + nn.getLastName());
        System.out.println("Phone number: " + nn.getTelNumber());
    }
}
