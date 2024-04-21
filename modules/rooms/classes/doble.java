package pccomp;

import Objetos5.classes.Fecha;

public class doble extends room {

	private String tipo_llit;
	private boolean minibar;
	private Fecha fecha_ini_promo;
	private Fecha fecha_fin_promo;
	private int cupon_promo_doble;

	public doble(boolean wifi, int capacitat, String num_hab, float preu, Fecha fechaentrada, Fecha fechasalida,
			int numdies, float descompte, float cupon, String tipo_llit, boolean minibar, Fecha fecha_ini_promo,
			Fecha fecha_fin_promo, int cupon_promo_doble) {
		super(wifi, capacitat, num_hab, preu, fechaentrada, fechasalida, numdies, descompte, cupon);
		this.tipo_llit = tipo_llit;
		this.minibar = minibar;
		this.fecha_ini_promo = fecha_ini_promo;
		this.fecha_fin_promo = fecha_fin_promo;
		this.cupon_promo_doble = cupon_promo_doble;
	}
	/// constructor clau primaria///

	public doble(String num_hab) {
		super(num_hab);
	}

	public String getTipo_llit() {
		return tipo_llit;
	}

	public void setTipo_llit(String tipo_llit) {
		this.tipo_llit = tipo_llit;
	}

	public boolean isMinibar() {
		return minibar;
	}

	public void setMinibar(boolean minibar) {
		this.minibar = minibar;
	}

	public Fecha getFecha_ini_promo() {
		return fecha_ini_promo;
	}

	public void setFecha_ini_promo(Fecha fecha_ini_promo) {
		this.fecha_ini_promo = fecha_ini_promo;
	}

	public Fecha getFecha_fin_promo() {
		return fecha_fin_promo;
	}

	public void setFecha_fin_promo(Fecha fecha_fin_promo) {
		this.fecha_fin_promo = fecha_fin_promo;
	}

	public int getCupon_promo_doble() {
		return cupon_promo_doble;
	}

	public void setCupon_promo_doble(int cupon_promo_doble) {
		this.cupon_promo_doble = cupon_promo_doble;
	}

	@Override
	public String toString() {
		return "doble \n [tipo_llit]=" + tipo_llit + "\n [minibar]=" + minibar + "\n [fecha_ini_promo]="
				+ fecha_ini_promo
				+ "\n fecha_fin_promo=" + fecha_fin_promo + "\n cupon_promo_doble=" + cupon_promo_doble + "]"
				+ "\n [wifi]=" + this.getWifi() + "\n [capacitat]=" + this.getCapacitat() + "\n [num_hab]="
				+ this.getNum_hab() + "\n [preu]=" + this.getPreu()
				+ "\n [fechaentrada]=" + this.getFechaentrada() + "\n [fechasalida]=" + this.getFechasalida()
				+ "\n [numdies]=" + this.getNumdies()
				+ "\n [descompte]=" + this.getDescompte() + "\n [cupon]=" + this.getCupon() + "]";
	}

	@Override
	public int compareTo(room o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
