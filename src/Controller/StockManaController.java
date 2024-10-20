package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.sql.SQLException;

import javax.swing.Action;
import javax.swing.JOptionPane;

import Views.Manager;
import models.Stock;

public class StockManaController implements Action {
	public Manager view;
	
public StockManaController(Manager view) {
		this.view = view;
		
	}

	//	
public void actionPerformed(ActionEvent e) {
    String cm = e.getActionCommand();
    if (cm.equals("Add")) {
        this.view.RemoveForm();
        this.view.model.setSelect("Add");
    } else if (cm.equals("Save")) {
        try {
            // Get data from input fields
            int ProductID = Integer.valueOf(this.view.txtProductID.getText().trim());
            String NameProduct = this.view.txtProductName.getText().trim();
            int Quantity = Integer.valueOf(this.view.txtQuantity.getText().trim());
            String priceText = this.view.txtPrice.getText().trim();

            // Validate and sanitize input for Price
            if (!priceText.matches("[0-9]*\\.?[0-9]+")) {
                throw new NumberFormatException("Invalid price format");
            }

            float Price = Float.valueOf(priceText);

            Stock product = new Stock(ProductID, NameProduct, Quantity, Price);

            this.view.AddorUpdateProduct(product);
            this.view.loadDataToTable();
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(this.view, "Invalid input: " + e1.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
            e1.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    } else if (cm.equals("Update")) {
        this.view.ShowInfor();
    } else if (cm.equals("Delete")) {
        try {
            this.view.RemoveProduct();
            this.view.loadDataToTable(); // Refresh table model after delete
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    } else if (cm.equals("Search")) {
        try {
            int productID = Integer.valueOf(this.view.textField_Seach.getText().trim());
            this.view.searchProductByID(productID);
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(this.view, "Invalid Product ID", "Input Error", JOptionPane.ERROR_MESSAGE);
            e1.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    } else if (cm.equals("Cancel")) {
        try {
            this.view.cancelSearch();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}


	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}
}
