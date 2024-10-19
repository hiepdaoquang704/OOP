package models;

import java.util.Objects;

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
	@Override
	public int hashCode() {
		return Objects.hash(Address, Email, Phone, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(Email, other.Email)
				&& Objects.equals(Phone, other.Phone) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", Address=" + Address + ", Phone=" + Phone + ", Email=" + Email + "]";
	}
	
	
}
