package Objetos5.modules.rooms.utils;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class regex {
	private static final String Expresion_regex_fecha="[0-9]{2}[/][0-9]{2}[/][0-9]{4}";
	private static final String Expresion_num_Hab = "[0-9]{3}[-][A-Z]{1}";
	private static final String Expresion_username = "[0-9]{3}[-][A-Z]{1}";
	
	public static boolean valida_fecha(String fecha){
        Pattern pattern=Pattern.compile(Expresion_regex_fecha);
        Matcher matcher = pattern.matcher(fecha);
		if(matcher.matches()){
		return true;
		  } 
	    return false; 
	  }

	
    // valida numero Habitacion
	
    public static boolean validar_num(String numhab) {
        Pattern pattern = Pattern.compile(Expresion_num_Hab);
        Matcher matcher = pattern.matcher(numhab);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
    
    public static boolean validar_username(String numhab) {
        Pattern pattern = Pattern.compile(Expresion_username);
        Matcher matcher = pattern.matcher(numhab);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
}
