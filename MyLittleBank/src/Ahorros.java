import java.util.Date;

public class Ahorros extends Cuenta{
	public double interes;
	
	public Ahorros(double saldo, int clienteID, double cuotaManejo, boolean activa) {
		super(saldo, clienteID, cuotaManejo, activa);
	}

	public void aplicarInteres() {
		saldo = saldo * interes;
	}
}
