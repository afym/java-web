<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="modules.home.entitiy.User"%>
<%@page import="java.util.HashMap"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de usuarios</title>
</head>
<body>
	<%
		HashMap<Integer, User> usuarios = null;

		if (request.getParameter("usuarios")!= null) {
			out.print("SI");
			//usuarios = request.getParameter("usuarios");
		} else {
			out.print("no");
		}
		 
	%>
</html>