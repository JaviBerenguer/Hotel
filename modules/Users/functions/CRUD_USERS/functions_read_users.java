package Objetos5.modules.Users.functions.CRUD_USERS;

import javax.swing.JOptionPane;

import Objetos5.data_find_users;
import Objetos5.modules.Users.classes.Admin;
import Objetos5.modules.Users.classes.Client;
import Objetos5.modules.Users.classes.Recepcionista;
import Objetos5.modules.Users.classes.Singleton;
import Objetos5.modules.Users.utils.CRUD;
import Objetos5.utils.menus;

public class functions_read_users {

	public static void read_Admin() {

		int menu = 0, location = -1;
		Admin admin = null;
		String[] tipo = { "Leer todos los users", "leer un user", "volver" };
		menu = menus.menufunc(tipo, "Seleccionar modo", "Modo");
		switch (menu) {
		case 0:
			for (int i = 0; i < Singleton.ArrayAdmin.size(); i++) {
				String cad = "";
				cad = cad + (Singleton.ArrayAdmin.get(i).toString()) + "\n";
				JOptionPane.showMessageDialog(null, cad);
			}
			break;
		case 1:
			admin = (Admin) CRUD.create_llave_primaria(0);
			location = data_find_users.find_Admin(admin);
			if (location != -1) {
				admin = Singleton.ArrayAdmin.get(location);
				JOptionPane.showMessageDialog(null, admin.toString());
			} else {
				JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error", JOptionPane.ERROR_MESSAGE);
			}
			break;
		case 2:
			break;
		}
	}
	public static void read_Recepcionista() {

		int menu = 0, location = -1;
		Recepcionista recepcionista = null;
		String[] tipo = { "Leer todos los users", "leer un user", "volver" };
		menu = menus.menufunc(tipo, "Seleccionar modo", "Modo");
		switch (menu) {
		case 0:
			for (int i = 0; i < Singleton.ArrayRecepcionista.size(); i++) {
				String cad = "";
				cad = cad + (Singleton.ArrayRecepcionista.get(i).toString()) + "\n";
				JOptionPane.showMessageDialog(null, cad);
			}
			break;
		case 1:
			recepcionista = (Recepcionista) CRUD.create_llave_primaria(0);
			location = data_find_users.find_Recepcionista(recepcionista);
			if (location != -1) {
				recepcionista = Singleton.ArrayRecepcionista.get(location);
				JOptionPane.showMessageDialog(null, recepcionista.toString());
			} else {
				JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error", JOptionPane.ERROR_MESSAGE);
			}
			break;
		case 2:
			break;
		}
	}
	public static void read_Client() {

		int menu = 0, location = -1;
		Client client = null;
		String[] tipo = { "Leer todos los users", "leer un user", "volver" };
		menu = menus.menufunc(tipo, "Seleccionar modo", "Modo");
		switch (menu) {
		case 0:
			for (int i = 0; i < Singleton.ArrayClient.size(); i++) {
				String cad = "";
				cad = cad + (Singleton.ArrayClient.get(i).toString()) + "\n";
				JOptionPane.showMessageDialog(null, cad);
			}
			break;
		case 1:
			client = (Client) CRUD.create_llave_primaria(0);
			location = data_find_users.find_Client(client);
			if (location != -1) {
				client = Singleton.ArrayClient.get(location);
				JOptionPane.showMessageDialog(null, client.toString());
			} else {
				JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error", JOptionPane.ERROR_MESSAGE);
			}
			break;
		case 2:
			break;
		}
	}

}
