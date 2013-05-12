<%@page import="modules.user.entitiy.User"%>
<%@page import="java.util.HashMap"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta charset="UTF-8">
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
				<div> There are not users.</div>
		<% } %>   
	</body>
</html>