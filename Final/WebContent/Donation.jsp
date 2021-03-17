<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donation</title>
</head>
<body>
<%
int chk=(int)(request.getAttribute("diff"));

%>
<br><br>

<div Style = "text-align:center">

<%
if(chk<0) { %>
<h2>Donation due date already ended on ${date}</h2>
<br><br>
<a href="Login.html">back</a>
<%}else{ %>
<h2>Donation due date is ${date}</h2><br><br>
<form action="" method="post">
Enter the details<br><br>
Enter Your Name:<input type="text" name="name"><br><br>
Enter Your Mail-ID:<input type="email" name="mailid"><br><br>
Enter Your Contact Number:<input type="text" name="mobno"><br><br>
Enter the Amount:<input type="text" name="amount"><br><br>
<input type="submit" value="submit" formaction="AddDonationServlet">
<input type="submit" value="back" formaction="Login.html">
</form>
<%} %>
</div>
</body>
</html>