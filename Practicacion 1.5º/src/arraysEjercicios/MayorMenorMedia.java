package arraysEjercicios;

import utilidades.Entrada;

public class MayorMenorMedia {

	public static void main(String[] args) {
		
		int cantidadNum;
		
		do {
			System.out.println("Introduce un número mayor o igual a 3: ");
			cantidadNum = Entrada.entero();
		} while (cantidadNum < 3);
		
		int array1[] = new int[cantidadNum];
		int media = 0;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int)((Math.random())*100);	
		}
		for (int i = 0; i < array1.length; i++) {
			media += array1[i];
		}
		int mediaFinal = media/cantidadNum;
		int numEncima = 0;
		int numDebajo = 0;
		int numIgual = 0;
		
		StringBuilder posicionesIgualesMedia = new StringBuilder();
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > mediaFinal) 
				numEncima++;
				
			else if (array1[i] < mediaFinal) 
			numDebajo++;
			else {
				numIgual++;
				posicionesIgualesMedia.append(posicionesIgualesMedia.toString().equals("")? "" :",");
				posicionesIgualesMedia.append(i);
			}	
		}
		
		System.out.printf("La media de los números es: %d %n", mediaFinal);
		System.out.printf("Hay %d números por encima de la media %n", numEncima);
		System.out.printf("Hay %d números por debajo de la media %n", numDebajo);
		System.out.printf("Hay %d números iguales que la media %n", numIgual);
		System.out.printf("Las posiciones de los elementos igual a la media son: %s %n", posicionesIgualesMedia);
	}

}
