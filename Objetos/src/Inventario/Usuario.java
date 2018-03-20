package Inventario;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public abstract class Usuario {
	
	
	protected String user;
	protected String password;
	protected String nombre;
	protected String id;
	protected String signature;
	protected SistemaInventario sys;

	
	public Usuario(String user, String password, String nombre, String id, String signature, SistemaInventario sys) {
		super();
		this.user = user;
		this.password = password;
		this.nombre = nombre;
		this.id = id;
		this.signature = signature;
		this.sys = sys;
	}

	public void ReportarHardware(ArrayList<String> data) throws EPermisos {
		Date current = new Date();
		String d = current.toString();
		Report r = new Report('h', this, d, data);
		sys.writeDB(r);
	}
	
	public void ReportarSoftware(ArrayList<String> data) throws EPermisos{
		Date current = new Date();
		String d = current.toString();
		Report r = new Report('s', this, d, data);
		sys.writeDB(r);
	}
	
	public void ExportPDF(Report r) {
		//Crea el fichero y lo guarda con la información respectiva
	}
	
	public void ExportPDF(int id) {
		Report r = sys.ReadDB(id);
		//Crea el fichero y lu guarda con la info. respectiva 
	}
	
	public void ExportXLS(Report r) {
		//Crea el fichero y lo guarda con la información respectiva
	}
	
	public void ExportXLS(int id) {
		Report r = sys.ReadDB(id);
		//Crea el fichero y lu guarda con la info. respectiva 
	}
}
