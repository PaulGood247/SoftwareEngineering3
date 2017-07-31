package com.example.service;

import java.util.List;

import com.example.business.Lesson;
import com.example.dao.LessonDao;
import com.example.exceptions.DaoException;

public class LessonService {

	static LessonDao dao = new LessonDao();
	List<Lesson> lessonList;
	
public List<Lesson> getAllLessons(){
	     try {
			lessonList= dao.getAllLessons() ;
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return lessonList;
    }

public static void addLesson(String lessonName, String lessonLocation, String lessonStartTime,String lessonEndTime, 
		String lessonType, String lessonTutor, String lessonDayOfWeek){
    try {
		dao.addNewLesson(lessonName, lessonLocation, lessonStartTime,lessonEndTime, 
				lessonType, lessonTutor, lessonDayOfWeek) ;
	} catch (DaoException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
