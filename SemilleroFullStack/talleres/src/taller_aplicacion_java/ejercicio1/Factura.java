package taller_aplicacion_java.ejercicio1;

public class Factura extends Precio{
	String emisor;
	String cliente;
	
	public Factura(int total, String emisor, String cliente) {
		super();
		this.total = total;
		this.emisor = emisor;
		this.cliente = cliente;
	}
	
	
	
	public void imprimirFactura() {
		System.out.println("Se imprimira la factura");
	}
}
