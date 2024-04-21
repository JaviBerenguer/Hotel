package Objetos5.modules.rooms.functions.CRUD;

import javax.swing.JOptionPane;


import Objetos5.data_find;
import Objetos5.modules.rooms.classes.Singleton;
import Objetos5.modules.rooms.classes.doble;
import Objetos5.modules.rooms.classes.familiar;
import Objetos5.modules.rooms.classes.suite;
import Objetos5.modules.rooms.utils.CRUD;

public class functions_delete {
	public static void delete_suite() {

		int location = -1;

		suite suite1 = null;
		suite1 = (suite) CRUD.create_llave_primaria(0);
		location = data_find.find_suite(suite1);
		if (location != -1) {
			Singleton.Arraysuite.remove(location);
		} else {
			JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void delete_familiar() {

		int location = -1;

		familiar familiar1 = null;
		familiar1 = (familiar) CRUD.create_llave_primaria(1);
		location = data_find.find_familiar(familiar1);
		if (location != -1) {
			Singleton.Arrayfamiliar.remove(location);
		} else {
			JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void delete_doble() {

		int location = -1;

		doble doble1 = null;
		doble1 = (doble) CRUD.create_llave_primaria(2);
		location = data_find.find_doble(doble1);
		if (location != -1) {
			Singleton.Arraydoble.remove(location);
		} else {
			JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

}
