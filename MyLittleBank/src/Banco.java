
public class Banco {
	public String nombre;
	private Gerente[] gerentes;
	private Usuario[] clientes;
	private ATM[] atms;
	private Cajero[] cajeros;
	private Cuenta[] cuentas;
	

	public Banco(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//Get - set
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Gerente[] getGerentes() {
		return gerentes;
	}

	public void setGerentes(Gerente[] gerentes) {
		this.gerentes = gerentes;
	}

	public Usuario[] getClientes() {
		return clientes;
	}

	public void setClientes(Usuario[] clientes) {
		this.clientes = clientes;
	}

	public ATM[] getAtms() {
		return atms;
	}

	public void setAtms(ATM[] atms) {
		this.atms = atms;
	}

	public Cajero[] getCajeros() {
		return cajeros;
	}

	public void setCajeros(Cajero[] cajeros) {
		this.cajeros = cajeros;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

	
	//CRUD GERENTE
	public void CrearGerente(int id, String nombre, int tel, String oficina, String email) {
		//nuevo objeto gerente:
		Gerente g = new Gerente(id, nombre, tel, oficina, email);
		
		if(gerentes==null) {
			System.out.println("gerentes[0]==null");
			gerentes = new Gerente[1];
		}else {
			
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}
