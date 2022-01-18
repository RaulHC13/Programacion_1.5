package arrays;

class Punto {
	
	private int x;
	private int y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punto(Punto otro) {
		x = otro.x;
		y = otro.y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
		
	}
	}

	public class ArrayObjetos {


		public static void main(String[] args) {
			Punto[] cuadrado = new Punto[4];
			cuadrado[0] = new Punto(0, 0); // Para cada elemento se crea un objeto con valores introducidos
			cuadrado[1] = new Punto(10, 0);
			cuadrado[2] = new Punto(10, 10);
			cuadrado[3] = new Punto(0, 10);

			for (Punto punto2: cuadrado) { //Crea punto2 para guardar el resultado de las iteraciones del foreach
				System.out.println(punto2);
			}

			System.out.println("El primer vértice del cuadrado, tiene la x=" +
					cuadrado[0].getX() + " y la y=" + cuadrado[0].getY()); //Obtiene X e Y del elemento 0
		}
}
	