package Objetos5.modules.Users.utils;

import javax.swing.JOptionPane;

import Objetos5.modules.rooms.utils.regex;
import Objetos5.utils.validate;

public class data_users {
	public static String valida_username() {
		
        boolean resultado = false;
        String num_hab_String = "";

        do {// introducimos un String y se valida. Devuelve un string
            num_hab_String = validate.valida_string1("Introducir num_hab", "num_hab");
            // Con el reGex comprobamos que sea correcto el formato, obtenemos un boolean
            resultado = regex.validar_username(num_hab_String);
            if (resultado == false) {// si el reGex es falso, no cumplimos el formato
                JOptionPane.showMessageDialog(null, "Incorrecto, formato xxx-X", "Error", JOptionPane.ERROR_MESSAGE);
            } else {// si el formato es correcto, nos devuelve un true, es correcto el formato
                resultado = true;
            }
        } while (resultado == false);
        return num_hab_String;// retornamos un String con formato correcto
    }
}
