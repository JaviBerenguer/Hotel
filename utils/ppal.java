package Objetos5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Objetos5.modules.Users.classes.Client;
import Objetos5.modules.Users.classes.Singleton_users;

import Objetos5.modules.Users.classes.Admin;
import Objetos5.modules.Users.classes.Recepcionista;
import Objetos5.modules.Users.functions.CRUD_USERS.functions_create_users;
import Objetos5.modules.Users.functions.CRUD_USERS.functions_login;
import Objetos5.modules.Users.utils.menu_admin;
import Objetos5.modules.Users.utils.menu_client;
import Objetos5.modules.Users.utils.menu_recepcionista;
import Objetos5.modules.Users.utils.dummies_users.dummies_users;
import Objetos5.modules.rooms.classes.*;
import Objetos5.modules.rooms.utils.dummies.dummies;

import Objetos5.utils.menus;

public class ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// todo dentro de cada case del switch de suite, double, familiar
		int operacion = 0;
		int valor_menu_dummiesupdatecreate = 0;
		String[] tipo = { "register", "login", "salir"};
		String tipo_user = "";
		Singleton.Arraysuite = new ArrayList <suite> ();
		Singleton.Arrayfamiliar = new ArrayList <familiar> ();
		Singleton.Arraydoble = new ArrayList <doble> ();
		Singleton_users.ArrayAdmin = new ArrayList <Admin> ();
		Singleton_users.ArrayRecepcionista = new ArrayList <Recepcionista> ();
		Singleton_users.ArrayClient = new ArrayList <Client> ();

		/////// añadir dummies
		dummies.carregarDades();
		dummies_users.carregarDummies();
			/////// añadir dummies
		
		/////// añadir dummies update y create
		valor_menu_dummiesupdatecreate = menus.continuar("Quieres usar dummies en update y create?");
			/////// añadir dummies
		
		do {
			operacion = JOptionPane.showOptionDialog(null, "Elegir operacion", "Elegir", 0,
					JOptionPane.QUESTION_MESSAGE, null, tipo, tipo[0]);

			switch (operacion) {			
			case 0:
				functions_create_users.create_Client();
				break;

			case 1:
				tipo_user = functions_login.login();
			
				if (tipo_user == "admin") {
					if (valor_menu_dummiesupdatecreate == 0) {
						menu_admin.ppal_dummies();
					}else {
						menu_admin.ppal_no_dummies();
					}
				}
				if (tipo_user == "recepcionista") {
					if (valor_menu_dummiesupdatecreate == 0) {
						menu_recepcionista.ppal_dummies();
					}else {
						menu_recepcionista.ppal_no_dummies();
					}
				}
				if (tipo_user == "client") {
					if (valor_menu_dummiesupdatecreate == 0) {
						menu_client.ppal_dummies();
					}else {
						menu_client.ppal_no_dummies();
					}
				}
				break;
				

			case 2:
				System.exit(0);
				break;
					

			case 3:
				JOptionPane.showMessageDialog(null, "Saliendo", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
				operacion = 4;
			}// end_switch

		} while (operacion != 4); // enddo general
	}

}
