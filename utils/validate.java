package Objetos5.utils;

import javax.swing.JOptionPane;



import Objetos5.modules.rooms.utils.regex;
import Objetos5.utils.validate;

public class validate {
/////////////////// Pedir Numero	///////////////////	
	public static int valida_int(String Message, String Titulo) {
		boolean correcto = true;
		int num = 0;
		String s = "";

		do {
			try {
				s = JOptionPane.showInputDialog(null, Message, Titulo, JOptionPane.QUESTION_MESSAGE);
				if (s == null) {
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación", "Saliendo",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);// al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la
									// ejecución
				} else {
					num = Integer.parseInt(s);
					correcto = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",
						JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}
		} while (correcto == false);
//end-num
		return num;
	}

/////////////////// Pedir letra	///////////////////		

	public static char valida_char(String Message, String Titulo) {
		String s = "";
		char letra = 0;
		boolean correcto = true;
		do {
			try {
				s = JOptionPane.showInputDialog(null, Message, Titulo, JOptionPane.QUESTION_MESSAGE);
				if (s == null) {
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación", "Saliendo",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);// al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la
									// ejecución
				} else {
					letra = s.charAt(0);
					correcto = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No has introducido una vocal", "Error", JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}
		} while (correcto == false);
		return letra;
	}

/////////////////// Pedir STRING	///////////////////

	public static String valida_string1(String Message, String Titulo) {
		String s = "";
		boolean correcto = true;

		do {
			try {
				s = JOptionPane.showInputDialog(null, Message, Titulo, JOptionPane.QUESTION_MESSAGE);
				correcto = true;
				if (s == null) {
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación", "Saliendo",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);// al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la
									// ejecución
				}
				if (s.equals("")) {
					JOptionPane.showMessageDialog(null, "Error de introducción de datos", "Error",
							JOptionPane.ERROR_MESSAGE);
					correcto = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No has introducido una cadena", "Error",
						JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}
		} while (correcto == false);
		JOptionPane.showMessageDialog(null, "Has introducido: " + s, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		return s;
	}

/////////////////// Pedir boolean	///////////////////

	public static boolean valida_boolean(String Message, String Titulo) {
		int opcion = 0;
		boolean resultado = true;
		String[] opciones = { "si", "no" };
		opcion = menus.menufunc(opciones, Message, Titulo);
		if (opcion == 1) {
			resultado = false;
		}
		return resultado;

	}

/////////////////// Pedir float	///////////////////
	public static float valida_float(String Message, String Titulo) {
		float a = 0.0f;
		String s;
		boolean correcto = true;

		do {
			try {
				s = JOptionPane.showInputDialog(null, Message, Titulo, JOptionPane.QUESTION_MESSAGE);
				if (s == null) {
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación", "Saliendo",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);// al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la
									// ejecución
				} else {
					a = Float.parseFloat(s);
					correcto = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No has introducido un num float", "Error",
						JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}
		} while (correcto == false);
		return a;
	}

/////////////////// Pedir fecha4	///////////////////

	public static String valida_fecha(String mensaje, String titulo) {
		boolean resultado = false;
		String fechaentrada = "";

		do {
			fechaentrada = validate.valida_string1(mensaje, titulo);
			resultado = regex.valida_fecha(fechaentrada);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "Formato incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
			}
		} while (resultado == false);
		return fechaentrada;
	}
}
