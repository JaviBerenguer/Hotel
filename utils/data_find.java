package Objetos5;

import Objetos5.modules.rooms.classes.Singleton;

import Objetos5.modules.rooms.classes.doble;
import Objetos5.modules.rooms.classes.familiar;
import Objetos5.modules.rooms.classes.suite;

public class data_find {
	
	public static int find_suite(suite suite1) { 
		for (int i = 0; i<=(Singleton.Arraysuite.size()-1); i++){
			if((Singleton.Arraysuite.get(i)).equals(suite1) )
				return i;
		}
		return -1;
	}
	
	public static int find_familiar(familiar familiar) { 
		for (int i = 0; i<=(Singleton.Arrayfamiliar.size()-1); i++){
			if((Singleton.Arrayfamiliar.get(i)).equals(familiar) )
				return i;
		}
		return -1;
	}
	
	public static int find_doble(doble doble) { 
		for (int i = 0; i<=(Singleton.Arraydoble.size()-1); i++){
			if((Singleton.Arraydoble.get(i)).equals(doble) )
				return i;
		}
		return -1;
	}

}
