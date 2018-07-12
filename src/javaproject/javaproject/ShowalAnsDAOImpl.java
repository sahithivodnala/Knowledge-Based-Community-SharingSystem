package javaproject.javaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ShowalAnsDAOImpl {
	public boolean insert(AnswerBean q, int qid) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/15wh1a1213","kbcss","kbcss");
			PreparedStatement p =con.prepareStatement("select questionmsg,answertext from questions2 join answer on questions2.Qid = answer.qid and questions2.Qid = ? values(?)");
			//p.setString(1, q.getAnswertext());
			p.setInt(1, qid);
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


	public ArrayList<AnswerBean> getAllAnswers(QuestionBean qb) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/15wh1a1213","kbcss","kbcss");
			PreparedStatement p =con.prepareStatement("select answer.qid,questionmsg,answertext, Uname from questions2 join answer on questions2.Qid = answer.qid and questions2.Qid = ?");
			p.setInt(1, qb.getQid());
			ResultSet rs = p.executeQuery();
			ArrayList<AnswerBean> questionList = new ArrayList<AnswerBean>();
			while(rs.next()){
				AnswerBean lb =new AnswerBean();
				lb.setQid(rs.getInt(1));
				lb.setAnswertext(rs.getString(3));
				lb.setUname(rs.getString(4));
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
	


	public boolean insert(AnswerBean ab) {
		// TODO Auto-generated method stub
		return false;
	}

}
