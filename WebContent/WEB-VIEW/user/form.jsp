<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="modules.user.entitiy.User"%>

<%@include file="../layout/header.jsp" %>

<body>
	<% User user = (User)request.getAttribute("user"); %>
	<form id="user-form" name="user-form" method="post" action="<%=request.getAttribute("action") %>">
		<fieldset>
			<legend><%=request.getAttribute("legend") %></legend>
			<input name="id" type="hidden" value="<% if(user != null) {out.print(user.getId());} %>" />
			<label for="name">Name :</label>
			<input id="name" name="name" type="text" value="<% if(user != null) {out.print(user.getName());} %>">
			<label for="name">Surname :</label>
			<input id="surname" name="surname" type="text" value="<% if(user != null) {out.print(user.getSurname());} %>">
			<label for="age">Age :</label>
			<input id="age" name="age" type="text" value="<% if(user != null) {out.print(user.getAge());} %>">
			<button type="submit">Save</button>
			<button id="cancel" type="button">Cancel</button>
		</fieldset>
	</form>
</body>
<%@include file="../layout/footer.jsp" %>
</html>