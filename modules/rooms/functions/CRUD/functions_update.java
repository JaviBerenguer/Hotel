package Objetos5.modules.rooms.functions.CRUD;

import javax.swing.JOptionPane;


import Objetos5.data_find;
import Objetos5.modules.rooms.classes.Singleton;
import Objetos5.modules.rooms.classes.doble;
import Objetos5.modules.rooms.classes.familiar;
import Objetos5.modules.rooms.classes.suite;
import Objetos5.modules.rooms.utils.CRUD;

public class functions_update {

	public static void update_suite () {
		int location1 = -1;
		suite suite1 = null;
		
			suite1 = (suite)CRUD.create_llave_primaria(0);
			location1 = data_find.find_suite(suite1);
			if (location1 != -1) {
				suite1 = Singleton.Arraysuite.get(location1);
				suite1 = (suite)CRUD.update(suite1);
				Singleton.Arraysuite.set(location1, suite1);
			}else {
				JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	
	
	public static void update_familiar () {
		int location1 = -1;
		familiar familiar1 = null;
		
		familiar1 = (familiar)CRUD.create_llave_primaria(1);
			location1 = data_find.find_familiar(familiar1);
			if (location1 != -1) {
				familiar1 = Singleton.Arrayfamiliar.get(location1);
				familiar1 = (familiar)CRUD.update(familiar1);
				Singleton.Arrayfamiliar.set(location1, familiar1);
			}else {
				JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	
	public static void update_doble () {
		int location1 = -1;
		doble doble1 = null;
		
		doble1 = (doble)CRUD.create_llave_primaria(2);
			location1 = data_find.find_doble(doble1);
			if (location1 != -1) {
				doble1 = Singleton.Arraydoble.get(location1);
				doble1 = (doble)CRUD.update(doble1);
				Singleton.Arraydoble.set(location1, doble1);
			}else {
				JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}

}
