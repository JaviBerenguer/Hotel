package Objetos5.modules.Users.utils.dummies_users.CRUD_dummies_users;

import javax.swing.JOptionPane;

import Objetos5.data_find;
import Objetos5.modules.Users.classes.Admin;
import Objetos5.modules.Users.classes.Singleton_users;
import Objetos5.modules.rooms.classes.Singleton;
import Objetos5.modules.rooms.classes.suite;
import Objetos5.modules.rooms.utils.dummies.CRUDdummies;

public class create_dummies_users {
	public static void create_Admin_dummie () {
		int location = -1;
		Admin admin = null;
		
		admin = (suite)CRUD_dummies_users.create_llave_primaria(0);
		Singleton_users.username = admin.getUsername();
		location = data_find.find_suite(admin);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "La habitacion ya existe", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			admin = (suite)CRUD_dummies_users.create(0);
			Singleton_users.ArrayAdmin.add(admin);
			JOptionPane.showMessageDialog(null, "Se ha creado la habitacion 301-B", "nueva habitacion",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
