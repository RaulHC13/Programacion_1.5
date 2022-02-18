package random;

import utilidades.Entrada;

public class Boolean {

	
	private static boolean tamanoSuperado(int tamano) {
		boolean tamanoSuperado = false;;
		
		if (tamano > 5) {
			 tamanoSuperado = true;
		} else if (tamano <= 5) {
			 tamanoSuperado = false;
		}
		
		return tamanoSuperado;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Introduce un tamano: ");
		int tamano = Entrada.entero();
		
		boolean asd = tamanoSuperado(tamano);
		
		System.out.println(asd);
		
	}
	
}