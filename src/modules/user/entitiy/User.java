package modules.user.entitiy;

import javax.servlet.http.HttpServletRequest;

public class User
{
	private Integer id;
	private String name;
	private String surname;
	private Integer age;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public User populate(HttpServletRequest request)
	{
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String age = request.getParameter("age");

		try {
			this.setId(Integer.parseInt(id));
		} catch (Exception e) {
			
		}

		this.setName(name);
		this.setSurname(surname);
		this.setAge(Integer.parseInt(age));
		
		return this;
	}
}
