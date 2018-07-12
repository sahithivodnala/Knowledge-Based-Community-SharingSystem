import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javaproject.javaproject.ProfileBean;
import javaproject.javaproject.ProfileDAO;
import javaproject.javaproject.QuestionBean;
import javaproject.javaproject.ProfileBean;

public class ProfileDaoImpl implements ProfileDAO{



public ProfileDaoImpl() {
	        // TODO Auto-generated constructor stub
	    }

	    @Override
	    public boolean insert(ProfileBean pb, String userName) {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con= DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/15wh1a1213","kbcss","kbcss");
	            PreparedStatement p =con.prepareStatement("insert into questions2(questionmsg,Username) values(?,?)");
	            p.setString(1, pb.getQuestionmsg());
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

	
		

			public ArrayList<ProfileBean> getAllContacts() {
				  try {
			            Class.forName("com.mysql.jdbc.Driver");
			            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/15wh1a1213","root","tiger");
			            PreparedStatement p =con.prepareStatement("select Username,questionmsg from questions2");
			            ResultSet rs = p.executeQuery();
			            ArrayList<ProfileBean> Displaylist = new ArrayList<ProfileBean>();
			            while(rs.next()){
			                ProfileBean lb =new ProfileBean(rs.getString(1),rs.getString(2));
			                Displaylist.add(lb);
			           
			            }
			            return Displaylist;
			           
			        } catch (ClassNotFoundException e) {
			            // TODO Auto-generated catch block
			            e.printStackTrace();
			        } catch (SQLException e) {
			            // TODO Auto-generated catch block
			            e.printStackTrace();
			        }
			        return null;
			    }
			// TODO Auto-generated method stub
		

	
		public boolean insert(ProfileBean pb) {
			// TODO Auto-generated method stub
			return false;
		}

		public ArrayList<ProfileBean> getAllQuestions() {
			// TODO Auto-generated method stub
			return null;
		}

}
