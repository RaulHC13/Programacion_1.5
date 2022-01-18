package arraysEjercicios;

import utilidades.Entrada;

public class LeerDNI {
	
	private static final char[] Letras_DNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};


	public static void main(String[] args) {
		
		int dni;
		
		do {
			System.out.println("Introduce el número de DNI: ");
			dni = Entrada.entero();
		} while (dni < 1 || dni > 99999999);
		System.out.println("La letra de tu DNI es: " + Letras_DNI[dni%23]);
		
		
	}
	
}
