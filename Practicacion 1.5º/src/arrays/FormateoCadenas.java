package arrays;

public class FormateoCadenas {

	public static void main(String[] args) {
		
		String dos = "String";
		
		int int1 = 2;
		
		String salida = String.format("Formateo %s Numero %x", dos, int1);
		System.out.println(salida);
		
		//System.out.println(String.format("Formateo %s Numero %x", dos, int1)); También es valido

		
		
		/* int numero = 1234;
		System.out.printf("|%d|%n", numero);	//Mostramos el número sin más
		System.out.printf("|%10d|%n", numero);	//Mostramos el número  especificando su longitud
		System.out.printf("|%-10d|%n", numero);	//Mostramos el número especificando su longitud y justificado a la izquierda
		System.out.printf("|%010d|%n", numero);	//Mostramos el número especificando su longitud y rellenamos de 0`s el tamaño no ocupado
		System.out.printf("|%,10d|%n", numero); //Mostramos el número especificando su longitud y utilizando de separador de miles el separador local
		*/
		
		/* double q = 1.0 / 3.0;
		System.out.printf("1.0/3.0 = %5.3f %n", q); //Longitud 5 con 3 decimales
		System.out.printf("1.0/3.0 = %7.5f %n", q); //Longitud 7 con 5 decimales
		q = 1.0 / 2.0;
		System.out.printf("1.0/2.0 = %09.3f %n", q); //Longitud 9 con relleno de 0s a la izquierda y 3 decimales
	    */
		
		/* String nombre = "Nombre";
		
		System.out.printf("Nombre: |%s|%n", nombre);
		System.out.printf("Nombre: |%15s|%n", nombre);		//Especifico anchura de 15
		System.out.printf("Nombre: |%-15s|%n", nombre);		//Especifico anchura y justificación izquierda
		System.out.printf("Nombre: |%.5s|%n", nombre);		//Especifico máximo de caracteres a mostrar
		System.out.printf("Nombre: |%15.5s|%n", nombre);	//Especifico anchura y número máximo de caracteres a mostrar
		*/
	}

}