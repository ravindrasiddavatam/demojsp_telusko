<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body>
		<%
				try{
					int k=9/0;
				}
				catch(Exception e){
					out.println("Error" +e.getMessage());
				}
		%>
</body>
</html>