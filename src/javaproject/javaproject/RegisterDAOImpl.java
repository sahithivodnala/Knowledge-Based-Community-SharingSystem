package javaproject.javaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegisterDAOImpl {
	public RegisterDAOImpl() {
        // TODO Auto-generated constructor stub
    }

    public boolean insert(RegisterBean rb) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/15wh1a1213","kbcss","kbcss");
            PreparedStatement p =con.prepareStatement("insert into Registration1 values(?,?,?,?,?,?,?)");
            p.setString(1, rb.getFirstName());
            p.setString(2, rb.getLastName());
            p.setString(3, rb.getEmail());
            p.setString(4, rb.getUserName());
            p.setString(5, rb.getPassword());
            p.setString(6, rb.getContactNo());
            p.setString(7, rb.getRollType());
            int i = p.executeUpdate();
            if(i!= 0)
                return true;
            else
                return false;
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
        	System.out.println("username already exists");
            e.printStackTrace();
        }
        return false;
    }

	public ArrayList<ProfileBean> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

}
