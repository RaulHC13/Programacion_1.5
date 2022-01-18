package arrays;

public class StringTest {

	public static void main(String[] args) {
		
		String test = "Test";
		String test2 = "Test";
		
		System.out.println(test);
		System.out.println(test2);
		System.out.println(test==test2);//Al crearlo de la manera implicita se crea una referencia al objeto String que contiene Test
		                                //pero ambos métodos crean una referencia al mismo objeto por lo que la comparacion es true.
		
		String test3 = new String("Test");
		String test4 = new String("Test");
		
		System.out.println(test3);
		System.out.println(test4);
		System.out.println(test3==test4);
		
		String metodo = "MetoDoTEST";

		System.out.println(metodo.indexOf("S"));//Da 8 por que la S está en la posicion 8 de esta String
		System.out.println(metodo.compareToIgnoreCase("metodotest"));
		System.out.println(metodo.toUpperCase());

	}

}
