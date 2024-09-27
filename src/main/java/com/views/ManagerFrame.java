package src.main.java.com.views;

import javax.swing.*;

public class ManagerFrame extends JFrame {
    public ManagerFrame() {
        setTitle("Manager Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Welcome, Manager!");
        panel.add(label);

        add(panel);
    }
}
