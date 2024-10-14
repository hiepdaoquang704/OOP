package test;

import dao.StockDAO;
import models.Stock;

public class testStockDAO {
	public static void main(String[] args) {
		
		Stock product = new Stock(12,"LAMBORCar",32,2300);
		
		StockDAO.getInstance();
	}
}
