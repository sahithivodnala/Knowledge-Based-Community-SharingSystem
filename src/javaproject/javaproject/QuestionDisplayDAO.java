package javaproject.javaproject;

import java.util.ArrayList;

public interface QuestionDisplayDAO {
	public boolean insert(QuestionBean qb);
	public ArrayList<QuestionBean> getAllQuestions();

}
