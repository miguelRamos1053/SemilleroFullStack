package taller_aplicacion_java.ejercicio2;

public class Ahorros extends Cuenta{
	
	boolean estado;
	
	
	public Ahorros (float saldo, float tasaAnual) {
		super();
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
		
		if(this.saldo > 10000) {
			this.estado = true;
		}else {
			this.estado = false;
		}
		
	}
	
	
	public void consignarAhorros(float dinero){
		if(this.estado == true) {
			this.consignarDinero(dinero);
		}else {
			System.out.println("La cuenta esta inactiva");
		}
	}
	
	public void retirarAhorros(float dinero) {
		
		if(this.estado == true) {
			this.retirarDinero(dinero);
			this.evaluarEstadoCuenta();
			this.calcularComisionMensual();
		}else {
			System.out.println("La cuenta esta inactiva");
		}
	}
	
	public void evaluarEstadoCuenta() {
		if(this.getSaldo() > 10000) {
			this.setEstado(true); 
		}else {
			this.setEstado(false);
		}
	}
	
	public void calcularComisionMensual(){
		int retirosExtras = this.getNumeroRetiros() - 4;
		
		if(retirosExtras > 0){
			this.setComisionMensual(retirosExtras * 1000); 
		}
	}
	
	
	
	
	
	
	
	


	public boolean getEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
