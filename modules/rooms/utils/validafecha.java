package Objetos5.modules.rooms.utils;

import javax.swing.JOptionPane;



import Objetos5.classes.Fecha;
import Objetos5.utils.*;

public class validafecha {

	public static Fecha fechaentrada() {
		boolean resultado = false;
		String fechaentrada = "";
		Fecha fechaentrada_objeto = null;
		do {
			fechaentrada = validate.valida_string1("Introducir fecha de entrada", "fecha entrada");

			resultado = regex.valida_fecha(fechaentrada);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "Formato incorrecto", "Error", JOptionPane.ERROR_MESSAGE);

			} else {
				fechaentrada_objeto = new Fecha(fechaentrada);
				resultado = fechaentrada_objeto.validaFecha();
				if (resultado == false) {
					JOptionPane.showMessageDialog(null, "La fecha es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					if (fechaentrada_objeto.restarFechaSistema() <= 0) {
						if (fechaentrada_objeto.validaFecha() == true) {
							resultado = true;
						}
					} else {
						JOptionPane.showMessageDialog(null, "La fecha debe ser mayor a la del sistema", "Error",
								JOptionPane.ERROR_MESSAGE);
						resultado = false;
					}
				}
			}

		} while (resultado == false);
		return fechaentrada_objeto;

	}// fin fechantrada

	public static Fecha fechasalida(Fecha fechaentrada_objeto) {
		boolean resultado = false;
		int int_comparar_fechasalida_fechaentrada = 0;
		String fechasalida = "";
		Fecha fechasalida_objeto = null;
		do {
			fechasalida = validate.valida_string1("Introducir fecha salida", "fecha salida");

			resultado = regex.valida_fecha(fechasalida);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "Formato incorrecto", "Error", JOptionPane.ERROR_MESSAGE);

			} else {
				fechasalida_objeto = new Fecha(fechasalida);
				resultado = fechasalida_objeto.validaFecha();
				if (resultado == false) {
					JOptionPane.showMessageDialog(null, "La fecha no es valida", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					int_comparar_fechasalida_fechaentrada = fechasalida_objeto.comparaFechas(fechaentrada_objeto);
					if (int_comparar_fechasalida_fechaentrada != 1) {
						resultado = true;
					} else {
						JOptionPane.showMessageDialog(null, "La fecha debe ser posterior a la fecha de entrada",
								"Error", JOptionPane.ERROR_MESSAGE);
						resultado = false;
					}
				}
			}

		} while (resultado == false);
		return fechasalida_objeto;

	}// fin fechasalida

	public static Fecha fecha_start_spa(Fecha fechaentrada_objeto, Fecha fechasalida_objeto) {
		boolean resultado = false;
		int int_comparar_fecha_start_spa_fechaentrada = 0;
		String fecha_start_spa = "";
		Fecha fecha_start_spa_objeto = null;
		do {
			fecha_start_spa = validate.valida_string1("Introducir fecha entrada spa", "fecha salida");

			resultado = regex.valida_fecha(fecha_start_spa);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "Formato incorrecto", "Error", JOptionPane.ERROR_MESSAGE);

			} else {
				fecha_start_spa_objeto = new Fecha(fecha_start_spa);
				resultado = fecha_start_spa_objeto.validaFecha();
				if (resultado == false) {
					JOptionPane.showMessageDialog(null, "La fecha de entrada al spa no es correcta", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					int_comparar_fecha_start_spa_fechaentrada = fecha_start_spa_objeto
							.comparaFechas(fechaentrada_objeto);
					if (int_comparar_fecha_start_spa_fechaentrada == 1) {
						JOptionPane.showMessageDialog(null,
								"La fecha debe ser posterior a la fecha de entrada al hotel", "Error",
								JOptionPane.ERROR_MESSAGE);
						resultado = false;
					} else {
						int_comparar_fecha_start_spa_fechaentrada = 0;
						int_comparar_fecha_start_spa_fechaentrada = fecha_start_spa_objeto
								.comparaFechas(fechasalida_objeto);
						if (int_comparar_fecha_start_spa_fechaentrada == 2) {
							JOptionPane.showMessageDialog(null,
									"La fecha debe ser anterior a la fecha de salida del hotel", "Error",
									JOptionPane.ERROR_MESSAGE);
							resultado = false;
						} else {
							resultado = true;
						}
					}
				}
			}

		} while (resultado == false);
		return fecha_start_spa_objeto;
	}// fin fechastart spa- Arreglar
	
	public static Fecha fecha_fin_spa(Fecha fechaentradaspa_objeto, Fecha fechasalida_objeto) {
		boolean resultado = false;
		int int_comparar_fecha_start_spa_fechaentrada = 0;
		String fecha_fin_spa = "";
		Fecha fecha_fin_spa_objeto = null;
		do {
			fecha_fin_spa = validate.valida_string1("Introducir fecha de salida del spa", "fecha salida");

			resultado = regex.valida_fecha(fecha_fin_spa);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "Formato incorrecto", "Error", JOptionPane.ERROR_MESSAGE);

			} else {
				fecha_fin_spa_objeto = new Fecha(fecha_fin_spa);
				resultado = fecha_fin_spa_objeto.validaFecha();
				if (resultado == false) {
					JOptionPane.showMessageDialog(null, "La fecha de salida del spa no es correcta", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					int_comparar_fecha_start_spa_fechaentrada = fecha_fin_spa_objeto
							.comparaFechas(fechaentradaspa_objeto);
					if (int_comparar_fecha_start_spa_fechaentrada == 1) {
						JOptionPane.showMessageDialog(null,
								"La fecha debe ser posterior a la fecha de entrada al spa", "Error",
								JOptionPane.ERROR_MESSAGE);
						resultado = false;
					} else {
						int_comparar_fecha_start_spa_fechaentrada = 0;
						int_comparar_fecha_start_spa_fechaentrada = fecha_fin_spa_objeto
								.comparaFechas(fechasalida_objeto);
						if (int_comparar_fecha_start_spa_fechaentrada == 2) {
							JOptionPane.showMessageDialog(null,
									"La fecha debe ser anterior a la fecha de salida del hotel", "Error",
									JOptionPane.ERROR_MESSAGE);
							resultado = false;
						} else {
							resultado = true;
						}
					}
				}
			}

		} while (resultado == false);
		return fecha_fin_spa_objeto;
	}// fin fechasalidaspa - Arreglar
	
	
	public static Fecha fecha_ini_promo(Fecha fechaentrada_objeto, Fecha fechasalida_objeto) {
		boolean resultado = false;
		int int_comparar_fecha_start_spa_fechaentrada = 0;
		String fecha_fin_spa = "";
		Fecha fecha_ini_promo_objeto = null;
		do {
			fecha_fin_spa = validate.valida_string1("Introducir fecha entrada spa", "fecha salida");

			resultado = regex.valida_fecha(fecha_fin_spa);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "Formato incorrecto", "Error", JOptionPane.ERROR_MESSAGE);

			} else {
				fecha_ini_promo_objeto = new Fecha(fecha_fin_spa);
				resultado = fecha_ini_promo_objeto.validaFecha();
				if (resultado == false) {
					JOptionPane.showMessageDialog(null, "La fecha de entrada al spa no es correcta", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					int_comparar_fecha_start_spa_fechaentrada = fecha_ini_promo_objeto
							.comparaFechas(fechaentrada_objeto);
					if (int_comparar_fecha_start_spa_fechaentrada == 1) {
						JOptionPane.showMessageDialog(null,
								"La fecha debe ser posterior a la fecha de entrada al hotel", "Error",
								JOptionPane.ERROR_MESSAGE);
						resultado = false;
					} else {
						int_comparar_fecha_start_spa_fechaentrada = 0;
						int_comparar_fecha_start_spa_fechaentrada = fecha_ini_promo_objeto
								.comparaFechas(fechasalida_objeto);
						if (int_comparar_fecha_start_spa_fechaentrada == 2) {
							JOptionPane.showMessageDialog(null,
									"La fecha debe ser anterior a la fecha de salida del hotel", "Error",
									JOptionPane.ERROR_MESSAGE);
							resultado = false;
						} else {
							resultado = true;
						}
					}
				}
			}

		} while (resultado == false);
		return fecha_ini_promo_objeto;
	}// fin fechasalidaspa - Arreglar
	
	public static Fecha fecha_fin_promo(Fecha fechaentrada_objeto, Fecha fechasalida_objeto) {
		boolean resultado = false;
		int int_comparar_fecha_start_spa_fechaentrada = 0;
		String fecha_fin_spa = "";
		Fecha fecha_ini_promo_objeto = null;
		do {
			fecha_fin_spa = validate.valida_string1("Introducir fecha entrada spa", "fecha salida");

			resultado = regex.valida_fecha(fecha_fin_spa);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "Formato incorrecto", "Error", JOptionPane.ERROR_MESSAGE);

			} else {
				fecha_ini_promo_objeto = new Fecha(fecha_fin_spa);
				resultado = fecha_ini_promo_objeto.validaFecha();
				if (resultado == false) {
					JOptionPane.showMessageDialog(null, "La fecha de entrada al spa no es correcta", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					int_comparar_fecha_start_spa_fechaentrada = fecha_ini_promo_objeto
							.comparaFechas(fechaentrada_objeto);
					if (int_comparar_fecha_start_spa_fechaentrada == 1) {
						JOptionPane.showMessageDialog(null,
								"La fecha debe ser posterior a la fecha de entrada al hotel", "Error",
								JOptionPane.ERROR_MESSAGE);
						resultado = false;
					} else {
						int_comparar_fecha_start_spa_fechaentrada = 0;
						int_comparar_fecha_start_spa_fechaentrada = fecha_ini_promo_objeto
								.comparaFechas(fechasalida_objeto);
						if (int_comparar_fecha_start_spa_fechaentrada == 2) {
							JOptionPane.showMessageDialog(null,
									"La fecha debe ser anterior a la fecha de salida del hotel", "Error",
									JOptionPane.ERROR_MESSAGE);
							resultado = false;
						} else {
							resultado = true;
						}
					}
				}
			}

		} while (resultado == false);
		return fecha_ini_promo_objeto;
	}// fin fechasalidaspa - Arreglar
	public static Fecha fecha_registro() {
		boolean resultado = false;
		String fechaentrada = "";
		Fecha fechaentrada_objeto = null;
		do {
			fechaentrada = validate.valida_string1("Introducir fecha de entrada", "fecha entrada");

			resultado = regex.valida_fecha(fechaentrada);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "Formato incorrecto", "Error", JOptionPane.ERROR_MESSAGE);

			} else {
				fechaentrada_objeto = new Fecha(fechaentrada);
				resultado = fechaentrada_objeto.validaFecha();
				if (resultado == false) {
					JOptionPane.showMessageDialog(null, "La fecha es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					if (fechaentrada_objeto.restarFechaSistema() <= 0) {
						if (fechaentrada_objeto.validaFecha() == true) {
							resultado = true;
						}
					} else {
						JOptionPane.showMessageDialog(null, "La fecha debe ser mayor a la del sistema", "Error",
								JOptionPane.ERROR_MESSAGE);
						resultado = false;
					}
				}
			}

		} while (resultado == false);
		return fechaentrada_objeto;

	}// fin fechantrada
}
