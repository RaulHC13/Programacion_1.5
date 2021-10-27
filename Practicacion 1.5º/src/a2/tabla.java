package a2;

public class tabla {

	public static void main(String[] args) {
		
		for (int a = 1; a <= 10; a++) {
			System.out.println("La tabla del " + a);
			for (int b = 1; b <= 10; b++) {
				System.out.println( a + " x " + b + " = " +  a*b);
			}
		}
	}	
}