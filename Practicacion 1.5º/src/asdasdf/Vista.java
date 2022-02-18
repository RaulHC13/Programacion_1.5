Como os dije en clase, os paso el código del método comenzar

public void comenzar()
{
	int ordinalOpcion;
	do 
	{
		Consola.mostrarMenu();
		ordinalOpcion = Consola.elegirOpcion();
		Opcion opcion = Opcion.getOpcionSegunOrdinal(ordinalOpcion);
		opcion.ejecutar();
	} while (ordinalOpcion != Opcion.SALIR.ordinal());
}