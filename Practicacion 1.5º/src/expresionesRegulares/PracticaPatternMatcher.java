package expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utilidades.Entrada;

public class PracticaPatternMatcher {
	
	private static final String TEST = "([0-9]{4})([A-Z]{2})";
	public static void main(String[] args) {
		
		String string;
		Pattern patron;
		Matcher matcher;
		
		patron = Pattern.compile(TEST);
		do {
			System.out.println("Introduce una string: ");
			string = Entrada.cadena();
			matcher = patron.matcher(string);
		} while (!matcher.matches());
			
		System.out.println(matcher.group(1));
		System.out.println(matcher.group(2));
	}	
}