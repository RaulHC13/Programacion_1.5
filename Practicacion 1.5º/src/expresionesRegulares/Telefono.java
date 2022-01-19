package expresionesRegulares;

import java.util.regex.Pattern;

public class Telefono {
	
	private static final String ER_TELEFONO = "([0-9]{9})";//???
	
	public static void main(String[] args) {
		
		String telefono = "664851129";
		
		
		if ((Pattern.matches(ER_TELEFONO, telefono)) == false) {
			
			System.out.println("No es válido");
		} else  System.out.println("Si es válido");
		
		
		
	}
	
}
