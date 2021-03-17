<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.util.List,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Guest</title>
</head>
<body>
<%!
List<String> CGList = new ArrayList<>();
public void add(String CG)
{
	CGList.add(CG);
	System.out.println("added");
	for(String i:CGList)
	{
		System.out.println(i);
	}
	
}
%>

<%
if(session.getAttribute("uname")==null)
{
	response.sendRedirect("Login.html");
}
%>
<%
String chk = request.getParameter("CG");
if(chk!=null && chk.isEmpty()==false)
{
	add(chk);
	chk=null;
}
%>
<form action="" style="text-align:center" method="post">
<br><br>
Enter the Chief Guest Name:<input type="text" name="CG"><br><br>
<input type="submit" value="add" formaction="#">
<%
session.setAttribute("CGList", CGList);
%>
<input type="submit" value="save and continue" formaction="GuestServlet">

</form>

</body>
</html>