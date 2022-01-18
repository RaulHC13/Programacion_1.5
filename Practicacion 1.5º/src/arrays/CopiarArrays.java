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

public class CopiarArrays {

	public static void main(String [] args) {
		
	/*	Punto[] arrayOrigen = { new Punto(1, 1) };
		
		Punto[] arrayDestino = new Punto[1];
		
		arrayDestino = arrayOrigen; //Copia el origen en destino pero
		arrayOrigen[0].setX(2); //Al alterar el origen tambien se altera el destino, ya que se copia una referencia

		System.out.println(arrayOrigen == arrayDestino);	//Y por tanto muestra true
		
		System.out.println(arrayOrigen[0] + ", " + arrayDestino[0]); //Muestra Punto[x=2, x=1], Punto[x=2, y=1] 
		----------------------------------------------------------------------------------------------------------*/
		
		/* Punto[] arrayOrigen = { new Punto(1, 1) };
		
		Punto[] arrayDestino = new Punto[1];
		
		arrayDestino = arrayOrigen.clone(); //Utiliza el método clone y crea una nueva referencia
		arrayOrigen2[0].setX(2);

		System.out.println(arrayOrigen == arrayDestino);	//Muestra false por que son distintas referencias pero se igualan las referencias
		System.out.println(arrayOrigen[0] + ", "
				+ arrayDestino[0]); //Muestra Punto[x=2, x=1], Punto[x=2, y=1] */
		
		/*Punto[] arrayOrigen = { new Punto(1, 1) };
		
		Punto[] arrayDestino = new Punto[1];
		
		for (int i = 0; i < arrayOrigen.length; i++) {
			
			arrayDestino[i] = new Punto(arrayOrigen[i]);
		}
		arrayOrigen[0].setX(2);

		System.out.println(arrayOrigen == arrayDestino);	//Muestra false
		System.out.println(arrayOrigen[0] + ", " + arrayDestino[0]); //Muestra Punto[x=2, x=1], Punto[x=1, y=1]*/
	}
}