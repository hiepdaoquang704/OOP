package src.main.java.com.views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JPanel loginPanel;
    private JTextField userIDField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel userIDLabel;
    private JLabel passwordLabel;
    private String[] managers = { "manager1", "manager2" };
    private String[] customers = { "customer1", "customer2" }; 

    public LoginFrame() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        loginPanel = new JPanel();
        userIDLabel = new JLabel("UserID:");
        passwordLabel = new JLabel("Password:");
        userIDField = new JTextField(15);
        passwordField = new JPasswordField(15);
        loginButton = new JButton("Login");


        loginPanel.add(userIDLabel);
        loginPanel.add(userIDField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);


        add(loginPanel);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userID = userIDField.getText();
                String password = new String(passwordField.getPassword());


                if (validateLogin(userID, password)) {
                    if (isManager(userID)) {

                        new ManagerFrame().setVisible(true);
                    } else if (isCustomer(userID)) {

                        new CustomersFrame().setVisible(true);
                    }
                    dispose(); 
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }


    private boolean validateLogin(String userID, String password) {
        return password.equals("password"); 
    }

    // Check manager
    private boolean isManager(String userID) {
        for (String manager : managers) {
            if (manager.equals(userID)) {
                return true;
            }
        }
        return false;
    }

    // Check UserID
    private boolean isCustomer(String userID) {
        for (String customer : customers) {
            if (customer.equals(userID)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new LoginFrame().setVisible(true);
    }
}
