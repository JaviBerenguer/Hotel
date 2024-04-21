package Objetos5.modules.rooms.classes;

import Objetos5.classes.Fecha;

public abstract class room implements Comparable<room>{
	//abstract sirve para utilizar los datos de room en las clases hija. No para crear room1,2,3 sino suite,
	private boolean wifi;
	private int capacitat;
	private String num_hab;
	private float preu;
	private Fecha fechaentrada;
	private Fecha fechasalida;
	private int numdies;
	private float descompte;
	private float cupon;

	/// constructor///

	public room(boolean wifi, int capacitat, String num_hab, float preu, Fecha fechaentrada, Fecha fechasalida,
			int numdies, float descompte, float cupon) {
		super();
		this.wifi = wifi;
		this.capacitat = capacitat;
		this.num_hab = num_hab;
		this.preu = preu;
		this.fechaentrada = fechaentrada;
		this.fechasalida = fechasalida;
		this.numdies = numdies;
		this.descompte = descompte;
		this.cupon = cupon;
	}
	/// constructor clau primaria///
	
	public room(String num_hab) {
		this.num_hab = num_hab;
	}

	/// setters getters///

	public boolean getWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public int getCapacitat() {
		return capacitat;
	}

	public void setCapacitat(int capacitat) {
		this.capacitat = capacitat;
	}

	public String getNum_hab() {
		return num_hab;
	}

	public void setNum_hab(String num_hab) {
		this.num_hab = num_hab;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

	public Fecha getFechaentrada() {
		return fechaentrada;
	}

	public void setFechaentrada(Fecha fechaentrada) {
		this.fechaentrada = fechaentrada;
	}

	public Fecha getFechasalida() {
		return fechasalida;
	}

	public void setFechasalida(Fecha fechasalida) {
		this.fechasalida = fechasalida;
	}

	public int getNumdies() {
		return numdies;
	}

	public void setNumdies(int numdies) {
		this.numdies = numdies;
	}

	public float getDescompte() {
		return descompte;
	}

	public void setDescompte(float descompte) {
		this.descompte = descompte;
	}

	public float getCupon() {
		return cupon;
	}

	public void setCupon(float cupon) {
		this.cupon = cupon;
	}

	@Override
	public abstract String toString();

	/// equals///
	public boolean equals(Object param) {
		return getNum_hab().equals(((room)param).getNum_hab());
	}

}
