package com.example;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JLabel lblHVTn;
	private JLabel lblaCh;
	private JLabel lblSinThoi;
	private JLabel lblEmail;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Đăng ký");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(382, 406, 233, 68);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Shoppe v0 -  Đăng ký khách hàng");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setForeground(UIManager.getColor("Button.disabledForeground"));
		lblNewLabel.setBounds(309, 25, 468, 34);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(399, 273, 0, 19);
		contentPane.add(passwordField);
		
		lblHVTn = new JLabel("Họ và tên");
		lblHVTn.setForeground(UIManager.getColor("CheckBox.foreground"));
		lblHVTn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHVTn.setBounds(217, 112, 80, 34);
		contentPane.add(lblHVTn);
		
		lblaCh = new JLabel("Địa chỉ");
		lblaCh.setForeground(Color.BLACK);
		lblaCh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblaCh.setBounds(217, 173, 80, 34);
		contentPane.add(lblaCh);
		
		lblSinThoi = new JLabel("Số điện thoại");
		lblSinThoi.setForeground(Color.BLACK);
		lblSinThoi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSinThoi.setBounds(217, 230, 123, 34);
		contentPane.add(lblSinThoi);
		
		lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(217, 290, 123, 34);
		contentPane.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(382, 289, 233, 41);
		contentPane.add(textField_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(382, 222, 233, 41);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(382, 162, 233, 41);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(382, 100, 233, 41);
		contentPane.add(textField_2);
	}
}
