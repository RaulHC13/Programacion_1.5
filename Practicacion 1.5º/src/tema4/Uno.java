package tema4;

public class Uno {

	public static void main(String[] args) {
		
		String aa = "AasdwF"; //Al declarar asi las strings, apuntan al mismo lugar en memoria.
		String ab = "AasdwF"; //Por lo que al comprobarlas seran igual.
		
		String asd = new String("AasdwF"); // Al crearla asi, instanciandola, apunta a un lugar distinto en memoria.
		
		
		
		System.out.println("Longitud: " + asd.length()); 
		System.out.println(aa == ab); //true
		System.out.println(aa == asd); //false
		
	}
}
