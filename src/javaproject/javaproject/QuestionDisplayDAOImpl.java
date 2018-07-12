package javaproject.javaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QuestionDisplayDAOImpl implements QuestionDisplayDAO{
	public boolean insert(QuestionBean q, String userName) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/15wh1a1213","kbcss","kbcss");
			PreparedStatement p =con.prepareStatement("insert into questions2(questionmsg,Username) values(?,?)");
			p.setString(1, q.getQuestionmsg());
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


	public ArrayList<QuestionBean> getAllQuestions() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/15wh1a1213","kbcss","kbcss");
			PreparedStatement p =con.prepareStatement("select * from questions2");
			ResultSet rs = p.executeQuery();
			ArrayList<QuestionBean> questionList = new ArrayList<QuestionBean>();
			while(rs.next()){
				QuestionBean lb =new QuestionBean();
				lb.setQid(rs.getInt(1));
				lb.setQuestionmsg(rs.getString(3));
				questionList.add(lb);

			}
			return questionList;

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
	public boolean insert(QuestionBean qb) {
		// TODO Auto-generated method stub
		return false;
	}


	public ArrayList<AnswerBean> getAllAnswers() {
		// TODO Auto-generated method stub
		return null;
	}


	
}

