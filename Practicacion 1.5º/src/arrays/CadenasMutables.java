package arrays;

public class CadenasMutables {

	public static void main(String[] args) {
		
		String nombre = "NombreString";
		StringBuilder nombreSB = new StringBuilder(nombre);
		nombreSB.delete(0, 6); //Borra desde 0 a 6
		nombreSB.deleteCharAt(3); //Borra char 3 de la string ya alterada previamente
		nombreSB.replace(3, 5, "ong");//Reemplaza desde 3 (r
		
		String nombre2 = nombreSB.toString();
		
		System.out.println(nombre2);
		
		//-------------------------------------------------------------------//
		
		final int TAMANO = 100000;
		long inicio, tiempoConsumido;

		String cadena = "";
		char ch = 'a';
		inicio = System.nanoTime();
		for (int n = 0; n < TAMANO; ++n) {
			cadena += ch;
			++ch;
			if (ch > 'z') {
				ch = 'a';
			}
		}
		tiempoConsumido = System.nanoTime() - inicio;

		System.out.printf("Tiempo: %d s. en la construcción de un String de tamaño %d caracteres%n", tiempoConsumido / 1000, TAMANO);

		StringBuilder cadenaSB = new StringBuilder();
		ch = 'a';
		inicio = System.nanoTime();
		for (int n = 0; n < TAMANO; ++n) {
			cadenaSB.append(ch);
			++ch;
			if (ch > 'z') {
				ch = 'a';
			}
		}
		tiempoConsumido = System.nanoTime() - inicio;

		System.out.printf("Tiempo: %d s. en la construcción de un StringBuilder de tamaño %d caracteres%n", tiempoConsumido / 1000, TAMANO);

		StringBuffer cadenaSBf = new StringBuffer();
		ch = 'a';
		inicio = System.nanoTime();
		for (int n = 0; n < TAMANO; ++n) {
			cadenaSBf.append(ch);
			++ch;
			if (ch > 'z') {
				ch = 'a';
			}
		}
		tiempoConsumido = System.nanoTime() - inicio;

		System.out.printf("Tiempo: %d s. en la construcción de un StringBuffer de tamaño %d caracteres%n", tiempoConsumido / 1000, TAMANO);
	}

}