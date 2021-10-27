package a2;
import utilidades.Entrada;

public class TestEntrada {
	
	public static void main(String[] args) {
		final int x = 4;
		int y = 0;
		
		System.out.println("Introduce un número");
		y = x + Entrada.entero();
		System.out.println("y = " + y);
		
	}
}
