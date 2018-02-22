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
	
	public Aerolinea() {}

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
	
	public void guardar(String path) {
		
		FileOutputStream fos;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(this);
		}catch (FileNotFoundException e){
			System.out.println("404 fichero not found");

		}catch (IOException e) {
			System.out.println("No es serializable");
		}finally {
			try {
				oos.close();
			}catch(IOException e) {
				System.out.println("no se puede cerrar");
			}
		}
	}
	
	
	public void leer(String path) throws IOException, ClassNotFoundException {
		FileInputStream fis;
		ObjectInputStream ois=null;
		
		fis = new FileInputStream(path);
		ois=new ObjectInputStream(fis);
		Aerolinea b=(Aerolinea) ois.readObject();
		this.nombre = b.nombre;
		System.out.println("!!!" +nombre);
		this.pasajeros = b.pasajeros;
		this.aviones = b.aviones;
		this.vuelos = b.vuelos;
		this.empleados = b.empleados;
		this.tiquetes = b.tiquetes;
		this.aeropuertos = b.aeropuertos;
		this.maletas = b.maletas;
		ois.close();
	}
	
	
	@Override
	public String toString() {
		return "Aerolinea [nombre=" + nombre + ", pasajeros=" + Arrays.toString(pasajeros) + ", aviones="
				+ Arrays.toString(aviones) + ", vuelos=" + Arrays.toString(vuelos) + ", empleados="
				+ Arrays.toString(empleados) + ", tiquetes=" + Arrays.toString(tiquetes) + ", aeropuertos="
				+ Arrays.toString(aeropuertos) + ", maletas=" + Arrays.toString(maletas) + "]";
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Aerolinea a = new Aerolinea("IsisAirlines");
		a.AddAvion("AA", 10, 0);
		a.AddAvion("XX", 5555, 0);
		a.AddAvion("BB", 111, 0);
		
		String [] p1 = {"1111","222","333"};
		
		a.AddAeropuerto("Z", "Z", "Z"); a.aeropuertos[1].setPuertas(p1);
		a.AddAeropuerto("A", "A", "A"); a.aeropuertos[2].setPuertas(p1);
		a.AddAeropuerto("B", "B", "B"); a.aeropuertos[3].setPuertas(p1);
		a.AddAeropuerto("C", "C", "C"); a.aeropuertos[4].setPuertas(p1);
		
		a.guardar("aerolinea.ins");
		
		Aerolinea b = new Aerolinea();
		b.leer("aerolinea.ins");
		System.out.println(b);
	}
}
