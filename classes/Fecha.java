package Objetos5.classes;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Fecha {

	// attributes
	private String fecha;
	private int day;
	private int month;
	private int year;

	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public String getfecha() {
		return fecha;
	}

	public void setfecha(String fecha) {
		this.fecha = fecha;
	}
///////////// constructor
	public Fecha(String introducefecha) {

		String[] SplitArray = null;

		SplitArray = introducefecha.split("/");

		this.day = Integer.parseInt(SplitArray[0]);
		this.month = Integer.parseInt(SplitArray[1]);
		this.year = Integer.parseInt(SplitArray[2]);

		this.fecha = introducefecha;

	}
///////////// constructor

	public Calendar deStringToCalendar(String fecha) {
		Date fechaDate = new Date();
		Calendar fechaCalendar = new GregorianCalendar();
		try {
			fechaDate = formato.parse(fecha);
			fechaCalendar.setTime(fechaDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return fechaCalendar;
	}

	public String deCalendartoString() {
		Calendar cal = Calendar.getInstance();
		return (cal.getTime().toString());
	}

	public int RestaFechas() {
		int diferencia, any1, anyosistema;
		Calendar cal1 = new GregorianCalendar();

		cal1 = (deStringToCalendar(fecha));

		any1 = cal1.get(Calendar.YEAR);
		anyosistema = this.anyoactual();

		diferencia = anyosistema - any1;

		return diferencia;
	}

	// metodo per a restar els anys de dos feches. Fecha sistema menos
	// This.fecha
	public int restarFechaSistema() {

		int dia1;
		int dia2;
		Calendar fecha1 = Calendar.getInstance();
		Calendar fecha2 = this.deStringToCalendar(fecha);

		dia1 = fecha1.get(Calendar.DAY_OF_MONTH);
		dia2 = fecha2.get(Calendar.DAY_OF_MONTH);

		return (dia1 - dia2);

	}

	public int restar2Fechas(Fecha fecha2) {

		int anyo1;
		int anyo2;
		Calendar fecha1 = this.deStringToCalendar(fecha);
		Calendar fecha2Calen = fecha2.deStringToCalendar(fecha2.toString());

		anyo1 = fecha1.get(Calendar.DAY_OF_MONTH);
		anyo2 = fecha2Calen.get(Calendar.DAY_OF_MONTH);

		return (anyo2 - anyo1);

	}

	public int anyoactual() {
		Calendar fecha = new GregorianCalendar();
		int anyo = fecha.get(Calendar.YEAR);
		return anyo;
	}

	public int comparaFechas(Fecha fecha2) {

		Calendar cal1 = this.deStringToCalendar(fecha);
		Calendar cal2 = this.deStringToCalendar(fecha2.toString());

		if (cal1.before(cal2))
			return 1;
		else if (cal1.after(cal2))
			return 2;
		else
			return 3;
	}

	public boolean compara_datos(int edad, int antiguedad) {
		boolean bo = false;
		int edadv = 0;
		edadv = edad - antiguedad;
		if (edadv < 18) {
			bo = false;
			System.out.println("The valuDe: " + edadv);
			JOptionPane.showMessageDialog(null, "Invalid data", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			bo = true;
			System.out.println("The valuDe: " + edadv);
		}
		return bo;
	}

	// metodo per a validar una fecha
	public boolean validaFecha() {

		boolean valido = false;

		if ((year > 1930) && (year < 2090)) {
			if ((month >= 1) && (month <= 12)) {
				switch (month) {
				case 1: // Enero
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 2: // Febrero

					if ((((year % 100 == 0) && (year % 400 == 0)) || ((year % 100 != 0) && (year % 4 == 0)))
							&& (day > 0) && (day <= 29))
						valido = true; // Año Bisiesto
					else if ((day > 0) && (day <= 28))
						valido = true;
					break;
				case 3: // Marzo
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 4: // Abril
					if ((day > 0) && (day <= 30))
						valido = true;
					break;
				case 5: // Mayo
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 6: // Junio
					if ((day > 0) && (day <= 30))
						valido = true;
					break;
				case 7: // Julio
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 8: // Agosto
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 9: // Septiembre
					if ((day > 0) && (day <= 30))
						valido = true;
					break;
				case 10: // Octubre
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 11: // Noviembre
					if ((day > 0) && (day <= 30))
						valido = true;
					break;
				case 12: // Diciembre

					if ((day > 0) && (day <= 31))
						valido = true;
					break;

				default:
					valido = false;
				}
			} else
				valido = false;
		} else
			valido = false;
		return valido;
	}

	// toString
	@Override
	public String toString() {
		// return "Fecha [day=" + day + ", month=" + month + ", year=" + year +
		// "]";

		String fecha = null;

		fecha = this.day + "/" + this.month + "/" + this.year;

		return fecha;
	}

}