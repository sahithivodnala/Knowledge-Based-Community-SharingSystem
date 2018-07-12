package javaproject.javaproject;

import java.util.ArrayList;

public interface AnswerDAO {
	public boolean insert(AnswerBean ab);
    public ArrayList<AnswerBean> getAllContacts();
	boolean insert(AnswerBean ab, String Uname, int qid);

}
