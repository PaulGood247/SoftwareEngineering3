<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.*" %>
<%@ page import="com.example.business.Lesson" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List All Users</title>
</head>
<body>

<table>
<tr><th>ID</th><th>Lesson Name</th><th>Lesson Location</th><th>Lesson Start Time</th><th>Lesson End Time</th><th>Lesson Type</th><th>Lesson Tutor</th><th>Lesson Day Of Week</th></tr>
<%
	List<Lesson> lessons;
lessons = (List<Lesson>)(request.getSession().getAttribute("lessons"));

if (lessons != null){

  for (Lesson l : lessons){
%>

	<tr>
	  <td><%=l.getId()%></td>
	  <td><%=l.getLessonName()%></td>
	  <td><%=l.getLessonLocation()%></td>
	  <td><%=l.getLessonStartTime()%></td>
	  <td><%=l.getLessonEndTime()%></td>
	  <td><%=l.getLessonType()%></td>
	  <td><%=l.getLessonTutor()%></td>
	  <td><%=l.getLessonDayOfWeek()%></td>
	</tr>

<% 
  }
}else{
	%> <tr><td>NULL</td></tr><%
}
%>
</table>


</body>
</html>