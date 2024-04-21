package Objetos5.modules.Users.functions.CRUD_USERS;

import javax.swing.JOptionPane;

import Objetos5.data_find_users;
import Objetos5.modules.Users.classes.Admin;
import Objetos5.modules.Users.classes.Client;
import Objetos5.modules.Users.classes.Recepcionista;
import Objetos5.modules.Users.classes.Singleton;
import Objetos5.modules.Users.utils.CRUD;



public class functions_update_users {
	
	public static void update_Admin () {
		int location1 = -1;
		Admin admin = null;
		
			admin = (Admin)CRUD.create_llave_primaria(0);
			location1 = data_find_users.find_Admin(admin);
			if (location1 != -1) {
				admin = Singleton.ArrayAdmin.get(location1);
				admin = (Admin)CRUD.update(admin);
				Singleton.ArrayAdmin.set(location1, admin);
			}else {
				JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	public static void update_Recepcionista () {
		int location1 = -1;
		Recepcionista recepcionista = null;
		
		recepcionista = (Recepcionista)CRUD.create_llave_primaria(1);
			location1 = data_find_users.find_Recepcionista(recepcionista);
			if (location1 != -1) {
				recepcionista = Singleton.ArrayRecepcionista.get(location1);
				recepcionista = (Recepcionista)CRUD.update(recepcionista);
				Singleton.ArrayRecepcionista.set(location1, recepcionista);
			}else {
				JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	public static void update_Client () {
		int location1 = -1;
		Client client = null;
		
			client = (Client)CRUD.create_llave_primaria(2);
			location1 = data_find_users.find_Client(client);
			if (location1 != -1) {
				client = Singleton.ArrayClient.get(location1);
				client = (Client)CRUD.update(client);
				Singleton.ArrayClient.set(location1, client);
			}else {
				JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}

}
