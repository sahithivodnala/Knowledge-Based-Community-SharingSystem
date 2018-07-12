package javaproject.javaproject;

import java.sql.Date;

public class QuestionBean {
	int qid;
	
	String questionmsg;
	String UserName;
	Date dop;

	public int getQid() {
		return qid;
	}


	public void setQid(int qid) {
		this.qid = qid;
	}


	public Date getDop() {
		return dop;
	}


	public void setDop(Date dop) {
		this.dop = dop;
	}


	public String getQuestionmsg() {
		return questionmsg;
	}


	public void setQuestionmsg(String questionmsg) {
		this.questionmsg = questionmsg;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public QuestionBean(String questionmsg, String userName) {
		super();
		this.questionmsg = questionmsg;
		UserName = userName;
	}


	public QuestionBean() {
		// TODO Auto-generated constructor stub
	}




}    


