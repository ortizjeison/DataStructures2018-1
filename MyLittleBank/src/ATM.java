
public class ATM {
	
	public int id;
	public long saldo;
	public double retiroMax;
	public Banco b;
	public boolean disponible;
	
	
	public ATM(int id, long saldo, double retiroMax, Banco b, boolean disponible) {
		super();
		this.id = id;
		this.saldo = saldo;
		this.retiroMax = retiroMax;
		this.b = b;
		this.disponible = disponible;
	}


	
	public long getSaldo() {
		return saldo;
	}


	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	
	//*************
	public void retiro() {}
	
}
