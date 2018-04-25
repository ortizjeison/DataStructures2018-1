
public class Paciente {
	String nombre;
	String nombre_medico;
	public Paciente(String nombre, String nombre_medico) {
		super();
		this.nombre = nombre;
		this.nombre_medico = nombre_medico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre_medico() {
		return nombre_medico;
	}
	public void setNombre_medico(String nombre_medico) {
		this.nombre_medico = nombre_medico;
	}
	
	
}
