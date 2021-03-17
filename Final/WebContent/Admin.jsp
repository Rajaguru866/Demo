<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
<%
if(session.getAttribute("uname")==null)
{
	response.sendRedirect("Login.html");
}

%>
<form action="Login.html" style="text-align:center" method="post">
<br><br>
<a href="AddGuest.jsp">Add Chiefguest</a><br><br>
<a href="AddEvent.jsp">Add Event</a><br><br>
<a href="ParticipantServlet">Show Participants</a><br><br>
<a href="DonationServlet">Show Donations</a><br><br>
<a href="AddDM.jsp">Manage the date</a><br><br>

<input type="submit" value="logout" >
</form>


</body>
</html>