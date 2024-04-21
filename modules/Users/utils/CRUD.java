package Objetos5.modules.Users.utils;

import Objetos5.classes.Fecha;


import Objetos5.modules.Users.classes.Admin;
import Objetos5.modules.Users.classes.Client;
import Objetos5.modules.Users.classes.Recepcionista;
import Objetos5.modules.Users.classes.Singleton_users;
import Objetos5.modules.Users.classes.User;
import Objetos5.modules.rooms.utils.validafecha;
import Objetos5.utils.menus;
import Objetos5.utils.validate;

public class CRUD {
	public static User create(int i) {
		User user = null;

		String username = Singleton_users.username;
		String password = validate.valida_string1("Introducir contraseña", "contraseña");
		String email = validate.valida_string1("Introducir email", "email");
		String nombre = validate.valida_string1("Introducir nombre", "nombre");
		String apellido = validate.valida_string1("Introducir apellido", "apellido");
		int edad = validate.valida_int("Introducir edad", "edad");
		String residencia = validate.valida_string1("Introducir residencia", "Residencia");
		Fecha fecha_creacion_cuenta = validafecha.fecha_registro();

		if (i == 0) {

			float sueldo_admin = validate.valida_float("Introducit sueldo", "sueldo");
			String nom_empresa = validate.valida_string1("Introducir empresa", "nombre empresa");
			int años_trabajados = validate.valida_int("Introducir años", "años");

			user = new Admin(username, password, email, nombre, apellido, edad, residencia, fecha_creacion_cuenta,
					sueldo_admin, nom_empresa, años_trabajados);

		}
		if (i == 1) {

			float sueldo_recep = validate.valida_float("Introducir sueldo", "sueldo");
			int departamento = validate.valida_int("Introducir departamento", "departamento");
			String telefono_recepcionista = validate.valida_string1("Introducir numero telefono", "telefono");

			user = new Recepcionista(username, password, email, nombre, apellido, edad, residencia,
					fecha_creacion_cuenta, sueldo_recep, departamento, telefono_recepcionista);

		}
		if (i == 2) {

			int num_total_reservas = validate.valida_int("Introducir numde reservas", "nreser");
			int telefono_client = validate.valida_int("Introducir telefono", "telefono");

			user = new Client(username, password, email, nombre, apellido, edad, residencia, fecha_creacion_cuenta,
					num_total_reservas, telefono_client);

		}
		return user;
	}

	////////////////////
	public static User create_llave_primaria(int i) {
		User user = null;
		String username = validate.valida_string1("Introducir username", "username");

		if (i == 0) {
			user = new Admin(username);

		}
		if (i == 1) {
			user = new Recepcionista(username);

		}
		if (i == 2) {
			user = new Client(username);

		}

		return user;
	}
	////////////////////
	public static User login(String username, int i) {
		User user = null;
		
		if (i == 0) {
			user = new Admin(username);
	
		}
		if (i == 1) {
			user = new Recepcionista(username);

		}
		if (i == 2) {
			user = new Client(username);

		}

		return user;
	}
	

	public static String read(User user) {
		String cad = "";
		if (user instanceof User) {
			cad = ((User) user).toString();
		}
		if (user instanceof Recepcionista) {
			cad = ((Recepcionista) user).toString();
		}
		if (user instanceof Client) {
			cad = ((Client) user).toString();
		}
		return cad;
	}

	// update
	public static User update(User user) {
		String operacion = "";
		String[] tipo_operacion_admin = { "username", "password", "email", "nombre", "apellido", "edad",
				"residencia", "fecha_creacion_cuenta", "sueldo_admin", "nom_empresa", "años_trabajados" };
		
		if (user instanceof Admin) {
			operacion = menus.menucombo(tipo_operacion_admin, operacion, operacion);
			switch (operacion) {
			case "username":
				((Admin) user).setUsername(validate.valida_string1("Introducit username", "username"));
				break;
			case "password":
				((Admin) user).setPassword(validate.valida_string1("Introducir contraseña", "password"));
				break;
			case "email":
				((Admin) user).setEmail(validate.valida_string1("Introducir email", "email"));
				break;
			case "nombre":
				((Admin) user).setNombre(validate.valida_string1("Introducir nombre", "nombre"));
				break;
			case "apellido":
				((Admin) user).setApellido(validate.valida_string1("Introducir apellido", "apellido"));
				break;
			case "edad":
				((Admin) user).setEdad(validate.valida_int("Introducir edad", "edad"));
				break;
			case "residencia":
				((Admin) user).setResidencia(validate.valida_string1("Introducir residencia", "Residencia"));
				break;
			case "fecha_creacion_cuenta":
				((Admin) user).setFecha_creacion_cuenta(validafecha.fecha_registro());
				break;
			case "sueldo_admin":
				((Admin) user).setSueldo(validate.valida_float("Introducit sueldo", "sueldo"));
				break;
			case "nom_empresa":
				((Admin) user).setNom_empresa(validate.valida_string1("Introducir empresa", "nombre empresa"));
				break;
			case "años_trabajados":
				((Admin) user).setaños_trabajados(validate.valida_int("Actualizar años trabajados", "años"));
				break;

			}// endswitch operacion

		} // endif admin
	
		
			if (user instanceof Recepcionista) {
				String[] tipo_operacion_Recepcionista = { "username", "password", "email", "nombre", "apellido", "edad",
						"residencia", "fecha_creacion_cuenta", "sueldo_recep", "departamento", "telefono_recepcionista" };
				
				operacion = menus.menucombo(tipo_operacion_Recepcionista, operacion, operacion);
				switch (operacion) {
				case "username":
					((Recepcionista) user).setUsername(validate.valida_string1("Introducit username", "username"));
					break;
				case "password":
					((Recepcionista) user).setPassword(validate.valida_string1("Introducir contraseña", "password"));
					break;
				case "email":
					((Recepcionista) user).setEmail(validate.valida_string1("Introducir email", "email"));
					break;
				case "nombre":
					((Recepcionista) user).setNombre(validate.valida_string1("Introducir nombre", "nombre"));
					break;
				case "apellido":
					((Recepcionista) user).setApellido(validate.valida_string1("Introducir apellido", "apellido"));
					break;
				case "edad":
					((Recepcionista) user).setEdad(validate.valida_int("Introducir edad", "edad"));
					break;
				case "residencia":
					((Recepcionista) user).setResidencia(validate.valida_string1("Introducir residencia", "Residencia"));
					break;
				case "fecha_creacion_cuenta":
					((Recepcionista) user).setFecha_creacion_cuenta(validafecha.fecha_registro());
					break;
				case "sueldo_recep":
					((Recepcionista) user).setSueldo_user(validate.valida_float("Introducir sueldo", "sueldo"));
					break;
				case "departamento":
					((Recepcionista) user).setDepartamento(validate.valida_int("Introducir departamento", "departamento"));
					break;
				case "telefono_recepcionista":
					((Recepcionista) user).setTelefono_recepcionista(validate.valida_string1("Introducir numero telefono", "telefono"));
					break;

				}// endswitch operacion

			} // endif Recepcionista

			if (user instanceof Client) {
				String[] tipo_operacion_Client = { "username", "password", "email", "nombre", "apellido", "edad",
						"residencia", "fecha_creacion_cuenta", "fecha_creacion_cuenta", "num_total_reservas", "telefono_client" };
				
				operacion = menus.menucombo(tipo_operacion_Client, operacion, operacion);
				switch (operacion) {
				case "username":
					((Client) user).setUsername(validate.valida_string1("Introducit username", "username"));
					break;
				case "password":
					((Client) user).setPassword(validate.valida_string1("Introducir contraseña", "password"));
					break;
				case "email":
					((Client) user).setEmail(validate.valida_string1("Introducir email", "email"));
					break;
				case "nombre":
					((Client) user).setNombre(validate.valida_string1("Introducir nombre", "nombre"));
					break;
				case "apellido":
					((Client) user).setApellido(validate.valida_string1("Introducir apellido", "apellido"));
					break;
				case "edad":
					((Client) user).setEdad(validate.valida_int("Introducir edad", "edad"));
					break;
				case "residencia":
					((Client) user).setResidencia(validate.valida_string1("Introducir residencia", "Residencia"));
					break;
				case "fecha_creacion_cuenta":
					((Client) user).setFecha_creacion_cuenta(validafecha.fecha_registro());
					break;
				case "num_total_reservas":
					((Client) user).setNum_total_reservas(validate.valida_int("Introducir numde reservas", "nreser"));
					break;
				case "telefono_client":
					((Client) user).setTelefono_client(validate.valida_int("Introducir telefono", "telefono"));
					break;
					
				}// endswitch operacion

			} // endif Client
			return user;
	}// end-update

}
