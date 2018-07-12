package javaproject.javaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AnswerDAOImpl implements AnswerDAO {
	
	public AnswerDAOImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean insert(AnswerBean ab, String Uname,int qid) {
    	    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/15wh1a1213","kbcss","kbcss");
            PreparedStatement p =con.prepareStatement("insert into answer(qid,Uname,answertext) values(?,?,?)");
            p.setInt(1, qid);
            p.setString(2, Uname);
            p.setString(3, ab.getAnswertext());
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

	public boolean insert(AnswerBean ab) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public ArrayList<AnswerBean> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

}
