package models;

import java.util.ArrayList;

public class UserManagement {
	private ArrayList<User> ListUser;
	public UserManagement() {
		this.ListUser = new ArrayList<User>();
		
	}
	public UserManagement(ArrayList<User> listUser) {
		ListUser = listUser;
	}
	public ArrayList<User> getListUser() {
		return ListUser;
	}
	public void setListUser(ArrayList<User> listUser) {
		ListUser = listUser;
	}
	

}