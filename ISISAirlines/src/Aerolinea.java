import java.io.*;
import java.sql.Date;
import java.util.Arrays;

public class Aerolinea implements Serializable{
	
	public String nombre;
	protected Pasajero[] pasajeros;
	protected Avion[] aviones;
	protected Vuelo[] vuelos;
	protected Empleado[] empleados;
	protected Tiquete[] tiquetes;
	protected Aeropuerto[] aeropuertos;
	protected Maleta[] maletas;
	
	
	public Aerolinea(String nombre) {
		super();
		this.nombre = nombre;
		this.pasajeros = new Pasajero[1];
		this.aviones = new Avion[1];
		this.vuelos = new Vuelo[1];
		this.empleados = new Empleado[1];
		this.tiquetes = new Tiquete[1];
		this.aeropuertos = new Aeropuerto[1];
		this.maletas = new Maleta[1];
	}
	

	public Vuelo[] getVuelos() {
		return vuelos;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}



	public Aeropuerto[] getAeropuertos() {
		return aeropuertos;
	}


	public void setAeropuertos(Aeropuerto[] aeropuertos) {
		this.aeropuertos = aeropuertos;
	}


	public void AddAvion(String matricula, int time, int estado) {
		Avion a = new Avion(matricula,time,estado);
		if(aviones==null) {
			aviones = new Avion[1];
			aviones[aviones.length -1] = a;
		}else{			
			aviones = Arrays.copyOf(aviones, aviones.length +1);
			aviones[aviones.length -1] = a;
		}
		
	}
	
	
	public void AddAeropuerto(String nombre,String ciudad,String pais) {
		Aeropuerto a = new Aeropuerto(nombre,ciudad,pais, null);
		if(aviones==null) {
			aeropuertos = new Aeropuerto[1];
			aeropuertos[aeropuertos.length -1] = a;
		}else{			
			aeropuertos = Arrays.copyOf(aeropuertos, aeropuertos.length +1);
			aeropuertos[aeropuertos.length -1] = a;
		}
	}
	
	public void crearVuelo(Date fsalida, Date frealSalida, Date fllegada, Aeropuerto partida, Aeropuerto llegada) {
		Avion a = buscarAvion();
		if(a==null) {
			//404 avion not found
		}
		a.setEstado(0);
		//Buscar aeropuerto
		if(partida.getEstado()==true && llegada.getEstado()==true) {
			
		}
	}
	
	
	
	
	public Avion buscarAvion() {
		int i =0;
		while(i<aviones.length) {
			if(aviones[i].estado==1) {
				return aviones[i];
			}
		i++;
		}
		return null;
	}
	
	public Aeropuerto buscarAeropuerto(String nombre) {
		int i=0;
		while(i<aeropuertos.length) {
			if(aeropuertos[i].getEstado()==true) {
				return aeropuertos[i];
				}
			i++;
		}
		return null;
	}
	
}
