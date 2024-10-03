package src.main.java.com.views;

import src.main.java.com.helpers.Visible;

import javax.swing.*;

public class CustomersFrame extends JFrame {
    public CustomersFrame() {
        setTitle("Customer Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Welcome, Customer!");
        panel.add(label);

        add(panel);
    }
}
