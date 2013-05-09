package util.library.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void render(HttpServletRequest request, HttpServletResponse response, String view)
	{
		try {
			request.getRequestDispatcher(view + ".jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
