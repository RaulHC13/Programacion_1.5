package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenerico {

	public static <T> String separarPorComas(List<T> elementos) {
		StringBuilder elementosSeparadosPorComas = new StringBuilder();
		for (T elemento : elementos) {
			elementosSeparadosPorComas.append(elemento).append(',');
		}
		if (elementosSeparadosPorComas.length() > 0) {
			elementosSeparadosPorComas.deleteCharAt(elementosSeparadosPorComas.length() - 1);
		}
		return elementosSeparadosPorComas.toString();
	}
	
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		System.out.println(separarPorComas(numeros));

		List<String> cadenas = new ArrayList<>();
		cadenas.add("Hola");
		cadenas.add("que");
		cadenas.add("tal");
		System.out.println(separarPorComas(cadenas));
	}
}