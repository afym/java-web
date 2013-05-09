package modules.home.controllers;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modules.home.entitiy.User;

/**
 * Servlet implementation class ListController
 */
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);

		@SuppressWarnings("unchecked")
		HashMap<Integer, User> usuarios = (HashMap<Integer, User>) session.getAttribute("usuarios");

		if (usuarios == null) {
			//session.setAttribute("usuarios", this.listarAction());
			usuarios = (HashMap<Integer, User>)session.getAttribute("usuarios");
		}
		
		System.out.print(usuarios);
		
		for (User user : usuarios.values()) {
			System.out.println(user.getSurname());
		}
		request.setAttribute("usuarios", session.getAttribute("usuarios"));
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}