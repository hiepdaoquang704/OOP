package test;
import models.Stock;
import dao.StockDAO;
public class testStockDAO {
	public static void main(String[] args) {
		Stock product1= new Stock(0, "LAMBOGINI",1,2500);
		Stock product2= new Stock(1, "Porsche",1,2500);
		
		StockDAO.getInstance().Insert(product1);
	}
 
}
