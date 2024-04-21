package Objetos5.modules.Users.utils;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Objetos5.modules.rooms.classes.Singleton;
import Objetos5.modules.rooms.classes.doble;
import Objetos5.modules.rooms.classes.familiar;
import Objetos5.modules.rooms.classes.suite;
import Objetos5.modules.rooms.functions.CRUD.functions_create;
import Objetos5.modules.rooms.functions.CRUD.functions_delete;
import Objetos5.modules.rooms.functions.CRUD.functions_read;
import Objetos5.modules.rooms.functions.CRUD.functions_update;

import Objetos5.modules.rooms.utils.dummies.CRUD.create_dummies;
import Objetos5.modules.rooms.utils.dummies.CRUD.update_dummies;

public class menu_admin {

	public static void ppal_dummies() {

		int elegirhab = 0;
		int operacion = 0;
		int crudmenu = 0;
		String[] tipo = { "suite", "familiar", "doble", "Eixir" };
		String[] tipo_operacion = { "create", "read", "update", "delete", "volver", "Salir" };


		do {
			elegirhab = JOptionPane.showOptionDialog(null, "Elegir tipo habitacion", "Elegir", 0,
					JOptionPane.QUESTION_MESSAGE, null, tipo, tipo[0]);

			switch (elegirhab) {
			case 0:
				do {
					operacion = JOptionPane.showOptionDialog(null, "Elegir operacion", "Elegir", 0,
							JOptionPane.QUESTION_MESSAGE, null, tipo_operacion, tipo_operacion[0]);
					switch (operacion) {
					case 0:
						create_dummies.create_suite_dummie();
						break;
					case 1:
						functions_read.read_suite();
						break;
					case 2:
						update_dummies.update_suite_dummies();
						break;
					case 3:
						functions_delete.delete_suite();
						break;
					case 4:
						crudmenu = 4;
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "Saliendo", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;

					}// endswitch
				} while (crudmenu != 4);
				break;

			case 1:
				do {
					operacion = JOptionPane.showOptionDialog(null, "Elegir operacion", "Elegir", 0,
							JOptionPane.QUESTION_MESSAGE, null, tipo_operacion, tipo_operacion[0]);
					switch (operacion) {
					case 0:
						create_dummies.create_familiar_dummie();
						break;
					case 1:
						functions_read.read_familiar();
						break;
					case 2:
						update_dummies.update_familiar_dummies();
						break;
					case 3:
						functions_delete.delete_familiar();
						break;
					case 4:
						crudmenu = 4;
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "Saliendo", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;

					}// endswitch
				} while (crudmenu != 4);
				break;

			case 2:
				do {
					operacion = JOptionPane.showOptionDialog(null, "Elegir operacion", "Elegir", 0,
							JOptionPane.QUESTION_MESSAGE, null, tipo_operacion, tipo_operacion[0]);
					switch (operacion) {
					case 0:
						create_dummies.create_doble_dummie();
						break;
					case 1:
						functions_read.read_doble();
						break;
					case 2:
							update_dummies.update_doble_dummies();		
						break;
					case 3:
						functions_delete.delete_doble();
						break;
					case 4:
						crudmenu = 4;
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "Saliendo", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;

					}// endswitch
				} while (crudmenu != 4);
				break;

			case 3:
				JOptionPane.showMessageDialog(null, "Saliendo", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
				elegirhab = 4;
			}// end_switch

		} while (elegirhab != 4); // enddo general
	}

	public static void ppal_no_dummies() {

		int elegirhab = 0;
		int operacion = 0;
		int crudmenu = 0;
		String[] tipo = { "suite", "familiar", "doble", "Eixir" };
		String[] tipo_operacion = { "create", "read", "update", "delete", "volver", "Salir" };
		Singleton.Arraysuite = new ArrayList<suite>();
		Singleton.Arrayfamiliar = new ArrayList<familiar>();
		Singleton.Arraydoble = new ArrayList<doble>();

		do {
			elegirhab = JOptionPane.showOptionDialog(null, "Elegir tipo habitacion", "Elegir", 0,
					JOptionPane.QUESTION_MESSAGE, null, tipo, tipo[0]);

			switch (elegirhab) {
			case 0:
				do {
					operacion = JOptionPane.showOptionDialog(null, "Elegir operacion", "Elegir", 0,
							JOptionPane.QUESTION_MESSAGE, null, tipo_operacion, tipo_operacion[0]);
					switch (operacion) {
					case 0:
							functions_create.create_suite();			
						break;
					case 1:
						functions_read.read_suite();
						break;
					case 2:

							functions_update.update_suite();
						break;
					case 3:
						functions_delete.delete_suite();
						break;
					case 4:
						crudmenu = 4;
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "Saliendo", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;

					}// endswitch
				} while (crudmenu != 4);
				break;

			case 1:
				do {
					operacion = JOptionPane.showOptionDialog(null, "Elegir operacion", "Elegir", 0,
							JOptionPane.QUESTION_MESSAGE, null, tipo_operacion, tipo_operacion[0]);
					switch (operacion) {
					case 0:
							functions_create.create_familiar();
						break;
					case 1:
						functions_read.read_familiar();
						break;
					case 2:
							functions_update.update_familiar();
						break;
					case 3:
						functions_delete.delete_familiar();
						break;
					case 4:
						crudmenu = 4;
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "Saliendo", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;

					}// endswitch
				} while (crudmenu != 4);
				break;

			case 2:
				do {
					operacion = JOptionPane.showOptionDialog(null, "Elegir operacion", "Elegir", 0,
							JOptionPane.QUESTION_MESSAGE, null, tipo_operacion, tipo_operacion[0]);
					switch (operacion) {
					case 0:
							functions_create.create_doble();
						break;
					case 1:
						functions_read.read_doble();
						break;
					case 2:
							functions_update.update_doble();
						break;
					case 3:
						functions_delete.delete_doble();
						break;
					case 4:
						crudmenu = 4;
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "Saliendo", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;

					}// endswitch
				} while (crudmenu != 4);
				break;

			case 3:
				JOptionPane.showMessageDialog(null, "Saliendo", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
				elegirhab = 4;
			}// end_switch

		} while (elegirhab != 4); // enddo general

	}
}
