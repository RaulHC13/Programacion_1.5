public Controlador(Modelo modelo, Vista vista) 
{
	if (modelo == null) {
		throw new IllegalArgumentException("ERROR: El modelo no puede ser nulo.");
	}
	
	if (vista == null) {
		throw new IllegalArgumentException("ERROR: La vista no puede ser nula.");
	}
	
	this.modelo = modelo;
	this.vista = vista;
	this.vista.setControlador(this);
}