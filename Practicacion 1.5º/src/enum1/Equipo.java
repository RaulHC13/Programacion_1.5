package enum1;

public enum Equipo {
	
	MALAGA("Malaga C.F",2,7), ALMERIA("UD Almeria",2,1), GRANADA("Granada CF",1,8);
	
	private String nombreClub;
	private int categoria;
	private int posicionActual;
	
	private Equipo(String nombreClub, int categoria, int posicionActual) {
		
		this.nombreClub = nombreClub;
		this.categoria = categoria;
		this.posicionActual = posicionActual;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getPosicionActual() {
		return posicionActual;
	}

	public void setPosicionActual(int posicionActual) {
		this.posicionActual = posicionActual;
	}
	
	

}
