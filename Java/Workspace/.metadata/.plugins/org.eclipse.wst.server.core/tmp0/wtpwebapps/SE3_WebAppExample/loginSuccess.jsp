<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	
	<c:set var="user" value="${sessionScope.user}"/>
	<b>Hello <c:out value="${user.firstName}"/>, you are now logged in...</b>
	<b>What would like to do?</b>
	
	<br/><br/>
	
	<form action="FrontController" method="post">
	     <input type="hidden" name="action" value="ListUsers" />
         <input type="submit" value="List Users" />
    </form>  
    <form action="FrontController" method="post">
	     <input type="hidden" name="action" value="ShowLessons" />
         <input type="submit" value="Show Lessons" />
    </form>   
    <form action="FrontController" method="post">
	     <input type="hidden" name="action" value="AddLesson" />
         <input type="submit" value="Add Lesson" />
    </form>   
		
</body>

</html>