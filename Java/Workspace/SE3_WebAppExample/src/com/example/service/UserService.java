package com.example.service;

import java.util.List;

import com.example.business.Lesson;
import com.example.business.User;
import com.example.dao.LessonDao;
import com.example.dao.UserDao;
import com.example.exceptions.DaoException;

public class UserService {

	UserDao dao = new UserDao();
	List<User> userList;
	
	public User login(String username, String password){
		
		User u = null;
		try {			
			u = dao.findUserByUsernamePassword(username, password);
		} 
		catch (DaoException e) {
			e.printStackTrace();
		}
		
		;
		return u;
		
		
	}
	
public List<User> getAllUsers(){
	     userList= dao.getAllUsers() ;
    	return userList;
    }

LessonDao dao1 = new LessonDao();
List<Lesson> lessonList;

public List<Lesson> getAllLessons(){
	System.out.println("HERE 1");
	     try {
	    	 System.out.println("HERE 2");
			lessonList= dao1.getAllLessons() ;
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return lessonList;
    }
	
	
}