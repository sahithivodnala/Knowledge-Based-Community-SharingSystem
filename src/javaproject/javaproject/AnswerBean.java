package javaproject.javaproject;

import java.sql.Date;

public class AnswerBean {
	String answertext;
    String Uname;
    int qid;
    int aid;
    Date dop;
	public String getAnswertext() {
		return answertext;
	}
	public void setAnswertext(String answertext) {
		this.answertext = answertext;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public Date getDop() {
		return dop;
	}
	public void setDop(Date dop) {
		this.dop = dop;
	}
	public AnswerBean() {
		super();
		// TODO Auto-generated constructor stub
	}
}
