<%@ page isErrorPage="true" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Campaign</title>
</head>
<body>
<%
int chk=(int)(request.getAttribute("diff"));

%>
<br><br>

<div Style = "text-align:center">

<%
if(chk<0) { %>
<h2>Event already ended on ${date}</h2>
<%}else{ %>
<%  if(chk==0) { %>
<h2>Today is the Event Date</h2>
<%}else{ %>
<h2>Event date is ${date}</h2>
<%} %>
<br>
<h3>Chief Guests</h3>
<br>
<c:forEach items="${gList }" var="guest">
${guest}<br><br>
</c:forEach>
<h3>Events Planned</h3><br>
<c:forEach items="${eList }" var="event">
${event}<br><br>
</c:forEach>
<br><br>
<a href="Register.html">Register</a>
<%} %>
<br><br>
<a href="Login.html">back</a>
</div>
</body>
</html>