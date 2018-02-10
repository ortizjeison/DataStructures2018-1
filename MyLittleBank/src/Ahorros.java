
public class Ahorros extends Cuenta{
	public double interes;
	
	public Ahorros(int interes) {
		super();
		this.interes = interes;
	}

	public void aplicarInteres() {
		this.saldo = saldo * interes;
	}
}
