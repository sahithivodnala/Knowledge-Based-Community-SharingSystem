package javaproject.javaproject;

public class LoginBean {
	String Username;
    String Password;
   
    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public LoginBean(String Username, String Password) {
        super();
        this.Username = Username;
        this.Password = Password;
    }
    public LoginBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String toString() {
		return "LoginBean [Username=" + Username + ", Password=" + Password + "]";
	}

}

