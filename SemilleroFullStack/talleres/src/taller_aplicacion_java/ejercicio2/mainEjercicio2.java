package taller_aplicacion_java.ejercicio2;

public class mainEjercicio2 {
	public static void main(String[] args) {
		
		
		//----- PRIMEROS PUNTOS -> Sin herencia 
		/*
		Cuenta cuenta1 = new Cuenta(300000,3);
		
		
		cuenta1.consignarDinero(100000);
		System.out.println(cuenta1.getSaldo());
		
		cuenta1.retirarDinero(10000);
		System.out.println(cuenta1.getSaldo());
		
		
		cuenta1.actualizarSaldoInteres(10);
		System.out.println(cuenta1.getSaldo());
		
		cuenta1.actualizarSaldoMensual(10, 100000);
		System.out.println(cuenta1.getSaldo());
		
		System.out.println(cuenta1.toString());
		*/
		
		
		Ahorros ahorro1 = new Ahorros(50000, 30000);
		System.out.println(ahorro1.getEstado());
		
		ahorro1.consignarAhorros(50000);
		System.out.println(ahorro1.getSaldo());
		
		ahorro1.retirarAhorros(1000);
		ahorro1.retirarAhorros(1000);
		ahorro1.retirarAhorros(1000);
		ahorro1.retirarAhorros(1000);
		ahorro1.retirarAhorros(1000);
		System.out.println(ahorro1.getSaldo());
		System.out.println(ahorro1.getNumeroRetiros());
		System.out.println(ahorro1.getComisionMensual());
	}
}
