import java.io.Serializable;

public class Aeropuerto implements Serializable{
	public String nombre,ciudad,pais;
	public String puertas[];
	public boolean estado;
	
	
	public Aeropuerto(String nombre, String ciudad, String pais, String[] puertas) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.puertas = puertas;
		this.estado = true;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String[] getPuertas() {
		return puertas;
	}

	public String getPuertasString() {
		String a="";
		for(int i=0;i<puertas.length;i++) {
			a += puertas[i];
			a += "/";
		}
		return a;
	}

	public void setPuertas(String[] puertas) {
		this.puertas = puertas;
	}


	public boolean getEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
}
