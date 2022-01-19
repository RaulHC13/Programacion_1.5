package arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utilidades.Entrada;

public class PruebaIniciales {

	public static void main(String[] args) {
		
		System.out.println("Introduce una string: ");
		
		 String nombre = Entrada.cadena();
		 
		 char[] caracteres = nombre.toCharArray();
		 caracteres[0] = Character.toUpperCase(caracteres[0]);
		 
		 for (int i = 0; i < nombre.length() -1; i++) 
			 
			  if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',')
				  
			  caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
		 
		String salida = new String(caracteres);
		 
		 
		//salida = salida.replaceAll("\\s+", "");
		 System.out.println(salida.trim());
		
		 
		 String patron = "([a-z])";
		
		 
	    Pattern minusculas = Pattern.compile(patron);
		Matcher compararMinusculas = minusculas.matcher(salida);
		
		System.out.println((compararMinusculas.replaceAll("")).replaceAll("\\s", ""));
		
	}
	
}