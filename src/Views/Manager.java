import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JTable;

public class Manager extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField txtProductId;
	private JTextField txtNameProduct;
	private JTextField txtPrice;
	private JTextField txtQuantity;
	private JTextField txtXxxxxxx;
	private JTextField txtProduct;
	private JTextField txtXxxxxxx_1;
	private JTextField txtXx;
	private JTextField txtXxxxxxxx;
	private JTextField txtProduct_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtXxxxxx;
	private JTextField txtProduct_2;
	private JTextField txtXxxxxxx_2;
	private JTextField txtXx_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager frame = new Manager();
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
	public Manager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("        Manager");
		lblNewLabel.setBounds(285, 26, 160, 47);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Product ID");
		lblNewLabel_1.setBounds(110, 72, 107, 37);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(207, 72, 251, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(497, 68, 117, 37);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(110, 246, 58, 0);
		contentPane.add(list);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(89, 307, 1, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("     Stock");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(33, 120, 127, 37);
		contentPane.add(lblNewLabel_2);
		
		table = new JTable();
		table.setBounds(208, 275, 0, 0);
		contentPane.add(table);
		
		JList list_1 = new JList();
		list_1.setBounds(187, 417, 1, 1);
		contentPane.add(list_1);
		
		txtProductId = new JTextField();
		txtProductId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtProductId.setText("Product ID");
		txtProductId.setBounds(26, 168, 142, 35);
		contentPane.add(txtProductId);
		txtProductId.setColumns(10);
		
		txtNameProduct = new JTextField();
		txtNameProduct.setText("Name product");
		txtNameProduct.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNameProduct.setColumns(10);
		txtNameProduct.setBounds(167, 168, 142, 35);
		contentPane.add(txtNameProduct);
		
		txtPrice = new JTextField();
		txtPrice.setText("  Price");
		txtPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPrice.setColumns(10);
		txtPrice.setBounds(308, 168, 142, 35);
		contentPane.add(txtPrice);
		
		txtQuantity = new JTextField();
		txtQuantity.setText("  Quantity");
		txtQuantity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtQuantity.setColumns(10);
		txtQuantity.setBounds(447, 168, 142, 35);
		contentPane.add(txtQuantity);
		
		txtXxxxxxx = new JTextField();
		txtXxxxxxx.setText("xxxxxxx");
		txtXxxxxxx.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtXxxxxxx.setColumns(10);
		txtXxxxxxx.setBounds(26, 203, 142, 35);
		contentPane.add(txtXxxxxxx);
		
		txtProduct = new JTextField();
		txtProduct.setText("Product 1");
		txtProduct.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtProduct.setColumns(10);
		txtProduct.setBounds(167, 203, 142, 35);
		contentPane.add(txtProduct);
		
		txtXxxxxxx_1 = new JTextField();
		txtXxxxxxx_1.setText("xxxxxxx");
		txtXxxxxxx_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtXxxxxxx_1.setColumns(10);
		txtXxxxxxx_1.setBounds(308, 203, 142, 35);
		contentPane.add(txtXxxxxxx_1);
		
		txtXx = new JTextField();
		txtXx.setText("xx");
		txtXx.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtXx.setColumns(10);
		txtXx.setBounds(447, 203, 142, 35);
		contentPane.add(txtXx);
		
		txtXxxxxxxx = new JTextField();
		txtXxxxxxxx.setText("xxxxxxxx");
		txtXxxxxxxx.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtXxxxxxxx.setColumns(10);
		txtXxxxxxxx.setBounds(26, 236, 142, 35);
		contentPane.add(txtXxxxxxxx);
		
		txtProduct_1 = new JTextField();
		txtProduct_1.setText("Product 2");
		txtProduct_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtProduct_1.setColumns(10);
		txtProduct_1.setBounds(167, 236, 142, 35);
		contentPane.add(txtProduct_1);
		
		textField_3 = new JTextField();
		textField_3.setText("xxxxxxx");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(308, 236, 142, 35);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("xx");
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(447, 236, 142, 35);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_3 = new JLabel("Product information");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(33, 307, 135, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Product ID");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(33, 369, 107, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Product name");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(33, 403, 107, 23);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Price");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_1_1.setBounds(33, 437, 107, 23);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Quantity");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_1_1_1.setBounds(33, 471, 107, 23);
		contentPane.add(lblNewLabel_4_1_1_1);
		
		txtXxxxxx = new JTextField();
		txtXxxxxx.setText("xxxxxx");
		txtXxxxxx.setBounds(181, 371, 142, 23);
		contentPane.add(txtXxxxxx);
		txtXxxxxx.setColumns(10);
		
		txtProduct_2 = new JTextField();
		txtProduct_2.setText("Product 3");
		txtProduct_2.setColumns(10);
		txtProduct_2.setBounds(181, 406, 142, 23);
		contentPane.add(txtProduct_2);
		
		txtXxxxxxx_2 = new JTextField();
		txtXxxxxxx_2.setText("xxxxxxx");
		txtXxxxxxx_2.setColumns(10);
		txtXxxxxxx_2.setBounds(181, 440, 142, 23);
		contentPane.add(txtXxxxxxx_2);
		
		txtXx_1 = new JTextField();
		txtXx_1.setText("xx");
		txtXx_1.setColumns(10);
		txtXx_1.setBounds(181, 474, 142, 23);
		contentPane.add(txtXx_1);
		
		JButton btnNewButton_1 = new JButton("Add to stock");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(26, 508, 133, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Delete");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(176, 508, 133, 37);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Updates");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_2.setBounds(325, 508, 133, 37);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Save");
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_2_1.setBounds(481, 508, 133, 37);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("Cancel");
		btnNewButton_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_2_1_1.setBounds(633, 508, 133, 37);
		contentPane.add(btnNewButton_1_2_1_1);
	}
}
