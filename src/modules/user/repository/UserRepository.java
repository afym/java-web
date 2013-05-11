package modules.user.repository;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import modules.user.entitiy.User;

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
		user.setId(lastKey);

		this.users.put(lastKey, user);

		return user;
	}
	
	public void delete(Integer id)
	{
		this.users.remove(id);
	}
	
	public User update(User user)
	{
		User update  = this.users.get(user.getId());

		update.setName(user.getName());
		update.setSurname(user.getSurname());
		update.setAge(user.getAge());

		return update;
	}
	
	public User getUser(Integer id)
	{
		return this.users.get(id);
	}
}