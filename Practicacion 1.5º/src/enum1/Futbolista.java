package enum1;

public class Futbolista {
	
	private int dorsal;
	private String nombre;
	private Demarcacion demarcacion;
	private Equipo equipo;
	
	public Futbolista() {
		
		this.dorsal = 1;
		this.nombre = "";
		this.demarcacion = Demarcacion.PORTERO;
		this.equipo = Equipo.ALMERIA;
	}
	
	public Futbolista(int dorsal, String nombre, Demarcacion demarcacion, Equipo equipo) {
		
		setDorsal(dorsal);
		setNombre(nombre);
		setDemarcacion(demarcacion);
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		if (dorsal < 1 || dorsal > 99) {
			throw new IllegalArgumentException("El dorsal no es valido.");
		}
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		
		if (nombre == null) {
			throw new NullPointerException("No puede ser null");
		}
		if (nombre.isEmpty()) {
			throw new IllegalArgumentException("No puede estar vacio");
		}
		this.nombre = nombre;
	}

	public Demarcacion getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(Demarcacion demarcacion) {
		if (demarcacion == null) {
			throw new NullPointerException("No puede ser null");
		}
		
		this.demarcacion = demarcacion;
	}

	public Equipo getEquipo() {
		return equipo;
	}
	
	public void setEquipo(Equipo equipo) {
		
		if (equipo == null) {
			throw new NullPointerException("No puede ser null");
		}
		this.equipo = equipo;
	}

	
	
}
