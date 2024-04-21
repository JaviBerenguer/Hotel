package Objetos5.modules.rooms.utils.dummies;

import Objetos5.classes.Fecha;


import Objetos5.modules.rooms.classes.Singleton;
import Objetos5.modules.rooms.classes.familiar;
import Objetos5.modules.rooms.classes.room;
import Objetos5.modules.rooms.classes.suite;
import Objetos5.modules.rooms.classes.doble;
import Objetos5.utils.menus;

public class dummies {

	// Atributs suite
	private static boolean[] wifi_suite = { true, false };
	private static int[] capacitat_suite = { 2, 4 };
	private static String[] numhab_suite = { "101-A", "200-B" };
	private static int[] preu_suite = { 300, 250 };
	private static Fecha[] fechaentrada_suite = { new Fecha("05/12/2022"), new Fecha("08/10/2022") };
	private static Fecha[] fechasalida_suite = { new Fecha("10/12/2022"), new Fecha("18/10/2022") };
	private static int[] numdies_suite = { 22, 10 };
	private static float[] descompte_suite = { 21, 5 };
	private static float[] cupon_suite = { 12, 20 };
	private static Fecha[] fecha_start_spa = { new Fecha("06/12/2022"), new Fecha("09/10/2022") };
	private static Fecha[] fecha_fin_spa = { new Fecha("08/12/2022"), new Fecha("17/10/2022") };
	private static int[] preu_spa = { 100, 100 };

	// Atributs familiar
	private static boolean[] wifi_familiar = { true, false };
	private static int[] capacitat_familiar = { 2, 4 };
	private static String[] numhab_familiar = { "101-A", "200-B" };
	private static int[] preu_familiar = { 300, 250 };
	private static Fecha[] fechaentrada_familiar = { new Fecha("05/12/2022"), new Fecha("08/10/2022") };
	private static Fecha[] fechasalida_familiar = { new Fecha("10/12/2022"), new Fecha("18/10/2022") };
	private static int[] numdies_familiar = { 22, 10 };
	private static float[] descompte_familiar = { 21, 5 };
	private static float[] cupon_familiar = { 12, 20 };
	private static int[] num_excursion = { 3, 7 };
	private static int[] descuento_excursion = { 5, 9 };

	// Atributs doble
	private static boolean[] wifi_doble = { true, false };
	private static int[] capacitat_doble = { 2, 4 };
	private static String[] numhab_doble = { "101-A", "200-B" };
	private static int[] preu_doble = { 300, 250 };
	private static Fecha[] fechaentrada_doble = { new Fecha("05/12/2022"), new Fecha("08/10/2022") };
	private static Fecha[] fechasalida_doble = { new Fecha("10/12/2022"), new Fecha("18/10/2022") };
	private static int[] numdies_doble = { 22, 10 };
	private static float[] descompte_doble = { 21, 5 };
	private static float[] cupon_doble = { 12, 20 };
	private static String[] tipo_llit = { "cama_tipo1", "camatipo_2" };
	private static boolean[] minibar = { true, false };
	private static Fecha[] fecha_ini_promo = { new Fecha("7/12/2022"), new Fecha("9/10/2022") };
	private static Fecha[] fecha_fin_promo = { new Fecha("8/12/2022"), new Fecha("10/10/2022") };
	private static int[] cupon_promo_doble = { 10, 5 };

	/**
	 * 
	 * @return
	 */

	public static void carregarDades() {
		int eprova = 0;

		eprova = menus.continuar("Quieres cargar dummies? (de cada clase)?");
		if (eprova == 0)
			carregarDummies();
	}

	/**
	 * 
	 * @param longitud
	 */
	public static void carregarDummies() {
		room suite1 = null;
		room familiar1 = null;
		room doble1 = null;

		for (int i = 0; i < 2; i++) { //
			suite1 = new suite(wifi_suite[i], capacitat_suite[i], numhab_suite[i], preu_suite[i], fechaentrada_suite[i],
					fechasalida_suite[i], numdies_suite[i], descompte_suite[i], cupon_suite[i], fecha_start_spa[i],
					fecha_fin_spa[i], preu_spa[i]);
			Singleton.Arraysuite.add((suite) suite1);

			familiar1 = new familiar(wifi_familiar[i], capacitat_familiar[i], numhab_familiar[i], preu_familiar[i],
					fechaentrada_familiar[i], fechasalida_familiar[i], numdies_familiar[i], descompte_familiar[i],
					cupon_familiar[i], num_excursion[i], descuento_excursion[i]);
			Singleton.Arrayfamiliar.add((familiar) familiar1);

			doble1 = new doble(wifi_doble[i], capacitat_doble[i], numhab_doble[i], preu_doble[i], fechaentrada_doble[i],
					fechasalida_doble[i], numdies_doble[i], descompte_doble[i], cupon_doble[i], tipo_llit[i],
					minibar[i], fecha_ini_promo[i], fecha_fin_promo[i], cupon_promo_doble[i]);
			Singleton.Arraydoble.add((doble) doble1);
		}
	}
}
