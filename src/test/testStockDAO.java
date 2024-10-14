package test;
import models.Stock;

import java.util.ArrayList;

import dao.StockDAO;
public class testStockDAO {
	public static void main(String[] args) {
		//test insert
//		Stock product1= new Stock(0, "LAMBOGINI",1,2500);
//		Stock product2= new Stock(1, "Porsche",1,2500);
//		
//		StockDAO.getInstance().Insert(product1);
//		for (int i=0;i<1000;i++) {
//			Stock product1= new Stock(0, "LAMBOGINI",1,2500);
//			StockDAO.getInstance().Insert(product1);
//		}
		
		
		
		//test update
//		Stock product1= new Stock(2, "LAMBOGINI",1,2300);
//		StockDAO.getInstance().Update(product1);
		
		//test delete 
//		Stock product2= new Stock(2, "LAMBOGINI",1,2300);
//		StockDAO.getInstance().Delete(product2);
		//test select
		System.out.println("-------------------------");
		ArrayList<Stock> list=StockDAO.getInstance().selectAll();
		for (Stock stock :list) {
			System.out.println(stock.toString());
		}
		
		System.out.println("-------------------------");
		Stock find= new Stock();
		find.setProductID(1);
		Stock stock2 =StockDAO.getInstance().selectById(find);
		System.out.println(stock2);
		
		System.out.println("-------------------------");
		ArrayList<Stock> list2=StockDAO.getInstance().selectByCondition("Price<2400");
		for (Stock stock :list2) {
			System.out.println(stock.toString());
		}
		
		
		
		
	}
 
}
