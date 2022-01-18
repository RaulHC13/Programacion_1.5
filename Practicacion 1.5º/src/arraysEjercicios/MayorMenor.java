package arraysEjercicios;

import utilidades.Entrada;

public class MayorMenor {
	
public static void main(String[] args) {
	
	int cantidadNum;
	
	do {
		System.out.println("Introduce la cantidad de números: ");
		cantidadNum = Entrada.entero();
		
	} while (cantidadNum < 2);
	
	long tiempo = System.nanoTime();
	
	int [] array1 = new int[cantidadNum];
	
	for (int i = 0; i < array1.length; i++) {
		array1[i] = (int) (Math.random()*1000);
	}
	int mayor = 0;
    int menor = 1000;
    int posMayor = 0;
    int posMenor = 0;
    
    for (int i = 0; i < array1.length; i++) {
		if (array1[i] > mayor) {
			mayor = array1[i];
			posMayor = i;
		}
		if (array1[i] < menor) {
			menor = array1[i];
			posMenor = i;
		}
	}
    
    long tiempo2 = (System.nanoTime() - tiempo);
    
    System.out.printf("El mayor número es %d y está en la posición: %d %n", mayor, posMayor);
    System.out.printf("El menor número es %d y está en la posición: %d %n", menor, posMenor);
	System.out.println("Tiempo de ejecución: " + tiempo2);
	
}
}
