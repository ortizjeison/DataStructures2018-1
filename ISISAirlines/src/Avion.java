import java.io.Serializable;

public class Avion implements Serializable{

	protected String matricula;
	protected int horasVuelo;
	protected int estado;
	
	
	
	
	public Avion(String matricula, int horasVuelo, int estado) {
		super();
		this.matricula = matricula;
		this.horasVuelo = horasVuelo;
		this.estado = estado;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getHorasVuelo() {
		return horasVuelo;
	}
	public void setHorasVuelo(int horasVuelo) {
		this.horasVuelo = horasVuelo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
