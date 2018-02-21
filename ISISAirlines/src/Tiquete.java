import java.util.Date;

public class Tiquete {
	protected String idPasajero;
	protected String idVuelo;
	protected double costo;
	protected Maleta Maletas[];
	protected Date fecha;
	protected String id;
	protected String tipo;
	
	
	public Tiquete(String idPasajero, String idVuelo, double costo, Maleta[] maletas, Date fecha, String id,
			String tipo) {
		super();
		this.idPasajero = idPasajero;
		this.idVuelo = idVuelo;
		this.costo = costo;
		Maletas = maletas;
		this.fecha = fecha;
		this.id = id;
		this.tipo = tipo;
	}
	
	
	
}
