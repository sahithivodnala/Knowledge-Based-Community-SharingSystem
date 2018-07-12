package javaproject.javaproject;

public class ProfileBean 
{

     String questionmsg;
     String UserName;

    
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


	public ProfileBean(String questionmsg, String userName) {
		super();
		this.questionmsg = questionmsg;
		UserName = userName;
	}



	

    }    