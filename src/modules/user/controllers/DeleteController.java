package modules.user.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modules.user.repository.UserRepository;
import util.library.mvc.Controller;

public class DeleteController extends Controller {
	private static final long serialVersionUID = 1L;

    public DeleteController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		UserRepository user = new UserRepository(request);
		user.delete(id);
		
		this.redirect(response, "list");
	}
}
