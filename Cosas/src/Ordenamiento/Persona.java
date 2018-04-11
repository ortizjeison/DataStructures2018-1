package Ordenamiento;

public class Persona implements Comparable<Persona> {
	public String nombre;
	public int edad;
	
	

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int compareTo(Persona p) {
		//return nombre.compareTo(p.getNombre());
		return nombre.compareTo(p.getNombre());
				//(nombre.compareTo(p.getNombre())==0)?edad-p.getEdad():nombre.compareTo(p.getNombre());
	}

	
	public String toString() {
		return nombre + " / " + edad;
	}	
	
}
