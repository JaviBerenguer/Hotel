package Objetos5.modules.rooms.classes;

import Objetos5.classes.Fecha;

public class suite extends room{
	
	private Fecha fecha_start_spa;
	private Fecha fecha_fin_spa;
	private int preu_spa;
	
	public suite(boolean wifi, int capacitat, String num_hab, float preu, Fecha fechaentrada, Fecha fechasalida,
			int numdies, float descompte, float cupon, Fecha fecha_start_spa, Fecha fecha_fin_spa, int preu_spa) {
		super(wifi, capacitat, num_hab, preu, fechaentrada, fechasalida, numdies, descompte, cupon);
		this.fecha_start_spa = fecha_start_spa;
		this.fecha_fin_spa = fecha_fin_spa;
		this.preu_spa = preu_spa;
	}
	/// constructor clau primaria///
	
	public suite(String num_hab) {
		super(num_hab);
	}


	public Fecha isFecha_start_spa() {
		return fecha_start_spa;
	}


	public void setFecha_start_spa(Fecha fecha_start_spa) {
		this.fecha_start_spa = fecha_start_spa;
	}


	public Fecha isFecha_fin_spa() {
		return fecha_fin_spa;
	}


	public void setFecha_fin_spa(Fecha fecha_fin_spa) {
		this.fecha_fin_spa = fecha_fin_spa;
	}


	public int getPreu_spa() {
		return preu_spa;
	}


	public void setPreu_spa(int preu_spa) {
		this.preu_spa = preu_spa;
	}


	@Override
	public String toString() {
		return "suite \n [fecha_start_spa]=" + fecha_start_spa + "\n [fecha_fin_spa]=" + fecha_fin_spa + "\n [preu_spa]="
				+ preu_spa + "]" + "\n [wifi]=" + this.getWifi() + "\n [capacitat]=" + this.getCapacitat() + "\n [num_hab]=" + this.getNum_hab() + "\n [preu]=" + this.getPreu()
				+ "\n [fechaentrada]=" + this.getFechaentrada() + "\n [fechasalida]=" + this.getFechasalida() + "\n [numdies]=" + this.getNumdies()
				+ "\n [descompte]=" + this.getDescompte() + "\n [cupon]=" + this.getCupon() + "]";
	}

	@Override
	public int compareTo(room o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
