package javaproject.javaproject;

import java.util.ArrayList;

public interface LoginDAO {
	public boolean insert(LoginBean lb);
	public ArrayList<LoginBean> getAllContacts();

}
