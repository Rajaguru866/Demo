<%@ page isErrorPage="true" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList,campaign.Participant"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Participant Details</title>
</head>
<body>
<%
if(session.getAttribute("uname")==null)
{
	response.sendRedirect("Login.html");
}

%>
<br><br>
<div style="text-align:center" style="table-align:center">
<h2 >Participants Details</h2><br><br>
<table style="margin:0px auto;" border="1">
<tr>
<th>Name</th>
<th>Qualification</th>
<th>Contact Number</th>
<th>Address</th>
</tr>
<c:forEach items="${participant}" var="pt">
<tr>
<td>${pt.name}</td>
<td>${pt.degree}</td>
<td>${pt.mobno}</td>
<td>${pt.address}</td>
</tr>
</c:forEach>
</table>
<br><br>

<a href="Admin.jsp" >back</a>
</div>

<%--
ArrayList<Participant> parList = (ArrayList<Participant>) request.getAttribute("participant");

--%>

</body>
</html>