package com.example.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.service.LessonService;

public class AddNewLessonCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse repsonse){
			
		String forwardToJsp = "";		

		String lessonName = request.getParameter("lessonName");
		String lessonLocation = request.getParameter("lessonLocation");
		String lessonStartTime = request.getParameter("lessonStartTime");
		String lessonEndTime = request.getParameter("lessonEndTime");
		String lessonType = request.getParameter("lessonType");
		String lessonTutor = request.getParameter("lessonTutor");
		String lessonDayOfWeek = request.getParameter("lessonDayOfWeek");

		if (lessonName != null && lessonLocation != null && lessonStartTime != null && lessonEndTime != null 
				&& lessonType != null && lessonTutor != null && lessonDayOfWeek != null){

		
			LessonService.addLesson(lessonName, lessonLocation, lessonStartTime,lessonEndTime, 
					lessonType, lessonTutor, lessonDayOfWeek );

			forwardToJsp = "/loginSuccess.jsp";				
		}
		return forwardToJsp;
	}

}

