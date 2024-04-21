package Objetos5.modules.Users.functions.CRUD_USERS;

import javax.swing.JOptionPane;

import Objetos5.data_find_users;
import Objetos5.modules.Users.classes.Admin;
import Objetos5.modules.Users.classes.Client;
import Objetos5.modules.Users.classes.Recepcionista;
import Objetos5.modules.Users.classes.Singleton;
import Objetos5.modules.Users.utils.CRUD;



public class functions_delete_users {

	public static void delete_Admin() {

		int location = -1;

		Admin admin = null;
		admin = (Admin) CRUD.create_llave_primaria(0);
		location = data_find_users.find_Admin(admin);
		if (location != -1) {
			Singleton.ArrayAdmin.remove(location);
		} else {
			JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void delete_Recepcionista() {

		int location = -1;

		Recepcionista recepcionista = null;
		recepcionista = (Recepcionista) CRUD.create_llave_primaria(0);
		location = data_find_users.find_Recepcionista(recepcionista);
		if (location != -1) {
			Singleton.ArrayRecepcionista.remove(location);
		} else {
			JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void delete_Client() {

		int location = -1;

		Client client = null;
		client = (Client) CRUD.create_llave_primaria(0);
		location = data_find_users.find_Client(client);
		if (location != -1) {
			Singleton.ArrayClient.remove(location);
		} else {
			JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

}
