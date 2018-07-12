package javaproject.javaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DisplayProfileDAOImpl {
	
		private ArrayList<DisplayProfileBean> DisplayProfileList;



		public boolean insert(DisplayProfileBean d, String userName) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con= DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/15wh1a1213","kbcss","kbcss");
				PreparedStatement p =con.prepareStatement("insert into Registration1(questionmsg,Username) values(?,?)");
				
				p.setString(2, userName);
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
				e.printStackTrace();
			}
			return false;
		}


		public ArrayList<DisplayProfileBean> getAllDetails() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con= DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/15wh1a1213","kbcss","kbcss");
				PreparedStatement p =con.prepareStatement("select * from Registration1");
				ResultSet rs = p.executeQuery();
				ArrayList<DisplayProfileBean> questionList = new ArrayList<DisplayProfileBean>();
				while(rs.next()){
					DisplayProfileBean lb =new DisplayProfileBean();
					lb.setFirstName(rs.getString(1));
					lb.setLastName(rs.getString(2));
					lb.setEmail(rs.getString(3));
					lb.setUserName(rs.getString(4));
					lb.setPassword(rs.getString(5));
					lb.setContactNo(rs.getString(6));
					lb.setRollType(rs.getString(7));
					questionList.add(lb);

				}
				return DisplayProfileList;

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		


		public boolean insert(DisplayProfileBean db) {
			// TODO Auto-generated method stub
			return false;
		}
}



