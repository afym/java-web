package modules.home.repository;

import java.util.HashMap;

import modules.home.entitiy.User;

public class UsuariosRepository
{
	public HashMap<Integer, User> obtenerUsuario()
	{
		HashMap<Integer, User> usuarios = new HashMap<Integer, User>();

		for (int indice = 1; indice <= 100; indice++) {
			Double edad = Math.random() * 10 + Math.random() * 5;
			User usuario = new User();
			usuario.setId(indice);
			usuario.setNombre("USUARIO # " + indice);
			usuario.setApellido("APELLIDO #" + indice);
			usuario.setEdad(edad.intValue());
			usuarios.put(indice, usuario);
		}

		return usuarios;
	}
}
