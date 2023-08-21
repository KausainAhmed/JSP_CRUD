<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.Service.UService" %>
    <jsp:useBean id="u" class="com.Bean.Student"></jsp:useBean>
    <jsp:setProperty property="*" name="u"/>
    <%@page errorPage="AddUserError.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int i=UService.save(u);
if(i>0){
	response.sendRedirect("Success.jsp");  }
	else {
		response.sendRedirect("AddUserError.jsp");
	} 
%>
</body>
</html>