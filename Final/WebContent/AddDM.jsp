<%@ page isErrorPage="true" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date Manage</title>
</head>
<body>
<%
if(session.getAttribute("uname")==null)
{
	response.sendRedirect("Login.html");
}

%>
<br><br>
<form action="AddDateServlet" style="text-align:center" method="post">
Update the Event Date(dd-mm-yyyy):<input type="text" name="ED">
<br><br>
Update the Donation Date(dd-mm-yyyy):<input type="text" name="DD"><br><br>
<input type="submit" value="submit">
<br><br>
<a href="Admin.jsp">back</a>

</form>


</body>
</html>