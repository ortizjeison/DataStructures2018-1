import java.io.Serializable;
import java.util.Date;

public class Vuelo implements Serializable{
	private Avion [] aviones;
	private String[] idTiquetes;
	private Empleado[] tripulacion;
	private String IDvuelo;
	public static int k=0;
	private Date fechaSalida;
	private Date fechaRealSaida;
	private Date fechaLlegada;
	private double duracionVuelo;
	private Aeropuerto origen;
	private Aeropuerto destino;
	
	public Vuelo(String idvuelo, Date fechaSalida, Date fechaRealSaida,
			Date fechaLlegada, Aeropuerto origen, Aeropuerto destino) {
		super();
		this.aviones = new Avion[1];
		this.idTiquetes = new String[1];
		this.IDvuelo = idvuelo;
		this.fechaSalida = fechaSalida;
		this.fechaRealSaida = fechaRealSaida;
		this.fechaLlegada = fechaLlegada;
		this.origen = origen;
		this.destino = destino;
	}

	public Avion[] getAviones() {
		return aviones;
	}

	public void setAviones(Avion[] aviones) {
		this.aviones = aviones;
	}

	public String[] getIdTiquetes() {
		return idTiquetes;
	}

	public void setIdTiquetes(String[] idTiquetes) {
		this.idTiquetes = idTiquetes;
	}

	public Empleado[] getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(Empleado[] tripulacion) {
		this.tripulacion = tripulacion;
	}

	public String getIDvuelo() {
		return IDvuelo;
	}

	public void setIDvuelo(String iDvuelo) {
		IDvuelo = iDvuelo;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Date getFechaRealSaida() {
		return fechaRealSaida;
	}

	public void setFechaRealSaida(Date fechaRealSaida) {
		this.fechaRealSaida = fechaRealSaida;
	}

	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public double getDuracionVuelo() {
		return duracionVuelo;
	}

	public void setDuracionVuelo(double duracionVuelo) {
		this.duracionVuelo = duracionVuelo;
	}

	public Aeropuerto getOrigen() {
		return origen;
	}

	public void setOrigen(Aeropuerto origen) {
		this.origen = origen;
	}

	public Aeropuerto getDestino() {
		return destino;
	}

	public void setDestino(Aeropuerto destino) {
		this.destino = destino;
	}

	
}
