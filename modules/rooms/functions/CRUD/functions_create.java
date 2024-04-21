package Objetos5.modules.rooms.functions.CRUD;

import javax.swing.JOptionPane;


import Objetos5.data_find;
import Objetos5.modules.rooms.classes.Singleton;
import Objetos5.modules.rooms.classes.doble;
import Objetos5.modules.rooms.classes.familiar;
import Objetos5.modules.rooms.classes.suite;
import Objetos5.modules.rooms.utils.CRUD;

public class functions_create {
	
	public static void create_suite () {
		int location = -1;
		suite suite1 = null;
		
		suite1 = (suite)CRUD.create_llave_primaria(0);
		Singleton.num_habitacion = suite1.getNum_hab();
		location = data_find.find_suite(suite1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "La habitacion ya existe", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			suite1 = (suite)CRUD.create(0);
			Singleton.Arraysuite.add(suite1);
		}
	}
	
	public static void create_familiar () {
		int location = -1;
		familiar familiar1 = null;
		familiar1 = (familiar)CRUD.create_llave_primaria(1);
		Singleton.num_habitacion = familiar1.getNum_hab();
		location = data_find.find_familiar(familiar1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "La habitacion ya existe", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			familiar1 = (familiar)CRUD.create(1);
			Singleton.Arrayfamiliar.add(familiar1);
		}
	}
	
	public static void create_doble () {
		int location = -1;
		doble doble1 = null;
		doble1 = (doble)CRUD.create_llave_primaria(2);
		Singleton.num_habitacion = doble1.getNum_hab();
		location = data_find.find_doble(doble1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "La habitacion ya existe", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			doble1 = (doble)CRUD.create(2);
			Singleton.Arraydoble.add(doble1);
		}
	}
}
