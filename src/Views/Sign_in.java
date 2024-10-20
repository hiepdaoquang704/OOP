package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.LoginController;
import database.JDBCUtil;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Sign_in extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldEmail;
	private JTextField textFieldPassword;
	private LoginController loginController = new LoginController();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sign_in frame = new Sign_in();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Sign_in() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign in");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(238, 33, 79, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(66, 133, 89, 23);
		contentPane.add(lblNewLabel_1);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(199, 135, 225, 22);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(66, 182, 89, 20);
		contentPane.add(lblNewLabel_2);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(199, 182, 225, 23);
		contentPane.add(textFieldPassword);
		textFieldPassword.setColumns(10);
		
		JButton btnToSignUp = new JButton("Sign up");
		btnToSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        		Registration RegisFrame = new Registration();
        		RegisFrame.setVisible(true);
                dispose();
			}
		});
		btnToSignUp.setBounds(244, 269, 104, 28);
		contentPane.add(btnToSignUp);
		
		JButton btnNewButton_1 = new JButton("Sign in");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = textFieldEmail.getText();
                String password = textFieldPassword.getText();
                try {
					handleLogin(email, password);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(244, 231, 104, 28);
		contentPane.add(btnNewButton_1);
		
		
		
	}
	
	private void handleLogin(String email, String password) throws SQLException {
        String role = loginController.login(email, password);  

        if (role != null) {
            if (role.equals("customer")) {
                Orders orderFrame = new Orders(); 
                orderFrame.setVisible(true);
            } else if (role.equals("manager")) {
                Manager managerFrame = new Manager(); 
                managerFrame.setVisible(true);
            }
            dispose(); 
        } else {
            JOptionPane.showMessageDialog(this, "Invalid email or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
