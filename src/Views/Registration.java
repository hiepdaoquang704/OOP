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
		textField.setBounds(290, 85, 266, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrRegistration = new JTextArea();
		txtrRegistration.setBounds(267, 30, 274, 31);
		txtrRegistration.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		txtrRegistration.setText("Shopee v0 - Registration");
		contentPane.add(txtrRegistration);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setText("Name");
		txtrName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		txtrName.setBounds(133, 96, 62, 31);
		contentPane.add(txtrName);
		
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
		textField_2.setBounds(290, 233, 266, 42);
		contentPane.add(textField_2);
		
		txtrPhone = new JTextArea();
		txtrPhone.setText("Phone");
		txtrPhone.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		txtrPhone.setBounds(133, 244, 98, 31);
		contentPane.add(txtrPhone);
		ActionListener action = new RegisController(this);
		JButton RegisButton = new JButton("Registration");
		RegisButton.addActionListener(action);
		RegisButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		RegisButton.setBounds(323, 325, 147, 31);
		contentPane.add(RegisButton);
		this.setVisible(true);
	}
}
