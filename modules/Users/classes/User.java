package Objetos5.modules.Users.classes;

import Objetos5.classes.Fecha;

public abstract class User implements Comparable<User>{
	
	private String username;
	private String password;
	private String email;
	private String nombre;
	private String apellido;
	private int edad;
	private String residencia;
	private Fecha fecha_creacion_cuenta;
	
	//constructor
	
	public User(String username, String password, String email, String nombre, String apellido, int edad, 
			String residencia, Fecha fecha_creacion_cuenta) {
		super();
		this.username = username;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.residencia = residencia;
		this.password = password;
		this.email = email;
		this.fecha_creacion_cuenta = fecha_creacion_cuenta;
	}
	
	/// constructor clau primaria///
	
			public User(String username) {
				this.username = username;
			}
			
	//getters & setters
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getResidencia() {
		return residencia;
	}
	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Fecha getFecha_creacion_cuenta() {
		return fecha_creacion_cuenta;
	}

	public void setFecha_creacion_cuenta(Fecha fecha_creacion_cuenta) {
		this.fecha_creacion_cuenta = fecha_creacion_cuenta;
	}

	@Override
	public String toString() {
		return "user_mare username=" + username + "/n nombre=" + nombre + "/n apellido=" + apellido + "/n edad=" + edad
				+ "/n residencia=" + residencia + "/n password" + password + "/n email" + email + "/n fecha_creacion_cuenta" + fecha_creacion_cuenta;
	}
	
	/// equals///
		public boolean equals(Object param) {
			return getUsername().equals(((User)param).getUsername());
	
		}
}
