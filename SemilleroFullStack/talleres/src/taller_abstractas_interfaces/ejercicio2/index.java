package taller_abstractas_interfaces.ejercicio2;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * EXPLICACION
 * 
 * Desarrolle el punta usando una excepcion.  
 * Hay una excepcion exactamente para este error el cual es NullPointerException
 * 
 */

public class index {
	public static void main(String[] args) {

		// Materias incritas a m1
		List<String> inscritasM1 = new ArrayList<String>();
		inscritasM1.add("Software III");
		inscritasM1.add("Calculo 3");

		Matricula m1 = new Matricula("0002", inscritasM1);

		// m no tiene materias incritas
		Matricula m = new Matricula("0001");

		// Lista de materias
		List<Matricula> matriculasU = new ArrayList<Matricula>();
		matriculasU.add(m);
		matriculasU.add(m1);

		facultadUniversitaria fu = new facultadUniversitaria(matriculasU);

		fu.consultarMatorias("0001");

	}
}
