
public class Consultorio {
	private String ubicacion;
	private boolean disponible;
	
	public boolean getDisponible() {
		return disponible;
	}
	public Consultorio(String u) {
		ubicacion = u;
		disponible = true;
	}
}
