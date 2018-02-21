import java.util.Date;

public class Vuelo {
	protected Avion [] aviones;
	protected String[] idTiquetes;
	protected Empleado[] tripulacion;
	protected String IDvuelo; 
	protected Date fechaSalida;
	protected Date fechaRealSaida;
	protected Date fechaLlegada;
	protected double duracionVuelo;
	protected Aeropuerto origen;
	protected Aeropuerto destino;
	
	public Vuelo(Avion[] aviones, String[] idTiquetes, String iDvuelo, Date fechaSalida, Date fechaRealSaida,
			Date fechaLlegada, Aeropuerto origen, Aeropuerto destino) {
		super();
		this.aviones = aviones;
		this.idTiquetes = idTiquetes;
		IDvuelo = iDvuelo;
		this.fechaSalida = fechaSalida;
		this.fechaRealSaida = fechaRealSaida;
		this.fechaLlegada = fechaLlegada;
		this.origen = origen;
		this.destino = destino;
	}

}
