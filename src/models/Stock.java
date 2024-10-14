package models;

public class Stock {
	private int  ProductID;
	private String NameProduct;
	private int Quantity;
	private float Price;
	
	public Stock() {
		
	}
	public Stock(int productID, String nameProduct, int quantity, float price) {
		ProductID = productID;
		NameProduct = nameProduct;
		Quantity = quantity;
		Price = price;
	}
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getNameProduct() {
		return NameProduct;
	}
	public void setNameProduct(String nameProduct) {
		NameProduct = nameProduct;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Stock [ProductID=" + ProductID + ", NameProduct=" + NameProduct + ", Quantity=" + Quantity + ", Price="
				+ Price + "]";
	}
	
}
