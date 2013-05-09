<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="modules.home.entitiy.User"%>
<%@page import="java.util.HashMap"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
</head>
<body>
	
	<% HashMap<Integer, User> users = (HashMap<Integer, User>)request.getAttribute("users"); %>
	<% if (users.size() > 0) { %>
	<table>
		<thead>
			<tr>
				<th>#</th>
				<th>Name</th>
				<th>Surname</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
		<% Integer row = 1; %>
		<% for (User user : users.values()) { %>
			<tr>
				<th><%=row %></th>
				<th><%=user.getName() %></th>
				<th><%=user.getSurname() %></th>
				<th><%=user.getAge() %></th>
			</tr>
		<% row++; %>
		<% } %>
		</tbody>
	</table>
	<% } else { %>
		<div>
			Sorry we do not have users register for now.
		</div>
	<% } %>   
	</body>
</html>