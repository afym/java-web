package util.library.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	/**
	 * Render a view to dispatch in your controller.
	 * 
	 * @param request the servlet's request
	 * @param response the servlet's response
	 * 
	 */
	public void render(HttpServletRequest request, HttpServletResponse response, String viewDIr) 
			throws ServletException, IOException
	{
		RequestDispatcher view = getServletContext().getRequestDispatcher("/WEB-VIEW" + viewDIr + ".jsp");   
		view.forward(request,response); 
	}
	/**
	 * Redirect to another url from your controller.
	 * 
	 * @param response the servlet's response
	 * @param url the url to reditect
	 */
	public void redirect(HttpServletResponse response, String url) 
			throws IOException
	{
		response.sendRedirect(url);
	}
}