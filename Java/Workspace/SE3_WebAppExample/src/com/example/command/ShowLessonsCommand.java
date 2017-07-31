package com.example.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.service.UserService;
import com.example.business.Lesson;

public class ShowLessonsCommand implements Command {
	
	public String execute(HttpServletRequest request, HttpServletResponse response){
		UserService lessonService = new UserService();
		List<Lesson> lessonList;
		lessonList= lessonService.getAllLessons();
		
		System.out.println("Lesson Command executed" + lessonList);
		HttpSession session= request.getSession();
		session.setAttribute("lessons", lessonList);
		
		return "/showLessons.jsp";
	}

}