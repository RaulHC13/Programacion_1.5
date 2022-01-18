package arrays;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		/*char[][] crucigrama;
		
		crucigrama = new char[5][5];
		
		System.out.println(crucigrama);*/
		
		/*int[][] escalon;
		
		escalon = new int[5][];
		
		for (int i = 0; i < escalon.length; i++) {
			escalon[i] = new int[i+1];*/
		
		char[][] crucigrama;
		
		crucigrama = new char[5][5];
		
		char letra = 'a';
		
		for (int i = 0; i < crucigrama.length; i++) {
			
			for (int j = 0; j < crucigrama[i].length; j++) {
				crucigrama[i][j] = letra++;
				
				System.out.println("Elemento [" + i + ", " + j + "] = " + crucigrama[i][j]);
			}
		}
			
		}

	}
