package a2;

import utilidades.Entrada;

public class Mayor_Menor {

	public static void main(String[] args) {
		
		int menorNum = 0, mayorNum = 0;
		
		System.out.println("Introduce la cantidad de números a introducir");
		int x = Entrada.entero();
		
		for (int i = 1; i <= x; i++) {
			
			System.out.println("Introduce un numero");
			int num = Entrada.entero();
			
			 menorNum = Math.min(num, menorNum);
			 mayorNum = Math.max(num, mayorNum);
		}
		
		System.out.println("El mayor numero es " + mayorNum);
	    System.out.println("El menor numero es " + menorNum);
		 
	}

}