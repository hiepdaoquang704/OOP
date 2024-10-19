package models;

import java.util.ArrayList;

public class CustomerManagement {
	private ArrayList<Customer> ListCustomer;
	public CustomerManagement() {
		this.ListCustomer = new ArrayList<Customer>();
		
	}
	public CustomerManagement(ArrayList<Customer> listCustomer) {
		ListCustomer = listCustomer;
	}
	public ArrayList<Customer> getListCustomer() {
		return ListCustomer;
	}
	public void setListCustomer(ArrayList<Customer> listCustomer) {
		ListCustomer = listCustomer;
	}
	
	
	

}
