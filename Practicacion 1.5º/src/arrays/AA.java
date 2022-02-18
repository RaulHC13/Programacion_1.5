package arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AA {
	
	private static final String ER_DNI = "([0-9]{8})([A-Za-z])";
	private static String dni = "45924068Z";
	
	public static void main(String[] args) {
		
		System.out.println(dni);
		
	
		
		
	}
	
private static Boolean comprobarLetraDni(String dni) {
		
		boolean valido = false;
		
		Pattern patron;
        Matcher comparador;
        patron = Pattern.compile(ER_DNI);
        comparador = patron.matcher(dni);
        
        char dniLetra = comparador.group(2).charAt(0); //Se pasa la letra de string a char
        int dniNum;
        
        dniNum = Integer.parseInt(comparador.group(1));//Se pasan los numeros de string a int
        int resto = dniNum%23;
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        if(letras[resto] == dniLetra) {
        	valido = true;
        } else valido = false;
        
        System.out.println(valido);
		
		return valido;
	}

}
