package Views;
import dao.StockDAO;
import database.JDBCUtil;
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
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import Controller.StockManaController;

import javax.swing.Action;
public class Manager extends JFrame {

	private static final long serialVersionUID = 1L;
	public StockManagement model;
	
	private StockDAO stockDAO;
	
	private JPanel contentPane;
	public JTextField textField_Seach;
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


	public Manager() throws SQLException {
		this.model= new StockManagement();
		stockDAO = new StockDAO();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 625);
		
		
		Action action= new StockManaController(this);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("        Manager - Bussiness Management");
		lblNewLabel.setBounds(207, 26, 412, 47);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Product ID");
		lblNewLabel_1.setBounds(110, 72, 107, 37);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		textField_Seach = new JTextField();
		textField_Seach.setBounds(207, 72, 251, 32);
		contentPane.add(textField_Seach);
		textField_Seach.setColumns(10);
		
		JButton btnNewButton_Search = new JButton("Search");
		btnNewButton_Search.addActionListener(action);
		btnNewButton_Search.setBounds(488, 67, 117, 37);
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
		btnNewButton_Delete.setBounds(216, 508, 133, 37);
		contentPane.add(btnNewButton_Delete);
		
		JButton btnNewButton_Update = new JButton("Update");
		btnNewButton_Update.addActionListener(action);
		
		
		btnNewButton_Update.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_Update.setBounds(393, 508, 133, 37);
		contentPane.add(btnNewButton_Update);
		
		JButton btnNewButton_Save = new JButton("Save");
		btnNewButton_Save.addActionListener(action);
		btnNewButton_Save.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_Save.setBounds(575, 508, 133, 37);
		contentPane.add(btnNewButton_Save);
		
		
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
		
		JButton btnNewButton_CancelSearch = new JButton("Cancel");
		btnNewButton_CancelSearch.addActionListener(action);
		btnNewButton_CancelSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_CancelSearch.setBounds(615, 67, 117, 37);

		
		contentPane.add(btnNewButton_CancelSearch);
		loadDataToTable();

		this.setVisible(true);
	}

	public void RemoveForm() {
		txtProductID.setText("");
		txtPrice.setText("");
		txtProductName.setText("");
		txtQuantity.setText("");
		
	}

    public void AddorUpdateProduct(Stock product) throws SQLException {
        DefaultTableModel model_table = (DefaultTableModel) table_stock.getModel();
        if (!stockDAO.CheckExisted(product)) { 
		    stockDAO.Insert(product);
		} else if(stockDAO.CheckExisted(product)) {
		    stockDAO.Update(product);  
		}
	    loadDataToTable();
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

    public void RemoveProduct() throws SQLException {
        DefaultTableModel model_table = (DefaultTableModel) table_stock.getModel();
        int i_row = table_stock.getSelectedRow();
        if (i_row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a product to delete.");
            return;
        }

	    int ProductID = Integer.valueOf(model_table.getValueAt(i_row, 0) + "");
	    String NameProduct = model_table.getValueAt(i_row, 1) + "";
	    float Price = Float.valueOf(model_table.getValueAt(i_row, 2) + "");
	    int Quantity = Integer.valueOf(model_table.getValueAt(i_row, 3) + "");
        
	    Stock product = new Stock(ProductID,NameProduct,Quantity,Price);
        stockDAO.Delete(product);  
		model_table.removeRow(i_row);  
    }
    
    public void loadDataToTable() throws SQLException {
        DefaultTableModel model_table = (DefaultTableModel) table_stock.getModel();
        model_table.setRowCount(0);  
        for (Stock product : stockDAO.selectAll()) { 
		    model_table.addRow(new Object[]{
		        product.getProductID(),
		        product.getNameProduct(),
		        product.getPrice(),
		        product.getQuantity()
		    });
		}
    }
    public void searchProductByID(int productID) throws SQLException {
        DefaultTableModel model_table = (DefaultTableModel) table_stock.getModel();
        model_table.setRowCount(0);  // Clear the table
        Stock searchProduct= new Stock();
        searchProduct.setProductID(productID);
        Stock product = stockDAO.selectById(searchProduct);  
        if (product != null) {
            model_table.addRow(new Object[]{
                product.getProductID(),
                product.getNameProduct(),
                product.getPrice(),
                product.getQuantity()
            });
        } else {
            JOptionPane.showMessageDialog(this, "Product not found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public void cancelSearch() throws SQLException {
        loadDataToTable(); 
    }
}