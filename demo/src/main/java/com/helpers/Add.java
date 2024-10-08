package src.main.java.com.helpers;

import java.io.FileWriter;
import java.io.IOException;

public class Add {
    public static void addProductToFile(String filePath, int productId, String name, int quantity, float price) {
        try (FileWriter writer = new FileWriter(filePath, true)) { // 'true' để thêm dữ liệu vào cuối file
            writer.write(productId + "," + name + "," + quantity + "," + price + "\n");
            System.out.println("Thêm sản phẩm vào file thành công.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "products.txt";
        addProductToFile(filePath, 1, "Laptop", 10, 1500.00f);
    }
}
