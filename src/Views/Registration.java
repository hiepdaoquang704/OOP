package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controller.RegisController;
public class Registration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea txtrAddress;
	private JTextField textField_2;
	private JTextArea txtrPhone;
	private JTextField textField_3;
	private JTextField textField_4;

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
		setBounds(100, 100, 761, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(290, 108, 266, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrSignUp = new JTextArea();
		txtrSignUp.setBounds(267, 30, 274, 31);
		txtrSignUp.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		txtrSignUp.setText("Shopee v0 - Sign Up");
		contentPane.add(txtrSignUp);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(290, 160, 266, 42);
		contentPane.add(textField_1);
		
		txtrAddress = new JTextArea();
		txtrAddress.setText("Address");
		txtrAddress.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		txtrAddress.setBounds(133, 171, 98, 31);
		contentPane.add(txtrAddress);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(290, 212, 266, 42);
		contentPane.add(textField_2);
		
		txtrPhone = new JTextArea();
		txtrPhone.setText("Phone");
		txtrPhone.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		txtrPhone.setBounds(133, 223, 98, 31);
		contentPane.add(txtrPhone);
		ActionListener action = new RegisController(this);
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(action);
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSignUp.setBounds(340, 384, 147, 31);
		contentPane.add(btnSignUp);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setText("Name");
		txtrName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		txtrName.setBounds(133, 116, 98, 31);
		contentPane.add(txtrName);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setText("Email");
		txtrEmail.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		txtrEmail.setBounds(133, 275, 98, 31);
		contentPane.add(txtrEmail);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(290, 264, 266, 42);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(290, 316, 266, 42);
		contentPane.add(textField_4);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setText("Password");
		txtrPassword.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		txtrPassword.setBounds(133, 327, 98, 31);
		contentPane.add(txtrPassword);
		this.setVisible(true);
	}
}
