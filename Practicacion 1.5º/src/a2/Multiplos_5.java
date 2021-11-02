package a2;
import utilidades.Entrada;
public class Multiplos_5 {

	public static void main(String[] args) {
		
		System.out.println("Introduce un numero");
		int x = Entrada.entero();
		System.out.println("Los multiplos de 5 entre 1 y " + x + " son");
		
		for (int i = 1; i <= x; i++) {
			
			if (i % 5 == 0)
				System.out.println(i);
	
		}
	}

}
