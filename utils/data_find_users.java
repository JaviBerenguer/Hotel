package Objetos5;


import Objetos5.modules.Users.classes.Admin;

import Objetos5.modules.Users.classes.Client;
import Objetos5.modules.Users.classes.Recepcionista;
import Objetos5.modules.Users.classes.Singleton_users;


public class data_find_users {
	
	public static int find_Admin(Admin admin) { 
		for (int i = 0; i<=(Singleton_users.ArrayAdmin.size()-1); i++){
			if((Singleton_users.ArrayAdmin.get(i)).equals(admin) )
				return i;
		}
		return -1;
	}
	
	public static int find_Recepcionista(Recepcionista recepcionista) { 
		for (int i = 0; i<=(Singleton_users.ArrayRecepcionista.size()-1); i++){
			if((Singleton_users.ArrayRecepcionista.get(i)).equals(recepcionista) )
				return i;
		}
		return -1;
	}
	
	public static int find_Client(Client client) { 
		for (int i = 0; i<=(Singleton_users.ArrayClient.size()-1); i++){
			if((Singleton_users.ArrayClient.get(i)).equals(client) )
				return i;
		}
		return -1;
	}
}
