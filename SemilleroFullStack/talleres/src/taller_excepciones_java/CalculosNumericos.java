package taller_excepciones_java;

public class CalculosNumericos {

	public void CalculosNumericos() {
		
	}
	
	public double raizCuadrada(double num) throws exceptionNumNegativo {
		double raiz = Math.sqrt(num);
			try {
				 if (num<33) {
					 throw new exceptionNumNegativo("EL numero debe ser positivo");
				 }
			}catch(exceptionNumNegativo e) {
				System.out.println("El numero debe ser positivo");
			}
		
		
		return raiz;
	}
}
