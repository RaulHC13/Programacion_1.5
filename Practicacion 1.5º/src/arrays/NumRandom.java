package arrays;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class NumRandom {

	public static void main(String[] args) {
		
		/* long inicio = System.nanoTime();
		
		int x = 100;
		int y = 200;
		int aleatorio1 = (int) (Math.random() * (y - x + 1) + x);
		int aleatorio2 = (int) Math.floor(Math.random() * (y - x + 1) + x);
		
		System.out.printf("Aleatorio 1 = %d, Aleatorio 2 = %d %n", aleatorio1, aleatorio2);

		long tiempo = (System.nanoTime() - inicio);
		System.out.println("Tiempo de ejecución: " + tiempo/1000 + " nano segundos");
		*/
		
		Random random = new Random();
		
		int numAleatorio = random.nextInt(200 - 100 + 1) + 100;
		
		System.out.println(numAleatorio);
		
		IntStream flujoNumerosAleatorios = random.ints(15, 1, 7);
		flujoNumerosAleatorios.forEach(tirada -> System.out.println(tirada));
		
		}
		
	}
