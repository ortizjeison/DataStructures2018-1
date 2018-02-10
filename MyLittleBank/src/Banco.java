
public class Banco {
	public String nombre;
	private Gerente[] gerentes;
	private Usuario[] clientes;
	private ATM[] atms;
	private Cajero[] cajeros;
	private Cuenta[] cuentas;
	
	public Banco(String nombre, ATM[] atms) {
		super();
		this.nombre = nombre;
		this.atms = atms;
	}
	
	public void newGerente(String id, String nombre, int tel, String oficina, String email) {
		//nuevo objeto gerente:
		Gerente g = new Gerente(id, nombre, tel, oficina, email);
		
		if(gerentes[0]==null) {
			
		}
	}


	public static void main(String[] args) {
		
	}
}
