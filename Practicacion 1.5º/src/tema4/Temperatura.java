package tema4;

public class Temperatura {

	public static void main(String[] args) {
		
		boolean busqueda;
		int numero = 4;
		int capacidad = 6;
		int valorABuscar;
		int [] temperatura;
		
		temperatura = new int[6];
		
		int[] temp1 = new int[6];
		int[] temp2 = new int[capacidad];
		int[] temp4 = new int[capacidad];
		int[] temp5 = new int[capacidad];
		
		int[] temp0 = {25,23,15,18,21};
		System.out.println("Número ed elementos de temperatura" + temperatura.length);
		
		inicializaTemperatura(temperatura);
		
		System.out.println("Mostramos el array de temperaturas");
		muestraTemperaturas(temperatura);
		
	}
	
	private static void inicializaTemperatura(int [] temperatura) {
		temperatura[i] = (int)Math.round(Math.random()*30);
	}
	
	private static void muestraTemperaturas(int [] temperatura) {
		
		for(int i=0;i<temperatura.length;i++) {
			System.out.println("El valor " + i + " de temperatura es: " + temperatura[i]);
		}
	}
	
	private static boolean busquedaTemperatura(int [] temperatura,int valor) {
		
		boolean encontrado = false;
		
		for(int i=0;i < temperatura.length && !encontrado; i++) {
			if (temperatura[i] == valor) {
			}
			System.out.println("El valor " + valor + " ha sido encontrado en la posicion " + i);
			encontrado = true;
		}
	
			
		return encontrado;
	}
}
