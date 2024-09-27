package src.main.java.com.views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JButton manageStockButton;
    private JButton manageOrdersButton;
    private JButton manageCustomersButton;
    private JButton paymentButton;

    public MainFrame() {
        setTitle("Quản lý bán hàng");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel = new JPanel();

        manageStockButton = new JButton("Quản lý kho");
        manageOrdersButton = new JButton("Quản lý đơn hàng");
        manageCustomersButton = new JButton("Quản lý khách hàng");
        paymentButton = new JButton("Thanh toán");

        mainPanel.add(manageStockButton);
        mainPanel.add(manageOrdersButton);
        mainPanel.add(manageCustomersButton);
        mainPanel.add(paymentButton);

        add(mainPanel);

        manageStockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        manageOrdersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        manageCustomersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        paymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }
}
