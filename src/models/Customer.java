package models;

public class Customer {
	private String name;
	private String Address;
	private String Phone;
	private String Email;
	public Customer() {
		this.name = "";
		this.Address = "";
		this.Phone = "";
		this.Email = "";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
}
