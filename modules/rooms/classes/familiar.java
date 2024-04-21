package Objetos5.modules.rooms.classes;

import Objetos5.classes.Fecha;

public class familiar extends room{
	private int num_excursio;
	private int descuento_excursion;
	
		
	public familiar(boolean wifi, int capacitat, String num_hab, float preu, Fecha fechaentrada, Fecha fechasalida,
			int numdies, float descompte, float cupon, int num_excursio, int descuento_excursion) {
		super(wifi, capacitat, num_hab, preu, fechaentrada, fechasalida, numdies, descompte, cupon);
		this.num_excursio = num_excursio;
		this.descuento_excursion = descuento_excursion;
	}
	/// constructor clau primaria///
	
		public familiar(String num_hab) {
			super(num_hab);
		}
	
	
	public int getNum_excursio() {
		return num_excursio;
	}
	public void setNum_excursio(int num_excursio) {
		this.num_excursio = num_excursio;
	}
	public int getDescuento_excursion() {
		return descuento_excursion;
	}
	public void setDescuento_excursion(int descuento_excursion) {
		this.descuento_excursion = descuento_excursion;
	}
	
	
	

	@Override
	public String toString() {
		return "familiar \n [num_excursio]=" + num_excursio + "\n [descuento_excursion]=" + descuento_excursion + "]" + "\n [wifi]=" + this.getWifi() + "\n [capacitat]=" + this.getCapacitat() + "\n [num_hab]=" + this.getNum_hab() + "\n [preu]=" + this.getPreu()
		+ "\n [fechaentrada]=" + this.getFechaentrada() + "\n [fechasalida]=" + this.getFechasalida() + "\n [numdies]=" + this.getNumdies()
		+ "\n [descompte]=" + this.getDescompte() + "\n [cupon]=" + this.getCupon() + "]";
	}

	@Override
	public int compareTo(room o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
