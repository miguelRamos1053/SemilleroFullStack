package taller_abstractas_interfaces.ejercicio1;


public class compraBoletas {
	
	public void compraBoletas() {
		
	}
	
	
	
	
	public void comprarBoletas(int cantidad, float valor) {
		
		try {
			if(cantidad > 10) {
				throw new exception_cantBoletas("Sobrepasa la cantidad de boletas a comprar");
			}
			float total = cantidad * valor;
			System.out.println("Debe pagar: "+total);
		}catch(exception_cantBoletas ec){
			System.out.println("Solo puede comprar hasta 10 boletas");
			
		}
	}
}
