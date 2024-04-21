package Objetos5.modules.Users.functions.CRUD_USERS;

import javax.swing.JOptionPane;


import Objetos5.data_find_users;
import Objetos5.modules.Users.classes.Admin;
import Objetos5.modules.Users.classes.Client;
import Objetos5.modules.Users.classes.Recepcionista;
import Objetos5.modules.Users.classes.Singleton_users;
import Objetos5.modules.Users.utils.CRUD;


public class functions_create_users {
	
	public static void create_Admin () {
		int location = -1;
		Admin admin = null;
		
		admin = (Admin)CRUD.create_llave_primaria(0);
		Singleton_users.username = admin.getUsername();
		location = data_find_users.find_Admin(admin);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Ya existe un admin con ese username", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			admin = (Admin)CRUD.create(0);
			Singleton_users.ArrayAdmin.add(admin);
		}
	}
	
	public static void create_Recepcionista () {
		int location = -1;
		Recepcionista recepcionista = null;
		
		recepcionista = (Recepcionista)CRUD.create_llave_primaria(1);
		Singleton_users.username = recepcionista.getUsername();
		location = data_find_users.find_Recepcionista(recepcionista);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Ya existe un admin con ese username", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			recepcionista = (Recepcionista)CRUD.create(1);
			Singleton_users.ArrayRecepcionista.add(recepcionista);
		}
	}
	
	public static void create_Client () {
		int location = -1;
		Client client = null;
		
		client = (Client)CRUD.create_llave_primaria(2);
		Singleton_users.username = client.getUsername();
		location = data_find_users.find_Client(client);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Ya existe un admin con ese username", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			client = (Client)CRUD.create(2);
			Singleton_users.ArrayClient.add(client);
		}
	}
	
	

}
