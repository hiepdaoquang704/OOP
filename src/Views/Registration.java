package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controller.RegisController;
public class Registration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NameField;
	private JTextField PhoneField;
	private JTextArea txtrPhone;
	private JTextField EmailField;
	private JTextField Password;
	private JRadioButton rdbtnCustomer;  // Radio button cho Customer
    private JRadioButton rdbtnManager;
    private ButtonGroup userTypeGroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NameField = new JTextField();
		NameField.setBounds(290, 108, 266, 42);
		contentPane.add(NameField);
		NameField.setColumns(10);
		
		JTextArea txtrSignUp = new JTextArea();
		txtrSignUp.setBounds(267, 30, 274, 31);
		txtrSignUp.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		txtrSignUp.setText("Shopee v0 - Sign Up");
		contentPane.add(txtrSignUp);
		
		PhoneField = new JTextField();
		PhoneField.setColumns(10);
		PhoneField.setBounds(290, 172, 266, 42);
		contentPane.add(PhoneField);
		
		txtrPhone = new JTextArea();
		txtrPhone.setText("Phone");
		txtrPhone.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		txtrPhone.setBounds(133, 183, 98, 31);
		contentPane.add(txtrPhone);
		ActionListener action = new RegisController(this);
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(action);
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSignUp.setBounds(340, 400, 147, 31);
		contentPane.add(btnSignUp);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setText("Name");
		txtrName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		txtrName.setBounds(133, 116, 98, 31);
		contentPane.add(txtrName);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setText("Email");
		txtrEmail.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		txtrEmail.setBounds(133, 251, 98, 31);
		contentPane.add(txtrEmail);
		
		EmailField = new JTextField();
		EmailField.setColumns(10);
		EmailField.setBounds(290, 240, 266, 42);
		contentPane.add(EmailField);
		
		Password = new JTextField();
		Password.setColumns(10);
		Password.setBounds(290, 316, 266, 42);
		contentPane.add(Password);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setText("Password");
		txtrPassword.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		txtrPassword.setBounds(133, 327, 98, 31);
		contentPane.add(txtrPassword);
		
		rdbtnCustomer = new JRadioButton("Customer");
        rdbtnCustomer.setBounds(290, 370, 109, 23);
        contentPane.add(rdbtnCustomer);

        rdbtnManager = new JRadioButton("Manager");
        rdbtnManager.setBounds(400, 370, 109, 23);
        contentPane.add(rdbtnManager);
        
        userTypeGroup = new ButtonGroup();
        userTypeGroup.add(rdbtnCustomer);
        userTypeGroup.add(rdbtnManager);

        // Sign Up button
//        JButton btnSignUp = new JButton("Sign Up");
//        btnSignUp.addActionListener(new RegisController(this));
//        btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 16));
//        btnSignUp.setBounds(340, 400, 147, 31);
        contentPane.add(btnSignUp);
		this.setVisible(true);

	}
	public JTextField getNameField() {
        return NameField;
    }

    public JTextField getPhoneField() {
        return PhoneField;
    }

    public JTextField getEmailField() {
        return EmailField;
    }

    public JTextField getPasswordField() {
        return Password;
    }
    public String getUserType() {
        if (rdbtnCustomer.isSelected()) {
            return "customer";
        } else if (rdbtnManager.isSelected()) {
            return "manager";
        }
        return null;
    }
}
