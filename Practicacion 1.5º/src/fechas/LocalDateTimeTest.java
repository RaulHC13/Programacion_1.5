package fechas;

import java.time.LocalDateTime;

public class LocalDateTimeTest {

	public static final String FORMATO_FECHA_HORA = "([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4} (2[0-3]|[01][0-9]):[0-5][0-9]";
	private static LocalDateTime fechaHora = LocalDateTime.of(2022, 10, 10, 10, 10);
	
	public static void main(String[] args) {
		
		System.out.println(fechaHora);
		
		
	}
	
	
	
}
