package modules.user.controllers;

import java.io.IOException;

import util.library.mvc.Controller;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modules.user.entitiy.User;
import modules.user.repository.UserRepository;

public class ListController extends Controller
{
	private static final long serialVersionUID = 1L;

    public ListController()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		UserRepository userRepository = new UserRepository(request);
		request.setAttribute("users", userRepository.list());
		this.render(request, response, "/user/list");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
}