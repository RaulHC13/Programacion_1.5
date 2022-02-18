package arrayLists;

public class PruebaContenedor {

	public static void main(String[] args) {
		Contenedor<Integer> contenedorEntero = new Contenedor<>(1);
		System.out.println("Contenido del contenedor entero: " + contenedorEntero.get());

		Contenedor<String> contenedorCadena = new Contenedor<>("Hola!");
		System.out.println("Contenido del contenedor cadena: " + contenedorCadena.get());
	}
}