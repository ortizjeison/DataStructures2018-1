
public abstract class Cuenta {
	private String id;
	private long saldo;
	private String clienteID;
	private String numCuenta;
	private double cuotaManejo;
	
	//Objeto cliente o cliente id?? 
	
	
	public boolean deposito(double cantidad) {
		return true;
	}
	
	public boolean retiro(double cantidad) {
		return true;
	}
	
}
