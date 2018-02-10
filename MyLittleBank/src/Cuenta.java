import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public abstract class Cuenta {
	protected int num;
	protected double saldo;
	protected int clienteID;
	protected double cuotaManejo;
	protected boolean activa;
	protected Date fechaCreacion;
	protected static int cuentasConsecutivo = 0;
	
	public static Date current = new Date();
	
	public Cuenta(double saldo, int clienteID, double cuotaManejo, boolean activa) {
		super();
		num = cuentasConsecutivo;
		cuentasConsecutivo ++;
		this.saldo = saldo;
		this.clienteID = clienteID;
		this.cuotaManejo = cuotaManejo;
		this.activa = activa;
		this.fechaCreacion = current;
	}
	
	public void deposito(double cantidad) throws ValorNegativo{
		if(cantidad < 0) {
			throw new ValorNegativo();
		}else{
			saldo += cantidad;
		}
	}
	
	
	public void retiro(double cantidad) throws MaxPermitido {
		if(cantidad > saldo) {
			throw new MaxPermitido();
		}else {
			saldo -= cantidad;
		}
	}
	

}
