package taller_abstractas_interfaces.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Matricula {
	String codigo;
	List<String> materias;
	
	
	public Matricula(String codigo) {
		this.codigo = codigo;
	}
	
	public Matricula(String codigo, List<String> materias) {
		this.codigo = codigo;
		this.materias = materias;
	}
	
	
	public void consultarMaterias(String codigo) {
		this.codigo = codigo;
		this.materias = null;
	}
	
	

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public List getMaterias() {
		return materias;
	}
	public void setMaterias(List materias) {
		this.materias = materias;
	}
	
	
}