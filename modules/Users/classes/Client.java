package Objetos5.modules.Users.classes;

import Objetos5.classes.Fecha;

public class Client extends User{
	
	private int num_total_reservas;
	private int telefono_client;
	
///////constructor

	
	
	/// constructor clau primaria///
	
	public Client(String username) {
		super(username);
		// TODO Auto-generated constructor stub
	}

	public Client(String username, String password, String email, String nombre, String apellido, int edad,
			String residencia, Fecha fecha_creacion_cuenta, int num_total_reservas, int telefono_client) {
		super(username, password, email, nombre, apellido, edad, residencia, fecha_creacion_cuenta);
		this.num_total_reservas = num_total_reservas;
		this.telefono_client = telefono_client;
	}

	public int getNum_total_reservas() {
		return num_total_reservas;
	}

	public void setNum_total_reservas(int num_total_reservas) {
		this.num_total_reservas = num_total_reservas;
	}

	public int getTelefono() {
		return telefono_client;
	}

	public void setTelefono_client(int telefono) {
		this.telefono_client = telefono;
	}

	@Override
	public String toString() {
		return "Client [num_total_reservas=" + num_total_reservas + ", telefono=" + telefono_client + "]";
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
		