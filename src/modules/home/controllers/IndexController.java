package modules.home.controllers;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modules.home.entitiy.User;
import modules.home.repository.UsuariosRepository;


public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public IndexController()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession(true);

		@SuppressWarnings("unchecked")
		HashMap<Integer, User> usuarios = (HashMap<Integer, User>) session.getAttribute("usuarios");

		if (usuarios == null) {
			session.setAttribute("usuarios", this.listarAction());
		}

		request.setAttribute("usuarios", session.getAttribute("usuarios"));
		request.getRequestDispatcher("listar.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("EN POST");
	}
	
	private HashMap<Integer, User> listarAction()
	{
		UsuariosRepository usuarios = new UsuariosRepository();
		return usuarios.obtenerUsuario();
	}
}