package util.library.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void render(HttpServletRequest request, HttpServletResponse response, String viewDIr) 
			throws ServletException, IOException
	{
		RequestDispatcher view = getServletContext().getRequestDispatcher("/WEB-VIEW" + viewDIr + ".jsp");   
		view.forward(request,response); 
	}
}