package javaproject.javaproject;

public class DisplayProfileBean{
String FirstName;
String LastName;
String Email;
String UserName;
String Password;
String ContactNo;
String RollType;
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getContactNo() {
	return ContactNo;
}
public void setContactNo(String contactNo) {
	ContactNo = contactNo;
}
public String getRollType() {
	return RollType;
}
public void setRollType(String rollType) {
	RollType = rollType;
}
public DisplayProfileBean(String firstName, String lastName, String email, String userName, String password,
		String contactNo, String rollType) {
	super();
	FirstName = firstName;
	LastName = lastName;
	Email = email;
	UserName = userName;
	Password = password;
	ContactNo = contactNo;
	RollType = rollType;
}
public DisplayProfileBean() {
	super();
	// TODO Auto-generated constructor stub
}




}
