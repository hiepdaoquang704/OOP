package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

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
	@Override
	public void actionPerformed(ActionEvent e) {
	    String cm = e.getActionCommand();
//	    JOptionPane.showMessageDialog(view, cm);
	    if (cm.equals("Add")) {
	        this.view.RemoveForm();
	        this.view.model.setSelect("Add");
	    } else if (cm.equals("Save")) {
	        try {
	            // get data
	            int ProductID = Integer.valueOf(this.view.txtProductID.getText());
	            String NameProduct = this.view.txtProductName.getText();
	            int Quantity = Integer.valueOf(this.view.txtQuantity.getText());
	            float Price = Float.valueOf(this.view.txtPrice.getText());  // Corrected line
	            
	            Stock product = new Stock(ProductID, NameProduct, Quantity, Price);
	            
	            this.view.AddorUpdateProduct(product);
	        } catch (NumberFormatException e1) {
	            e1.printStackTrace();
	        }
	    } else if (cm.equals("Update")) {
	        this.view.ShowInfor();
	    } else if (cm.equals("Delete")) {
	        this.view.RemoveProduct();
	    }
	    else if (cm.equals("Cancel")) {

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
