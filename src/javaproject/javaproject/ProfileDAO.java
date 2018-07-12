package javaproject.javaproject;

import java.util.ArrayList;

public interface ProfileDAO {
	 public boolean insert(ProfileBean pb);
	    public ArrayList<ProfileBean> getAllContacts();
		boolean insert(ProfileBean pb, String userName);


}
