package colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import utilidades.Entrada;

public class SetColeccion {
	
	public static void main(String[] args) {
		//hashSet();
		//linkedHashSet();
		treeSet();
	}
	private static void hashSet() {
		
		Set<Integer> conjunto = new HashSet<>();
		int n, suma = 0;
		
		System.out.printf("Resultado hashSet");
		System.out.printf("%n-----------------%n");
		do {
			System.out.println("Introduce un int: ");
			n = Entrada.entero();
			if(!conjunto.add(n)) {
				System.out.println("Introduce un número. " + n + " ya se ha introducido.");
			} else {
				conjunto.add(n);
			}
		} while(conjunto.size()<5);
		for (Integer integer : conjunto) {
			System.out.println("Número introducido = " + integer);
			suma += integer;
		}
		System.out.println("La suma de todos los elementos del conjunto " + conjunto + " es: " + suma);
	}
	private static void linkedHashSet() {
		
		Set<Integer> conjunto = new LinkedHashSet<>();
		int n, suma = 0;
		
		System.out.printf("Resultado linkedHashSet");
		System.out.printf("%n-----------------%n");
		do {
			System.out.println("Introduce un int: ");
			n = Entrada.entero();
			if(!conjunto.add(n)) {
				System.out.println("Introduce un número. " + n + " ya se ha introducido.");
			} else {
				conjunto.add(n);
			}
		} while(conjunto.size()<5);
		for (Integer integer : conjunto) {
			System.out.println("Número introducido = " + integer);
			suma += integer;
		}
		System.out.println("La suma de todos los elementos del conjunto " + conjunto + " es: " + suma);
	}
	private static void treeSet() {
		
		Set<Integer> conjunto = new TreeSet<>();
		int n, suma = 0;
		
		System.out.printf("Resultado linkedHashSet");
		System.out.printf("%n-----------------%n");
		do {
			System.out.println("Introduce un int: ");
			n = Entrada.entero();
			if(!conjunto.add(n)) {
				System.out.println("Introduce un número. " + n + " ya se ha introducido.");
			} else {
				conjunto.add(n);
			}
		} while(conjunto.size()<5);
		for (Integer integer : conjunto) {
			System.out.println("Número introducido = " + integer);
			suma += integer;
		}
		System.out.println("La suma de todos los elementos del conjunto " + conjunto + " es: " + suma);
	}
}