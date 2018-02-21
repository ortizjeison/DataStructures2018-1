import java.io.Serializable;
import java.util.Date;

public abstract class Persona implements Serializable{

	protected String nombre;
	protected String tipoID;
	protected String id;
	protected int edad;
	protected String direccion;
	protected String nacionalidad;
	protected String genero;
	protected Date fechaNacimiento;
	
	//Constructor
	public Persona(String nombre, String tipoID, String id, int edad, String direccion, String nacionalidad,
			String genero, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.tipoID = tipoID;
		this.id = id;
		this.edad = edad;
		this.direccion = direccion;
		this.nacionalidad = nacionalidad;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
