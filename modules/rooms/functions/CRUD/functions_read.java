package Objetos5.modules.rooms.functions.CRUD;

import javax.swing.JOptionPane;



import Objetos5.data_find;
import Objetos5.modules.rooms.classes.Singleton;
import Objetos5.modules.rooms.classes.doble;
import Objetos5.modules.rooms.classes.familiar;
import Objetos5.modules.rooms.classes.suite;
import Objetos5.modules.rooms.utils.CRUD;
import Objetos5.utils.menus;

public class functions_read {

	public static void read_suite (){
		
		int menu = 0, 
		location = -1;
		suite suite1 = null;
		String[] tipo = { "Leer todo", "leer x", "volver"};
			menu = menus.menufunc(tipo, "Seleccionar modo", "Modo");
			switch (menu){
				case 0:
					for (int i = 0; i <Singleton.Arraysuite.size();i++){
						String cad = "";
						cad = cad + (Singleton.Arraysuite.get(i).toString())+"\n";
						JOptionPane.showMessageDialog(null, cad);
					}
					break;
				case 1:
					suite1 = (suite)CRUD.create_llave_primaria(0);
					location = data_find.find_suite(suite1);
					if (location != -1) {
						suite1 = Singleton.Arraysuite.get(location);
						JOptionPane.showMessageDialog(null, suite1.toString());
					}else {
						JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 2:
					break;
			}
		}
	
	
	
	public static void read_familiar (){
		
		int menu = 0, 
		location = -1;
		familiar familiar1 = null;
		String[] tipo = { "Leer todo", "leer x", "volver"};
			menu = menus.menufunc(tipo, "Seleccionar modo", "modo");
			switch (menu){
				case 0:
					for (int i = 0; i <Singleton.Arrayfamiliar.size();i++){
						String cad = "";
						cad = cad + (Singleton.Arrayfamiliar.get(i).toString())+"\n";
						JOptionPane.showMessageDialog(null, cad);
					}
					break;
				case 1:
					familiar1 = (familiar)CRUD.create_llave_primaria(1);
					location = data_find.find_familiar(familiar1);
					if (location != -1) {
						familiar1 = Singleton.Arrayfamiliar.get(location);
						JOptionPane.showMessageDialog(null, familiar1.toString());
					}else {
						JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 2:
					break;
			}
		}
	
	public static void read_doble (){
		
		int menu = 0, 
		location = -1;
		doble doble1 = null;
		String[] tipo = { "Leer todo", "leer x", "volver"};
			menu = menus.menufunc(tipo, "Seleccionar modo", "modo");
			switch (menu){
				case 0:
					for (int i = 0; i <Singleton.Arraysuite.size();i++){
						String cad = "";
						cad = cad + (Singleton.Arraysuite.get(i).toString())+"\n";
						JOptionPane.showMessageDialog(null, cad);
					}
					break;
				case 1:
					doble1 = (doble)CRUD.create_llave_primaria(2);
					location = data_find.find_doble(doble1);
					if (location != -1) {
						doble1 = Singleton.Arraydoble.get(location);
						JOptionPane.showMessageDialog(null, doble1.toString());
					}else {
						JOptionPane.showMessageDialog(null, "La habitacion no existe", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 2:
					break;
			}
		}
}
