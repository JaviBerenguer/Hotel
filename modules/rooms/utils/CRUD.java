package Objetos5.modules.rooms.utils;


import Objetos5.classes.Fecha;


import Objetos5.modules.rooms.classes.*;
import Objetos5.utils.*;
import Objetos5.modules.rooms.classes.Singleton;

public class CRUD {
	public static room create(int i) {
		room room1 = null;

		boolean wifi = validate.valida_boolean("WIFI", "wifi");
		int capacitat = validate.valida_int("Introducir capacidad", "Capacidad");
		String numhab = Singleton.num_habitacion;
		int preu = validate.valida_int("Introducir precio", "Precio");
		Fecha fechaentrada = validafecha.fechaentrada();
		Fecha fechasalida = validafecha.fechasalida(fechaentrada);
		int numdies = validate.valida_int("Introducir dias", "Dias");
		float descompte = validate.valida_int("Introducir descuento", "descuento");
		float cupon = validate.valida_int("Introducir cupon", "cupon");

		if (i == 0) {

			Fecha fecha_start_spa = validafecha.fecha_start_spa(fechaentrada, fechasalida);
			Fecha fecha_fin_spa = validafecha.fecha_fin_spa(fecha_start_spa, fechasalida);
			int preu_spa = validate.valida_int("Introducir precio spa", "spa");

			room1 = new suite(wifi, capacitat, numhab, preu, fechaentrada, fechasalida, numdies, descompte, cupon,
					fecha_start_spa, fecha_fin_spa, preu_spa);

		}
		if (i == 1) {

			int num_excursion = validate.valida_int("Introducir num excursion", "excursion");
			int descuento_excursion = validate.valida_int("Introducir descuento", "descuento");

			room1 = new familiar(wifi, capacitat, numhab, preu, fechaentrada, fechasalida, numdies, descompte, cupon,
					num_excursion, descuento_excursion);

		}
		if (i == 2) {

			String tipo_llit = validate.valida_string1("Introducir tipo llit", "tipo llit");
			boolean minibar = validate.valida_boolean("Minibar?", "Minibar");
			Fecha fecha_ini_promo = validafecha.fecha_ini_promo(fechaentrada, fechaentrada);
			Fecha fecha_fin_promo = validafecha.fecha_fin_promo(fechaentrada, fechasalida);
			int cupon_promo_doble = validate.valida_int("Introducir cupon", "cupondoble");

			room1 = new doble(wifi, capacitat, numhab, preu, fechaentrada, fechasalida, numdies, descompte, cupon,
					tipo_llit, minibar, fecha_ini_promo, fecha_fin_promo, cupon_promo_doble);

		}
		return room1;
	}

	////////////////////
	public static room create_llave_primaria(int i) {
		room room1 = null;
		String num_hab = data_rooms.valida_num_hab();

		if (i == 0) {
			room1 = new suite(num_hab);

		}
		if (i == 1) {
			room1 = new familiar(num_hab);

		}
		if (i == 2) {
			room1 = new doble(num_hab);

		}

		return room1;
	}

	public static String read(room room1) {
		String cad = "";
		if (room1 instanceof suite) {
			cad = ((suite) room1).toString();
		}
		if (room1 instanceof familiar) {
			cad = ((familiar) room1).toString();
		}
		if (room1 instanceof doble) {
			cad = ((doble) room1).toString();
		}
		return cad;
	}

	public static room update(room room1) {
		String operacion = "";
		String[] tipo_operacion_suite = { "wifi", "capacitat", "numhab", "preu", "fechaentrada", "fechasalida",
				"numdies", "descompte", "cupon", "fecha_start_spa", "fecha_fin_spa", "preu_spa", };

		if (room1 instanceof suite) {
			operacion = menus.menucombo(tipo_operacion_suite, operacion, operacion);
			switch (operacion) {
			case  "wifi":
				((suite) room1).setWifi(validate.valida_boolean("WIFI", "WIFI_UPDATE"));
				break;
			case  "capacitat":
				((suite) room1).setCapacitat(validate.valida_int("Introducir capacidad", "capacidad"));
				break;
			case "numhab":
				((suite) room1).setNum_hab(validate.valida_string1("Introducir hab", "numhab"));
				break;
			case "preu":
				((suite) room1).setPreu(validate.valida_float("Introducir precio", "Preu"));
				break;
			case "fechaentrada":
				((suite) room1).setFechaentrada(validafecha.fechaentrada());
				break;
			case "fechasalida":
				((suite) room1).setFechasalida(validafecha.fechasalida(((suite) room1).getFechaentrada()));
				break;
			case "numdies":
				((suite) room1).setNumdies(validate.valida_int("Introducir numero dies", "numdies"));
				break;
			case "descompte":
				((suite) room1).setDescompte(validate.valida_int("Introducir descuento", "Descuento"));
				break;
			case "cupon":
				((suite) room1).setCupon(validate.valida_int("Introducir cupon", "cupon"));
				break;
			case "fecha_start_spa":
				((suite) room1).setFecha_start_spa(validafecha.fecha_start_spa((((suite) room1).getFechaentrada()),(((suite) room1).getFechasalida())));
				break;
			case "fecha_fin_spa":
				((suite) room1).setFecha_fin_spa(validafecha.fecha_fin_spa((((suite) room1).getFechaentrada()),(((suite) room1).getFechasalida())));
				break;
			case "preu_spa":
				((suite) room1).setPreu_spa(validate.valida_int("Introducir precio spa", "spa"));
				break;

			}// endswitch operacion
	
		} // endif suite
	if(room1 instanceof familiar){
		String[] tipo_operacion_familiar = { "wifi", "capacitat", "numhab", "preu", "fechaentrada", "fechasalida",
				"numdies", "descompte", "cupon", "num_excursion", "descuento_excursion" };

		operacion = menus.menucombo(tipo_operacion_familiar, operacion, operacion);
		switch (operacion) {
		case "wifi":
			((familiar) room1).setWifi(validate.valida_boolean("WIFI", "WIFI_UPDATE"));
			break;
		case "capacitat":
			((familiar) room1).setCapacitat(validate.valida_int("Introducir capacidad", "capacidad"));
			break;
		case "numhab":
			((familiar) room1).setNum_hab(validate.valida_string1("Introducir hab", "numhab"));
			break;
		case "preu":
			((familiar) room1).setPreu(validate.valida_float("Introducir precio", "Preu"));
			break;
		case "fechaentrada":
			((familiar) room1).setFechaentrada(validafecha.fechaentrada());
			break;
		case "fechasalida":
			((familiar) room1).setFechasalida(validafecha.fechasalida(((suite) room1).getFechaentrada()));
			break;
		case "numdies":
			((familiar) room1).setNumdies(validate.valida_int("Introducir numero dies", "numdies"));
			break;
		case "descompte":
			((familiar) room1).setDescompte(validate.valida_int("Introducir descuento", "Descuento"));
			break;
		case "cupon":
			((familiar) room1).setCupon(validate.valida_int("Introducir cupon", "cupon"));
			break;
		case "num_excursion":
			((familiar) room1).setNum_excursio(validate.valida_int("Introducir num excursion", "excursion"));
			break;
		case "descuento_excursion":
			((familiar) room1)
					.setNum_excursio(validate.valida_int("Introducir descuento excursion", "descuento_excursion"));

			break;
		}
	}

	if(room1 instanceof doble){
		String[] tipo_operacion_doble = { "wifi", "capacitat", "numhab", "preu", "fechaentrada", "fechasalida",
				"numdies", "descompte", "cupon", "tipo_llit", "minibar", "fecha_ini_promo", "fecha_fin_promo",
				"cupon_promo_doble" };

		operacion = menus.menucombo(tipo_operacion_doble, operacion, operacion);
		switch (operacion) {
		case "wifi":
			((doble) room1).setWifi(validate.valida_boolean("WIFI", "WIFI_UPDATE"));
			break;
		case "capacitat":
			((doble) room1).setCapacitat(validate.valida_int("Introducir capacidad", "capacidad"));
			break;
		case "numhab":
			((doble) room1).setNum_hab(validate.valida_string1("Introducir hab", "numhab"));
			break;
		case "preu":
			((doble) room1).setPreu(validate.valida_float("Introducir precio", "Preu"));
			break;
		case "fechaentrada":
			((doble) room1).setFechaentrada(validafecha.fechaentrada());
			break;
		case "fechasalida":
			((doble) room1).setFechasalida(validafecha.fechasalida(((suite) room1).getFechaentrada()));
			break;
		case "numdies":
			((doble) room1).setNumdies(validate.valida_int("Introducir numero dies", "numdies"));
			break;
		case "descompte":
			((doble) room1).setDescompte(validate.valida_int("Introducir descuento", "Descuento"));
			break;
		case "cupon":
			((doble) room1).setCupon(validate.valida_int("Introducir cupon", "cupon"));
			break;
		case "tipo_llit":
			((doble) room1).setTipo_llit(validate.valida_string1("Introducir tipo llit", "tipo llit"));
			break;
		case "minibar":
			((doble) room1).setMinibar(validate.valida_boolean("Minibar?", "Minibar"));
			break;
		case "fecha_ini_promo":
			((doble) room1).setFecha_ini_promo(validafecha.fecha_ini_promo((((suite) room1).getFechaentrada()),(((suite) room1).getFechasalida())));
			break;
		case "fecha_fin_promo":
			((doble) room1).setFecha_fin_promo(validafecha.fecha_fin_promo((((suite) room1).getFechaentrada()),(((suite) room1).getFechasalida())));
			break;
		case "cupon_promo_doble":
			((doble) room1).setCupon_promo_doble(validate.valida_int("Introducir cupon_doble", "cupondoble"));
			break;

			}
		}
		return room1;
	
	}// endupdate

	public static room delete(room room1) {
		room1 = null;
		return room1;

	}
}
