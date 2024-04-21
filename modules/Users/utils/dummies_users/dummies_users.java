package Objetos5.modules.Users.utils.dummies_users;

import Objetos5.classes.Fecha;
import Objetos5.modules.Users.classes.Admin;

import Objetos5.modules.Users.classes.Recepcionista;
import Objetos5.modules.Users.classes.Singleton_users;
import Objetos5.modules.Users.classes.User;


public class dummies_users {
	// Atributs Admin
		private static String[] username_admin = {"paco21", "manolo12" };		
		private static String[] password_admin = {"123421hg", "peixera12"};
		private static String[] email_admin = {"paco21@gmail.com", "manolo12@gmail.com"};
		private static String[] nombre_admin = {"paco", "manolo"};
		private static String[] apellido_admin = {"gutierrez", "jackson"};
		private static int[] edad_admin = {23, 53};
		private static String[] residencia_admin = {"Almaig 12", "Calle mayor 6"};
		private static Fecha[] fecha_creacion_cuenta_admin = {new Fecha("12/3/2010"), new Fecha("21/5/2018")};
	
		private static int[] sueldo_admin = {1200, 2000};
		private static String[] nom_empresa = {"nttdata", "amazon"};
		private static int[] años_trabajados = {12, 4};


		// Atributs Recepcionista
		private static String[] username_familiar = {"evaristo", "javi" };		
		private static String[] password_familiar= {"123421hg", "peixera12"};
		private static String[] email_familiar = {"paco21@gmail.com", "manolo12@gmail.com"};
		private static String[] nombre_familiar = {"paco", "manolo"};
		private static String[] apellido_familiar = {"gutierrez", "jackson"};
		private static int[] edad_familiar = {23, 53};
		private static String[] residencia_familiar= {"Almaig 12", "Calle mayor 6"};
		private static Fecha[] fecha_creacion_cuenta_familiar = {new Fecha("12/3/2010"), new Fecha("21/5/2018")};
		
		private static int[] sueldo_recep = {2500, 1400};
		private static int[] departamento = {5, 9};
		private static String[] telefono_recepcionista = {"+34 649584851", "+34 548754268"};


		// Atributs doble


		/**
		 * 
		 * @return
		 */

	//	public static void carregarDades() {
//			int eprova = 0;
//
//			eprova = menus.continuar("Quieres cargar dummies? (de cada clase)?");
//			if (eprova == 0)
//				carregarDummies();
	//	}

		/**
		 * 
		 * @param longitud
		 */
		public static void carregarDummies() {
			User admin = null;
			User recepcionista = null;


			for (int i = 0; i < 2; i++) { //
				admin = new Admin(username_admin[i], password_admin[i], email_admin[i], nombre_admin[i], apellido_admin[i],
						edad_admin[i], residencia_admin[i], fecha_creacion_cuenta_admin[i], sueldo_admin[i], nom_empresa[i],
						años_trabajados[i]);
				Singleton_users.ArrayAdmin.add((Admin) admin);

				recepcionista = new Recepcionista(username_familiar[i], password_familiar[i], email_familiar[i], nombre_familiar[i],
						apellido_familiar[i], edad_familiar[i], residencia_familiar[i], fecha_creacion_cuenta_familiar[i],
						sueldo_recep[i], departamento[i], telefono_recepcionista[i]);
				Singleton_users.ArrayRecepcionista.add((Recepcionista) recepcionista);

			
			}
		}

}
