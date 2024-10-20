package models;

public class User {
	private int UserId;
	private String UserName;
	private String Email;
	private long Phone;
	private String Password;
	private String UserType;
	public User(int userId, String userName, String email, long phoneNumber, String password, String userType) {
		UserId = userId;
		UserName = userName;
		Email = email;
		Phone = phoneNumber;
		Password = password;
		UserType=userType;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		this.UserType = userType;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserName=" + UserName + ", Email=" + Email + ", Phone=" + Phone
				+ ", Password=" + Password + "]";
	}
	
	
}
