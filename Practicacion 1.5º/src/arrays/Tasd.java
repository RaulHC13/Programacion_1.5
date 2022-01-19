package arrays;

import utilidades.Entrada;

public class Tasd {

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
		
	}
	
}
