package models;

import java.util.ArrayList;

public class StockManagement {
	private ArrayList<Stock> ListProduct;
	private String Select;
	public StockManagement() {
		this.ListProduct = new ArrayList<Stock>();
		this.Select="";
	}

	public StockManagement(ArrayList<Stock> listProduct) {
		super();
		ListProduct = listProduct;
	}

	public ArrayList<Stock> getListProduct() {
		return ListProduct;
	}

	public void setListProduct(ArrayList<Stock> listProduct) {
		ListProduct = listProduct;
	}
	public void insert(Stock product) {
		this.ListProduct.add(product);
	}
	public void delete(Stock product) {
		this.ListProduct.remove(product);
	}
	public void update (Stock product) {
		this.ListProduct.remove(product);
		this.ListProduct.add(product);
	}

	public String getSelect() {
		return Select;
	}

	public void setSelect(String select) {
		Select = select;
	}

	public boolean CheckExisted(Stock product) {
		for (Stock pd:ListProduct){
			if(pd.getProductID()==product.getProductID())
				return true;
		}
		return false;
	}

	
}
