<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form id="user-form" name="user-form" method="post" action="insert">
		<fieldset>
			<legend>New User</legend>
			<label for="name">Name :</label>
			<input id="name" name="name" type="text">
			<label for="name">Surname :</label>
			<input id="surname" name="surname" type="text">
			<label for="age">Age :</label>
			<input id="age" name="age" type="text">
			<button type="submit">Save</button>
			<button type="button">Cancel</button>
		</fieldset>
	</form>
</body>
</html>