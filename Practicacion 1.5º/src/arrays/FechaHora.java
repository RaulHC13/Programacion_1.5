package arrays;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FechaHora {

	public static void main(String[] args) {
		
		/*LocalDate fecha = LocalDate.now();
		System.out.println(fecha);
		
		DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("d/M/yy");
		DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatoTextoCorto = DateTimeFormatter.ofPattern("ccc, d 'de' MMM 'de' yyyy");
		DateTimeFormatter formatoTextoLargo = DateTimeFormatter.ofPattern("cccc, d 'de' MMMM 'de' yyyy");
		System.out.println("La fecha de hoy en formato corto se expresa como: " + fecha.format(formatoCorto));
		System.out.println("La fecha de hoy en formato largo se expresa como: " + fecha.format(formatoLargo));
		System.out.println("La fecha de hoy expresada en texto corto es: " + fecha.format(formatoTextoCorto));
		System.out.println("La fecha de hoy expresada en texto largo es: " + fecha.format(formatoTextoLargo));
		*/
		
		LocalTime hora = LocalTime.now();
		System.out.println(hora);
		
		DateTimeFormatter formatoCortoAMPM = DateTimeFormatter.ofPattern("h:m:s");
		DateTimeFormatter formatoLargoAMPM = DateTimeFormatter.ofPattern("hh:mm:ss");
		DateTimeFormatter formatoCorto24h = DateTimeFormatter.ofPattern("H:m:s");
		DateTimeFormatter formatoLargo24h = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter formatoTexto = DateTimeFormatter.ofPattern("h 'horas' m 'minutos' s 'segundos' a");
		System.out.println("La hora actual en formato corto AM/PM se expresa como: " + hora.format(formatoCortoAMPM));
		System.out.println("La hora actual en formato largo AM/PM se expresa como: " + hora.format(formatoLargoAMPM));
		System.out.println("La hora actual en formato corto 24h se expresa como: " + hora.format(formatoCorto24h));
		System.out.println("La hora actual en formato largo 24h se expresa como: " + hora.format(formatoLargo24h));
		System.out.println("La hora actual expresada en texto es: " + hora.format(formatoTexto));
		
		DateTimeFormatter horaCorta = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(hora.format(horaCorta));
		
		//-------------------//
		
		LocalTime mediaNoche = LocalTime.of(0, 0, 0);
		System.out.println("Media noche: " + mediaNoche.format(formatoLargoAMPM));
		
		String mediaNocheString = "00:00:00";
		mediaNoche = LocalTime.parse(mediaNocheString, formatoLargo24h);
		System.out.println("Media noche desde cadena: " + mediaNoche.format(formatoTexto));
	}

}
