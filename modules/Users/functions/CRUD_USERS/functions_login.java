package Objetos5.modules.Users.functions.CRUD_USERS;


import Objetos5.data_find_users;
import Objetos5.modules.Users.classes.Admin;
import Objetos5.modules.Users.classes.Client;
import Objetos5.modules.Users.classes.Recepcionista;
import Objetos5.modules.Users.utils.CRUD;
import Objetos5.utils.validate;

public class functions_login {
	public static String login() {
		String username = "";
		int location_admin = -1;
		int location_recep = -1;
		int location_user = -1;
		Admin admin = null;
		Recepcionista recepcionista = null;
		Client client = null;
		String error = "No se ha encontrado el usuario";

		username = validate.valida_string1("Introducir username", "username");
		admin = (Admin) CRUD.login(username, 0);
		location_admin = data_find_users.find_Admin(admin);
		recepcionista = (Recepcionista) CRUD.login(username, 1);
		location_recep = data_find_users.find_Recepcionista(recepcionista);
		client = (Client) CRUD.login(username, 2);
		location_user = data_find_users.find_Client(client);

		if (location_admin != -1) {
			return "admin";
		} else {
			if (location_recep != -1) {
				return "recepcionista";
			} else {
				if (location_user != -1) {
					return "client";
				}
			}
		}
		return error;
	}
}
