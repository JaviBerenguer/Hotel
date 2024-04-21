package Objetos5.modules.Users.classes;

import Objetos5.classes.Fecha;

public class Admin extends User {

	private float sueldo_admin;
	private String nom_empresa;
	private int años_trabajados;


	
	/// constructor clau primaria///
	
		public Admin(String username, String password, String email, String nombre, String apellido, int edad,
			String residencia, Fecha fecha_creacion_cuenta, float sueldo_admin, String nom_empresa,
			int años_trabajados) {
		super(username, password, email, nombre, apellido, edad, residencia, fecha_creacion_cuenta);
		this.sueldo_admin = sueldo_admin;
		this.nom_empresa = nom_empresa;
		this.años_trabajados = años_trabajados;
	}




		public Admin(String username) {
			super(username);
		}

		
		
		
	public float getsueldo_admin() {
		return sueldo_admin;
	}

	public void setSueldo(float sueldo) {
		sueldo_admin = sueldo;
	}

	public String getNom_empresa() {
		return nom_empresa;
	}

	public void setNom_empresa(String nom_empresa) {
		this.nom_empresa = nom_empresa;
	}
	

	public int getaños_trabajados() {
		return años_trabajados;
	}

	public void setaños_trabajados(int años_trabajados) {
		this.años_trabajados = años_trabajados;
	}

	@Override
	public String toString() {
		return "Admin Sueldo=" + sueldo_admin + "/n nom_empresa=" + nom_empresa + "/n dias trabajados:" + años_trabajados;
	}

		@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
