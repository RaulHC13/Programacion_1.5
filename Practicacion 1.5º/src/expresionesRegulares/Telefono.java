package expresionesRegulares;

import java.util.regex.Pattern;

public class Telefono {
	
	private static final String ER_TELEFONO = "([6|9][0-9]{8})";//???
	
	public static void main(String[] args) {
		
		String telefono = "676851232";
		
		
		if ((Pattern.matches(ER_TELEFONO, telefono)) == false) {
			
			System.out.println("No es válido");
		} else  System.out.println("Si es válido");
		
		
		
	}
	
}
