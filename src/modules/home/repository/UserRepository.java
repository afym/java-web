package modules.home.repository;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import modules.home.entitiy.User;

public class UserRepository
{
	private HashMap<Integer, User> users;

	public UserRepository(HttpServletRequest request)
	{
		HttpSession session = request.getSession(true);

		if (session.getAttribute("users") == null) {
			session.setAttribute("users", new HashMap<Integer, User>());
		}

		this.users = (HashMap<Integer, User>) session.getAttribute("users");
	}

	public HashMap<Integer, User> list()
	{
		//HashMap<Integer, User> usuarios = new HashMap<Integer, User>();

		return this.users;
	}

	public User insert(User user)
	{
		Integer lastKey = this.users.size() + 1;

		this.users.put(lastKey, user);

		return user;
	}
}
