package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Stock;
import models.StockManagement;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import Controller.StockManaController;

import javax.swing.Action;
public class Manager extends JFrame {

	private static final long serialVersionUID = 1L;
	public StockManagement model;
	private JPanel contentPane;
	public JTextField textField;
	private JTable table;
	public JTextField txtProductID;
	public JTextField txtProductName;
	public JTextField txtPrice;
	public JTextField txtQuantity;
	private JTable table_stock;

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
		this.model= new StockManagement();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 625);
		
		
		Action action= new StockManaController(this);
		
		
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
		
		JButton btnNewButton_Search = new JButton("Search");
		btnNewButton_Search.addActionListener(action);
		btnNewButton_Search.setBounds(497, 68, 117, 37);
		btnNewButton_Search.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btnNewButton_Search);
		
		JList list = new JList();
		list.setBounds(110, 246, 58, 0);
		contentPane.add(list);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(89, 307, 1, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("     Stock");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(33, 119, 127, 37);
		contentPane.add(lblNewLabel_2);
		
//		table = new JTable();
//		table.setBounds(208, 275, 0, 0);
//		contentPane.add(table);
		
		JList list_1 = new JList();
		list_1.setBounds(187, 417, 1, 1);
		contentPane.add(list_1);
		
		JLabel lblNewLabel_3 = new JLabel("Product information");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(33, 307, 135, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_Productid = new JLabel("Product ID");
		lblNewLabel_Productid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_Productid.setBounds(33, 369, 107, 23);
		contentPane.add(lblNewLabel_Productid);
		
		JLabel lblNewLabelProductName = new JLabel("Product name");
		lblNewLabelProductName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabelProductName.setBounds(33, 403, 107, 23);
		contentPane.add(lblNewLabelProductName);
		
		JLabel lblNewLabelPrice = new JLabel("Price");
		lblNewLabelPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabelPrice.setBounds(33, 437, 107, 23);
		contentPane.add(lblNewLabelPrice);
		
		JLabel lblNewLabelQuantity = new JLabel("Quantity");
		lblNewLabelQuantity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabelQuantity.setBounds(33, 471, 107, 23);
		contentPane.add(lblNewLabelQuantity);
		
		txtProductID = new JTextField();
		txtProductID.setBounds(181, 371, 142, 23);
		contentPane.add(txtProductID);
		txtProductID.setColumns(10);
		
		txtProductName = new JTextField();
		txtProductName.setColumns(10);
		txtProductName.setBounds(181, 406, 142, 23);
		contentPane.add(txtProductName);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(181, 440, 142, 23);
		contentPane.add(txtPrice);
		
		txtQuantity = new JTextField();
		txtQuantity.setColumns(10);
		txtQuantity.setBounds(181, 474, 142, 23);
		contentPane.add(txtQuantity);
		
		JButton btnNewButton_Add2Stock = new JButton("Add");
		btnNewButton_Add2Stock.addActionListener(action);
		
		btnNewButton_Add2Stock.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_Add2Stock.setBounds(26, 508, 133, 37);
		contentPane.add(btnNewButton_Add2Stock);
		
		JButton btnNewButton_Delete = new JButton("Delete");
		btnNewButton_Delete.addActionListener(action);
		btnNewButton_Delete.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_Delete.setBounds(176, 508, 133, 37);
		contentPane.add(btnNewButton_Delete);
		
		JButton btnNewButton_Update = new JButton("Update");
		btnNewButton_Update.addActionListener(action);
		
		
		btnNewButton_Update.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_Update.setBounds(325, 508, 133, 37);
		contentPane.add(btnNewButton_Update);
		
		JButton btnNewButton_Save = new JButton("Save");
		btnNewButton_Save.addActionListener(action);
		btnNewButton_Save.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_Save.setBounds(481, 508, 133, 37);
		contentPane.add(btnNewButton_Save);
		
		
		
		JButton btnNewButton_Cancel = new JButton("Cancel");
		
		btnNewButton_Cancel.addActionListener(action);
		
		btnNewButton_Cancel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_Cancel.setBounds(633, 508, 133, 37);
		contentPane.add(btnNewButton_Cancel);
		
		table_stock = new JTable();
		table_stock.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table_stock.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ProductID", "ProductName", "Price", "Quantity"
			}
		));
		JScrollPane scrollPaneTable = new JScrollPane(table_stock);
		scrollPaneTable.setBounds(68, 154, 656, 117);
		contentPane.add(scrollPaneTable);
		this.setVisible(true);
	}

	public void RemoveForm() {
		txtProductID.setText("");
		txtPrice.setText("");
		txtProductName.setText("");
		txtQuantity.setText("");
		
	}

	public void AddorUpdateProduct(Stock product) {
	    DefaultTableModel model_table = (DefaultTableModel) table_stock.getModel();
	    if (!this.model.CheckExisted(product)) {
	        this.model.insert(product);
	        model_table.addRow(new Object[]{
	                product.getProductID() + "",
	                product.getNameProduct(),
	                product.getPrice() + "",
	                product.getQuantity() + ""});
	    } else {
	        this.model.update(product);
	        int num_rows = model_table.getRowCount();
	        for (int i = 0; i < num_rows; i++) {
	            String id = model_table.getValueAt(i, 0) + "";
	            if (id.equals(product.getProductID() + "")) {
	                model_table.setValueAt(product.getProductID() + "", i, 0);
	                model_table.setValueAt(product.getNameProduct(), i, 1);  // Corrected line
	                model_table.setValueAt(product.getPrice() + "", i, 2);  // Corrected line
	                model_table.setValueAt(product.getQuantity() + "", i, 3);  // Corrected line
	            }
	        }
	    }
	}


	public void ShowInfor() {
	    DefaultTableModel model_table = (DefaultTableModel) table_stock.getModel();
	    int i_row = table_stock.getSelectedRow();

	    int ProductID = Integer.valueOf(model_table.getValueAt(i_row, 0) + "");
	    String NameProduct = model_table.getValueAt(i_row, 1) + "";
	    float Price = Float.valueOf(model_table.getValueAt(i_row, 2) + "");
	    int Quantity = Integer.valueOf(model_table.getValueAt(i_row, 3) + "");

	    this.txtProductID.setText(ProductID + "");
	    this.txtPrice.setText(Price + "");
	    this.txtQuantity.setText(Quantity + "");  
	    this.txtProductName.setText(NameProduct);
	}
}