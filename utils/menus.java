package Objetos5.utils;

import javax.swing.JOptionPane;

public class menus {

///////////////////// Desea continuar ? /////////////////////

	public static int continuar(String mensaje) {
		int repetir = 0;
		repetir = JOptionPane.showConfirmDialog(null, mensaje);
		return repetir;
	}

///////////////////// menuopcions /////////////////////

	public static int menufunc(String[] opciones, String Message, String Titulo) {

		int operacion = 0;

		operacion = JOptionPane.showOptionDialog(null, Message, Titulo, 0, JOptionPane.QUESTION_MESSAGE, null, opciones,
				opciones[0]);
		return operacion;
	}

///////////////////// menudesplegable /////////////////////
	
	public static String menucombo(String[] opciones, String mensaje, String titulo) {
		Object opcion = null;
		
		opcion = JOptionPane.showInputDialog(null,mensaje, titulo,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
		return opcion.toString();
	}
}
