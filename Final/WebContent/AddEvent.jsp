<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.util.List,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Events</title>
</head>
<body>
<%!
List<String> eventList = new ArrayList<>();
public void add(String CG)
{
	eventList.add(CG);
	System.out.println("added");
	for(String i:eventList)
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
String chk = request.getParameter("event");
if(chk!=null && chk.isEmpty()==false)
{
	add(chk);
	chk=null;
}
%>
<form action="" style="text-align:center" method="post">
<br><br>
Enter the Event:<input type="text" name="event"><br><br>
<input type="submit" value="add" formaction="#">
<%
session.setAttribute("eventList", eventList);
%>
<input type="submit" value="save and continue" formaction="EventServlet">

</form>

</body>
</html>