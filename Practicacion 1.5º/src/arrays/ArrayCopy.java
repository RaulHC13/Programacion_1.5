package arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] miArray = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 };
		/*
		for (int i = 0; i < miArray.length; i++) {
			System.out.println("Elemento en el índice: " + i + ", valor: " + miArray[i]);
		}*/
		
		int indice = 0;
		for (int elemento : miArray) {
			System.out.println("Elemento en el índice: " + indice++ + ", valor: " + elemento);
		}

	}

}
