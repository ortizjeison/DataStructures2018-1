package Inventario;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Report {

	public int id;
	public static int auto = 0;
	public char tipo;
	public Usuario encargado;
	public String fecha;
	public ArrayList <String> data = new ArrayList<String>();
	
	//Constructors
	
	
	public Report() {}

	public Report(char tipo, Usuario encargado, String fecha, ArrayList<String> data) {
		super();
		this.id ++;
		this.tipo = tipo;
		this.encargado = encargado;
		this.fecha = fecha;
		this.data = data;
	}
	
}
