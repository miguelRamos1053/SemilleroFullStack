package taller_aplicacion_java.ejercicio2;

public abstract class Cuenta {
	protected float saldo;
	protected int numeroConsignaciones = 0; // debe inicializarse en 0
	protected int numeroRetiros;
	protected float tasaAnual;
	protected float comisionMensual;
	
	
	
	
	
	public void actualizarSaldoMensual(float porcentajeInteres, float comisionMensual) {
		this.setComisionMensual(comisionMensual);
		this.restarComisionMensual();
		
		this.actualizarSaldoInteres(porcentajeInteres);
		
	}
	
	public void restarComisionMensual() {
		this.setSaldo(this.getSaldo() - this.getComisionMensual());
	}
	public void actualizarSaldoInteres(float porcentajeInteres){
		float interes = calcularInteresMensual(porcentajeInteres);
		
		this.setSaldo(interes + this.getSaldo());
		
	}
	public float calcularInteresMensual(float porcentajeInteres) {
		float interes =0;
		interes = this.getSaldo() * (porcentajeInteres/100);
		return interes;
	}
	
	public void consignarDinero(float dinero) {
		this.setSaldo(dinero + getSaldo());
	}

	public void retirarDinero(float dinero) {
		float saldoRestante = this.getSaldo()-dinero;
		if(saldoRestante >= 0) {
			this.setSaldo(saldoRestante);
			this.aumentarNumeroRetiro();
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void aumentarNumeroRetiro() {
		this.setNumeroRetiros(this.getNumeroRetiros()+1);
	}

	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public int getNumeroConsignaciones() {
		return numeroConsignaciones;
	}


	public void setNumeroConsignaciones(int numeroConsignaciones) {
		this.numeroConsignaciones = numeroConsignaciones;
	}


	public int getNumeroRetiros() {
		return numeroRetiros;
	}


	public void setNumeroRetiros(int numeroRetiros) {
		this.numeroRetiros = numeroRetiros;
	}


	public float getTasaAnual() {
		return tasaAnual;
	}


	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}


	public float getComisionMensual() {
		return comisionMensual;
	}


	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}


	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numeroConsignaciones=" + numeroConsignaciones + ", numeroRetiros="
				+ numeroRetiros + ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + "]";
	}
	
	
	
}
