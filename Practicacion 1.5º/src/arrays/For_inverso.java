package arrays;

public class For_inverso {

	public static void main(String[] args) {
		
		
		int indice = 2;
		
		int asd[] = {2,4,6,8};
		
		int i;
		for (i = indice; i < asd.length-1; i++) {
			asd[i] = asd[i+1];
			System.out.println(asd[i]);
		}
		System.out.println("\n\n");
		asd[i] = 0;
		
		for (int j = 0; j < asd.length; j++) {
			System.out.println(asd[j]);
		}
		
		
	}
	
}
