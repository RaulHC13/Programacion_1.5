package expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utilidades.Entrada;

public class PedirDNI {

    private static final String ER_DNI = "([0-9]{8})([A-Za-z])";

    public static void main(String[] args) {
    	
        String dni;
        Pattern patron;
        Matcher comparador;

        patron = Pattern.compile(ER_DNI);
        do {
            System.out.print("Introduce un DNI: ");
            dni = Entrada.cadena();
            comparador = patron.matcher(dni);
        } while (!comparador.matches());

        System.out.printf("Número: %s%n", comparador.group(1));
        System.out.printf("Letra NIF: %s%n", comparador.group(2));
        
        char dniLetra = comparador.group(2).charAt(0); //Se pasa la letra de string a char
        int dniNum;
        
        dniNum = Integer.parseInt(comparador.group(1));//Se pasan los numeros de string a int
        
        int resto = dniNum%23;
       
        System.out.printf("El resto es: %d %n", resto);
        
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        boolean valido = false;
        
        if(letras[resto] == dniLetra) {
        	valido = true;
        	} else valido = false;
        if(valido == true) {
        	System.out.println("Es un DNI válido");
        }else System.out.println("No es un DNI válido");
    }

}