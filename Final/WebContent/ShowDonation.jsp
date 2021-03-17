<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList,campaign.Participant"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donation Details</title>
</head>
<body>
<%
if(session.getAttribute("uname")==null)
{
	response.sendRedirect("Login.html");
}
int total=0;
int value=0;
%>
<br><br>
<div style="text-align:center" style="table-align:center">
<h2 >Participants Details</h2><br><br>
<table style="margin:0px auto;" border="1">
<tr>
<th>Name</th>
<th>Contact Number</th>
<th>Mail-Id</th>
<th>Amount</th>
<th>Donation Date</th>
</tr>
<c:forEach items="${donList}" var="dl">
<tr>
<td>${dl.name}</td>
<td>${dl.mobno}</td>
<td>${dl.mailid}</td>
<td>${dl.amount}</td>
<td>${dl.date}</td>

</tr>
</c:forEach>
</table>
<br>
<h4 >Total Donation Amount is ${total}</h4>

<a href="Admin.jsp" >back</a>
</div>



</body>
</html>