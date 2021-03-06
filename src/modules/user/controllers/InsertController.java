package modules.user.controllers;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modules.user.entitiy.User;
import modules.user.repository.UserRepository;

import util.library.mvc.Controller;

public class InsertController extends Controller {
	private static final long serialVersionUID = 1L;

    public InsertController(){}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setAttribute("legend", "New User");
		request.setAttribute("action", "insert");

		this.render(request, response, "/user/form");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		User user = new User();
		user.populate(request);

		UserRepository userRepository = new UserRepository(request);
		userRepository.insert(user);
		
		this.redirect(response, "list");
	}

}
