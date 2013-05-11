package modules.user.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modules.user.entitiy.User;
import modules.user.repository.UserRepository;

import util.library.mvc.Controller;

public class UpdateController extends Controller {
	private static final long serialVersionUID = 1L;

    public UpdateController(){
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));

		UserRepository users = new UserRepository(request);
		User user = users.getUser(id);

		request.setAttribute("user", user);
		request.setAttribute("action", "update");
		request.setAttribute("legend", "Update User");

		this.render(request, response, "/user/form");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		User user = new User();
		user.populate(request);

		UserRepository userRepository = new UserRepository(request);
		userRepository.update(user);
		
		this.redirect(response, "list");
	}

}
