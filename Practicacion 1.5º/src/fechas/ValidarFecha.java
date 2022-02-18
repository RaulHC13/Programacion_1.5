package fechas;

import utilidades.Entrada;

public class ValidarFecha {
	
	public static final String FORMATO_FECHA_HORA = "\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01]) (2[0-3]|[01][0-9]):[0-5][0-9]";
	
	public static void main(String[] args) {
		
		String fecha;
		
		System.out.println("Introduce una fecha y hora (YYYY-MM-DD HH:mm)");
		fecha = Entrada.cadena();
		
		if (fecha.matches(FORMATO_FECHA_HORA)) {
			System.out.printf("La fecha y hora es válida y es: %s", fecha);
		}else System.out.println("No es una fecha y hora válida");
	}
}