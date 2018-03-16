package Inventario;

public class SistemaInventario {
	
	
	public Report ReadDB(int id) {
		//Busca en db por parámetro (por id, para ejemplificar), obviamente debería hacer un query si tuviera una db real
		Report r = new Report();
		return r;		
	
	}
	
	public void writeDB(Report r) {
		//Guarda el reporte en la db
	}
	
	
}

class EPermisos extends Exception{
	public EPermisos() {
		super("No cuenta con los permisos suficientes");
	}
	
}