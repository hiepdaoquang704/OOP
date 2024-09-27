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
                // // Mở cửa sổ quản lý kho
                // new StockFrame().setVisible(true);
            }
        });

        manageOrdersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // // Mở cửa sổ quản lý đơn hàng
                // new OrdersFrame().setVisible(true);
            }
        });

        manageCustomersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // // Mở cửa sổ quản lý khách hàng
                // new CustomersFrame().setVisible(true);
            }
        });

        paymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // // Mở cửa sổ thanh toán
                // new PaymentFrame().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }
}
