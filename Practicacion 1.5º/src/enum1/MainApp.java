package enum1;

public class MainApp {
	
	public static void main(String[] args) {
		Futbolista raul = new Futbolista();
		Futbolista fernando = new Futbolista(13, "Fernando", Demarcacion.PORTERO,Equipo.ALMERIA);
		
		
		System.out.println(raul.getDemarcacion().name());
		
		System.out.println(raul.getDemarcacion().toString());
		
		System.out.println(raul.getDemarcacion().ordinal());
		
		Demarcacion [] listaDemarcacion = raul.getDemarcacion().values();
		Equipo [] listaEquipo = raul.getEquipo().values();
		
		for (Equipo varE:listaEquipo) {
			System.out.println(varE);
		}
		
		
		if (raul.getDemarcacion().equals(fernando.getDemarcacion())) {
			System.out.println("Son iguales");
		} else
			System.out.println("No son iguales");
		
	}
}