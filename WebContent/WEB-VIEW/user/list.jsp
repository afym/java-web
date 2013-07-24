<%@page import="modules.user.entitiy.User"%>
<%@page import="java.util.HashMap"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
	<head>
		<meta charset="UTF-8">
		<title>User List</title>
	</head>
	<body>
		<c:set var="usersQuatity" scope="page" value="${users.size()}"/>
		<c:choose>
		    <c:when test="${usersQuatity > 0}">
		       <table>
				<thead>
					<tr>
						<th>#</th>
						<th>Name</th>
						<th>Surname</th>
						<th>Age</th>
						<th>Management</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${users}" var="user">
						<tr>
							<th>${user.key}</th>
							<th>${user.value.getName()}</th>
							<th>${user.value.getSurname()}</th>
							<th>${user.value.getAge()}</th>
							<th>
								<a href="update?id=${user.key}">Update</a>
								<a href="delete?id=${user.key}">Delete</a>
							</th>
						</tr>
					</c:forEach>
				</tbody>
				</table>
				<br/>
				<a href="index">Insert another user</a>
		    </c:when>
		    <c:otherwise>
		       	<div> There are not users.</div>
		       	<br/>
		       	<a href="index">Back to main page</a>
		    </c:otherwise>
		</c:choose>
	</body>
</html>