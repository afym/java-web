package modules.home.controllers;

import java.io.IOException;
import util.library.servlet.Controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modules.home.entitiy.User;
import modules.home.repository.UserRepository;

/**
 * Servlet implementation class ListController
 */
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
		
		/*User user = new User();
		user.setId(0);
		user.setName("Angel");
		user.setSurname("Ybarhuen");
		userRepository.insert(user);*/
		request.setAttribute("users", userRepository.list());
		this.render(request, response, "/user/list");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
}