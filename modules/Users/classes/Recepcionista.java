package Objetos5.modules.Users.classes;

import Objetos5.classes.Fecha;

public class Recepcionista extends User{
	
	private float sueldo_recep;
	private int departamento;
	private String telefono_recepcionista;
	
	//////constructor
		
	public Recepcionista(String username, String password, String email, String nombre, String apellido, int edad,
			String residencia, Fecha fecha_creacion_cuenta, float sueldo_recep, int departamento,
			String telefono_recepcionista) {
		super(username, password, email, nombre, apellido, edad, residencia, fecha_creacion_cuenta);
		this.sueldo_recep = sueldo_recep;
		this.departamento = departamento;
		this.telefono_recepcionista = telefono_recepcionista;
	}



	/// constructor clau primaria///
	
	public Recepcionista(String username) {
		super(username);
		// TODO Auto-generated constructor stub
	}
	
	
	public float getSueldo_user() {
		return sueldo_recep;
	}
	public void setSueldo_user(float sueldo_user) {
		this.sueldo_recep = sueldo_user;
	}
	public int getDepartamento() {
		return departamento;
	}
	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}
	public String getTelefono_recepcionista() {
		return telefono_recepcionista;
	}
	public void setTelefono_recepcionista(String telefono_recepcionista) {
		this.telefono_recepcionista = telefono_recepcionista;
	}
	
	
	@Override
	public String toString() {
		return "Recepcionista [sueldo_user=" + sueldo_recep + ", departamento=" + departamento
				+ ", telefono_recepcionista=" + telefono_recepcionista + "]";
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}
}


