package arrayLists;

public class Contenedor<T> {

	T contenido;

	public Contenedor(T contenido) {
		this.contenido = contenido;
	}

	public T get() {
		return contenido;
	}
}