
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
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
