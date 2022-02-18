package arrayLists;

import java.util.ArrayList;
import java.util.List;
import utilidades.Entrada;

public class PacienteList {
	
	public static void main(String[] args) {
		
		addPaciente();
		addPaciente();
		addPaciente();
		System.out.println(pacienteList.get(0));
		System.out.println(pacienteList.get(1));
		System.out.println(pacienteList);
	}
	
	private static List<Paciente> pacienteList = new ArrayList<>();
	
	private static void addPaciente() {
	pacienteList.add(leerPaciente());
	}
		
	public static Paciente leerPaciente() {
		
		 Paciente pacienteLeer = null;
		 
		 String nombre, dni, telefono;
		 boolean bucle = true;
		 
		 while(bucle) {//Bucle para que en caso de error, el try catch maneje la excepción y pueda volver a pedir valores, es un bucle infinito.
		 
		 try {//Maneja la excepción que da en caso de que los valores no sean válidos.
		 
		 System.out.println("Introduce el nombre del paciente: ");
		 nombre = Entrada.cadena();
		 
		 System.out.println("Introduce el DNI del paciente: ");
		 dni = Entrada.cadena();
		 
		 System.out.println("Introduce el telefono del paciente: ");
		 telefono = Entrada.cadena();
		 
		 bucle = false;
		 
		pacienteLeer = new Paciente(nombre,dni,telefono);
		
		 } catch (Exception e) {
			 System.out.println("ERROR: Algunos de los datos no son válidos.");
			 bucle = true;
		 }
		 }
		return pacienteLeer;
	}

}
