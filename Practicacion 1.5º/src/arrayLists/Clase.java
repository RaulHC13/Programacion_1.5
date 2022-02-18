package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Clase {
	
private int numero;
private char letra;

	public Clase (int numero, char letra) {
		
		setNumero(numero);
		setLetra(letra);
		
	}
	
	public static void main(String[] args) {
		
		Clase[] clase = new Clase[4];
		
		for (int i = 0; i < clase.length; i++) {
			int random = (int)(Math.random()*10);
			char letra = 'a';
			
			switch (i) {
			case 0:
				letra = 'A';
				break;
			case 1:
				letra = 'B';
				break;
			case 2:
				letra = 'C';
				break;
			case 3:
				letra = 'D';
				break;
			}
			
			clase[i] = new Clase(Math.round(random), letra);
			//System.out.println(clase[i].getNumero() + " || " + clase[i].getLetra());
		}
		
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList());
		
	for (int i = 0; i < 4; i++) {
		arrayList.add("a");
		
		
	}
	
	arrayList.set(0, "b");
	System.out.println(arrayList.contains("b"));
			
	
	for (int i = 0; i < arrayList.size(); i++) {
		System.out.println(arrayList);
	}
		}
	
	
	

	public int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}

	public char getLetra() {
		return letra;
	}

	private void setLetra(char letra) {
		this.letra = letra;
	}
	
	
	
}