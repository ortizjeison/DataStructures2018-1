import java.util.Date;

public class Corriente extends Cuenta{

	public Corriente(double saldo, int clienteID, double cuotaManejo, boolean activa) {
		super(saldo, clienteID, cuotaManejo, activa);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Corriente c = new Corriente(10000, 11, 1.2, true);
	}

}
