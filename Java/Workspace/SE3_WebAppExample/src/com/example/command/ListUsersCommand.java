package com.example.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.service.UserService;
import com.example.business.User;

public class ListUsersCommand implements Command {
	
	public String execute(HttpServletRequest request, HttpServletResponse response){
		UserService userService = new UserService();
		List<User> userList;
		userList= userService.getAllUsers();
		
		HttpSession session= request.getSession();
		session.setAttribute("users", userList);
		
		return "/listUser.jsp";
	}

}
