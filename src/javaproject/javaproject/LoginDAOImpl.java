package javaproject.javaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public  class LoginDAOImpl implements LoginDAO {
	public LoginDAOImpl() {
        // TODO Auto-generated constructor stub
    }

    public boolean insert(RegisterBean pb) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/15wh1a1213","kbcss","kbcss");
            PreparedStatement p =con.prepareStatement("insert into Registration1 values(?,?)");
            p.setString(1, pb.getUserName());
            p.setString(2, pb.getPassword());
            if(p.executeUpdate()==1)
                return true;
            else
                return false;
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String args[]){
        LoginBean l = new LoginBean("?","?");
      //  LoginDAOImpl ll=new LoginDAOImpl();
     //   ll.insert(l);
    }

    public ArrayList<RegisterBean> getAllDetails() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/15wh1a1213","kbcss","kbcss");
            PreparedStatement p =con.prepareStatement("select * from Registration1");
            ResultSet rs = p.executeQuery();
            ArrayList<RegisterBean> Loginlist = new ArrayList<RegisterBean>();
            while(rs.next()){
                RegisterBean pb =new RegisterBean();
                pb.setFirstName(rs.getString(1));
                pb.setLastName(rs.getString(2));
                pb.setEmail(rs.getString(3));
                pb.setUserName(rs.getString(4));
                pb.setContactNo(rs.getString(6));
                pb.setRollType(rs.getString(7));
                Loginlist.add(pb);
           
            }
            return Loginlist;
           
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public RegisterBean verify(RegisterBean pb)  {
		  try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con= DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/15wh1a1213","kbcss","kbcss");
	            PreparedStatement p =con.prepareStatement("select * from Registration1 where UserName = ? and Password = ?");
	            p.setString(1, pb.getUserName());
	            p.setString(2, pb.getPassword());
	            System.out.println(pb);
	            ResultSet rs = p.executeQuery();
	            if(rs.next()) {
	            	pb.setFirstName(rs.getString(1));
	            	pb.setLastName(rs.getString(2));
	            	pb.setEmail(rs.getString(3));
	            	pb.setContactNo(rs.getString(6));
	            	pb.setRollType(rs.getString(7));
	            	pb.setUserName(rs.getString(4));
	            	
	                return pb;
	            }
	            else
	                return null ;
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return null;
	}

	


	@Override
	public boolean insert(LoginBean lb) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<LoginBean> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}
}