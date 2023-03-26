package taller_abstractas_interfaces.ejercicio2;

import java.util.List;

public class facultadUniversitaria {
	List<Matricula> matriculas;

	public facultadUniversitaria(List<Matricula> matriculas) {
		this.matriculas = matriculas;

	}

	public void consultarMatorias(String codigo) {
		// try {
		for (Matricula matricula : matriculas) {
			if (matricula.getCodigo().equals(codigo)) {
				try {
					if ((matricula.getMaterias().isEmpty()) == false) {
						System.out.println(matricula.getMaterias());
					}
				} catch (NullPointerException ex) {
					System.out.println("No tiene ninguna materia inscrita");
				}

			}

		}

		// }catch(exception_materiasNull em) {
		// System.out.println("El estudiante no tiene materias");
		// }

	}

}
