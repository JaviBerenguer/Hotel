package Objetos5.modules.rooms.utils.dummies;

import javax.swing.JOptionPane;



import Objetos5.classes.Fecha;
import Objetos5.modules.rooms.classes.Singleton;
import Objetos5.modules.rooms.classes.doble;
import Objetos5.modules.rooms.classes.familiar;
import Objetos5.modules.rooms.classes.room;
import Objetos5.modules.rooms.classes.suite;
import Objetos5.utils.menus;

public class CRUDdummies {
	public static room create(int i) {
		room room1 = null;

		boolean wifi = false;
		int capacitat = 2;
		String numhab = Singleton.num_habitacion;
		int preu = 150;
		Fecha fechaentrada = new Fecha("20/11/2023");
		Fecha fechasalida = new Fecha("28/11/2023");
		int numdies = 8;
		float descompte = 5;
		float cupon = 10;

		if (i == 0) {

			Fecha fecha_start_spa = new Fecha("23/11/2023");
			Fecha fecha_fin_spa = new Fecha("24/11/2023");
			int preu_spa = 50;

			room1 = new suite(wifi, capacitat, numhab, preu, fechaentrada, fechasalida, numdies, descompte, cupon,
					fecha_start_spa, fecha_fin_spa, preu_spa);

		}
		if (i == 1) {

			int num_excursion = 4;
			int descuento_excursion = 3;

			room1 = new familiar(wifi, capacitat, numhab, preu, fechaentrada, fechasalida, numdies, descompte, cupon,
					num_excursion, descuento_excursion);

		}
		if (i == 2) {

			String tipo_llit = "individual";
			boolean minibar = true;
			Fecha fecha_ini_promo = new Fecha("26/11/2023");
			Fecha fecha_fin_promo = new Fecha("27/11/2023");
			int cupon_promo_doble = 5;

			room1 = new doble(wifi, capacitat, numhab, preu, fechaentrada, fechasalida, numdies, descompte, cupon,
					tipo_llit, minibar, fecha_ini_promo, fecha_fin_promo, cupon_promo_doble);

		}
		return room1;
	}

	////////////////////
	public static room create_llave_primaria(int i) {
		room room1 = null;
		String num_hab = "301-B"; 

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
				((suite) room1).setWifi(true);
				JOptionPane.showMessageDialog(null, "Se ha modificado wifi de: false a [true]", "wifi",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case  "capacitat":
				((suite) room1).setCapacitat(4);
				JOptionPane.showMessageDialog(null, "Se ha modificado capacidad de: 2 a [4]", "capacidad",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case "numhab":
				((suite) room1).setNum_hab("100-A");
				JOptionPane.showMessageDialog(null, "Se ha modificado el numero de habitacion de: 301-B a [100-A]", "numhab",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case "preu":
				((suite) room1).setPreu(100);
				JOptionPane.showMessageDialog(null, "Se ha modificado precio de: 150 a [100]", "precio",
						JOptionPane.INFORMATION_MESSAGE);			
				break;
			case "fechaentrada":
				((suite) room1).setFechaentrada(new Fecha("10/11/2022"));
				JOptionPane.showMessageDialog(null, "Se ha modificado la fecha de entrada de: 20/11/2023 a [10/11/2022]", "fecha entrada",
						JOptionPane.INFORMATION_MESSAGE);	
				break;
			case "fechasalida":
				((suite) room1).setFechasalida(new Fecha("17/11/2022"));
				JOptionPane.showMessageDialog(null, "Se ha modificado la fecha de entrada de: 28/11/2023 a [17/11/2022]", "fecha salida",
						JOptionPane.INFORMATION_MESSAGE);	
				break;
			case "numdies":
				((suite) room1).setNumdies(7);
				JOptionPane.showMessageDialog(null, "Se ha modificado el numero de dias de: 8 a 7", "Dias",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case "descompte":
				((suite) room1).setDescompte(9);
				JOptionPane.showMessageDialog(null, "Se ha modificado el descuento de: 5 a 9", "Descuento",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case "cupon":
				((suite) room1).setCupon(5);
				JOptionPane.showMessageDialog(null, "Se ha modificado el cupon de: 10 a 5", "Cupon",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case "fecha_start_spa":
				((suite) room1).setFecha_start_spa(new Fecha("12/11/2022"));
				JOptionPane.showMessageDialog(null, "Se ha modificado la fecha de entrada al spa de: 23/11/2023 al [12/11/2022]", "fecha entrada spa",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case "fecha_fin_spa":
				((suite) room1).setFecha_fin_spa(new Fecha("14/11/2022"));
				JOptionPane.showMessageDialog(null, "Se ha modificado la fecha de salida del spa de: 24/11/2023 al [14/11/2022]", "fecha salida spa",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case "preu_spa":
				((suite) room1).setPreu_spa(30);
				break;

			}// endswitch operacion
	
		} // endif suite
	if(room1 instanceof familiar){
		String[] tipo_operacion_familiar = { "wifi", "capacitat", "numhab", "preu", "fechaentrada", "fechasalida",
				"numdies", "descompte", "cupon", "num_excursion", "descuento_excursion" };

		operacion = menus.menucombo(tipo_operacion_familiar, operacion, operacion);
		switch (operacion) {
		case  "wifi":
			((familiar) room1).setWifi(true);
			JOptionPane.showMessageDialog(null, "Se ha modificado wifi de: false a [true]", "wifi",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case  "capacitat":
			((familiar) room1).setCapacitat(4);
			JOptionPane.showMessageDialog(null, "Se ha modificado capacidad de: 2 a [4]", "capacidad",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "numhab":
			((familiar) room1).setNum_hab("100-A");
			JOptionPane.showMessageDialog(null, "Se ha modificado el numero de habitacion de: 301-B a [100-A]", "numhab",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "preu":
			((familiar) room1).setPreu(100);
			JOptionPane.showMessageDialog(null, "Se ha modificado precio de: 150 a [100]", "precio",
					JOptionPane.INFORMATION_MESSAGE);			
			break;
		case "fechaentrada":
			((familiar) room1).setFechaentrada(new Fecha("10/11/2022"));
			JOptionPane.showMessageDialog(null, "Se ha modificado la fecha de entrada de: 20/11/2023 a [10/11/2022]", "fecha entrada",
					JOptionPane.INFORMATION_MESSAGE);	
			break;
		case "fechasalida":
			((familiar) room1).setFechasalida(new Fecha("17/11/2022"));
			JOptionPane.showMessageDialog(null, "Se ha modificado la fecha de entrada de: 28/11/2023 a [17/11/2022]", "fecha salida",
					JOptionPane.INFORMATION_MESSAGE);	
			break;
		case "numdies":
			((familiar) room1).setNumdies(7);
			JOptionPane.showMessageDialog(null, "Se ha modificado el numero de dias de: 8 a 7", "Dias",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "descompte":
			((familiar) room1).setDescompte(9);
			JOptionPane.showMessageDialog(null, "Se ha modificado el descuento de: 5 a 9", "Descuento",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "cupon":
			((familiar) room1).setCupon(5);
			JOptionPane.showMessageDialog(null, "Se ha modificado el cupon de: 10 a 5", "Cupon",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "num_excursion":
			((familiar) room1).setNum_excursio(3);
			JOptionPane.showMessageDialog(null, "Se ha modificado el num de excursion de: 4 a 3", "excursion",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "descuento_excursion":
			((familiar) room1).setDescuento_excursion(5);
			JOptionPane.showMessageDialog(null, "Se ha modificado el cupon de: 3 a 5", "Cupon",
					JOptionPane.INFORMATION_MESSAGE);

			break;
		}
	}

	if(room1 instanceof doble){
		String[] tipo_operacion_doble = { "wifi", "capacitat", "numhab", "preu", "fechaentrada", "fechasalida",
				"numdies", "descompte", "cupon", "tipo_llit", "minibar", "fecha_ini_promo", "fecha_fin_promo",
				"cupon_promo_doble" };

		operacion = menus.menucombo(tipo_operacion_doble, operacion, operacion);
		switch (operacion) {
		case  "wifi":
			((doble) room1).setWifi(true);
			JOptionPane.showMessageDialog(null, "Se ha modificado wifi de: false a [true]", "wifi",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case  "capacitat":
			((doble) room1).setCapacitat(4);
			JOptionPane.showMessageDialog(null, "Se ha modificado capacidad de: 2 a [4]", "capacidad",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "numhab":
			((doble) room1).setNum_hab("100-A");
			JOptionPane.showMessageDialog(null, "Se ha modificado el numero de habitacion de: 301-B a [100-A]", "numhab",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "preu":
			((doble) room1).setPreu(100);
			JOptionPane.showMessageDialog(null, "Se ha modificado precio de: 150 a [100]", "precio",
					JOptionPane.INFORMATION_MESSAGE);			
			break;
		case "fechaentrada":
			((doble) room1).setFechaentrada(new Fecha("10/11/2022"));
			JOptionPane.showMessageDialog(null, "Se ha modificado la fecha de entrada de: 20/11/2023 a [10/11/2022]", "fecha entrada",
					JOptionPane.INFORMATION_MESSAGE);	
			break;
		case "fechasalida":
			((doble) room1).setFechasalida(new Fecha("17/11/2022"));
			JOptionPane.showMessageDialog(null, "Se ha modificado la fecha de entrada de: 28/11/2023 a [17/11/2022]", "fecha salida",
					JOptionPane.INFORMATION_MESSAGE);	
			break;
		case "numdies":
			((doble) room1).setNumdies(7);
			JOptionPane.showMessageDialog(null, "Se ha modificado el numero de dias de: 8 a [7]", "Dias",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "descompte":
			((doble) room1).setDescompte(9);
			JOptionPane.showMessageDialog(null, "Se ha modificado el descuento de: 5 a [9]", "Descuento",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "cupon":
			((doble) room1).setCupon(5);
			JOptionPane.showMessageDialog(null, "Se ha modificado el cupon de: 10 a [5]", "Cupon",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "tipo_llit":
			((doble) room1).setTipo_llit("doble");
			JOptionPane.showMessageDialog(null, "Se ha modificado el tipo de cama de: individual a [doble]", "Cama",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "minibar":
			((doble) room1).setMinibar(true);
			JOptionPane.showMessageDialog(null, "Se ha modificado el minibar de: no a [si]", "minibar",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "fecha_ini_promo":
			((doble) room1).setFecha_ini_promo(new Fecha("11/11/2023"));
			JOptionPane.showMessageDialog(null, "Se ha modificado la fecha de la promocion de: 26/11/2023 a 11/11/2023", "fecha ini promo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "fecha_fin_promo":
			((doble) room1).setFecha_fin_promo(new Fecha ("15/11/2023)"));
			JOptionPane.showMessageDialog(null, "Se ha modificado la fecha de la promocion de: 27/11/2023 a 15/11/2023", "fecha fin promo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "cupon_promo_doble":
			((doble) room1).setCupon_promo_doble(8);
			JOptionPane.showMessageDialog(null, "Se ha modificado el cupon de: 5 a 8", "cupon promo",
					JOptionPane.INFORMATION_MESSAGE);
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
