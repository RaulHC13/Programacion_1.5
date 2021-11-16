package objecion;

public class Excepcion {

	public static void main(String[] args) {
		
		int d = 0;
		
		try {
			int a = 42/d;
			System.out.println("Intento " + a );
		} catch (ArithmeticException e) {
			System.out.println("Division entre cero.");
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("Despues de catch");
 
	}

}
