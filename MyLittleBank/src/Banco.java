import java.util.Arrays;

public class Banco {
	public String nombre;
	protected Gerente[] gerentes;
	protected Usuario[] clientes;
	protected ATM[] atms;
	protected Cajero[] cajeros;
	
	

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

	
	//ID únicos
	
	
	//CRUD GERENTE
	public void CrearGerente(int id, String nombre, int tel, String oficina, String email) {
		Gerente g = new Gerente(id, nombre, tel, oficina, email);
		
		if(gerentes==null) {
			//System.out.println("gerentes[0]!=null");
			gerentes = new Gerente[1];
		}else {
			gerentes = Arrays.copyOf(gerentes, gerentes.length +1);
		}
		gerentes[gerentes.length -1] = g;
	}
	
	public void eliminarGerente(int id) throws EmptyMemory, UserNotFound {
		if(gerentes!=null) {
			int i = 0;
			boolean found = false;
			while(i<gerentes.length && found == false) {
				if(gerentes[i].getId() == id) {
					found = true;
				}
				i++;
			}
			if(found == false) {
				throw new UserNotFound();
			}
		}else {
			throw new EmptyMemory();
		}
	}
	
	
	public static void main(String[] args) {
		Banco b = new Banco("my little bank");
		b.CrearGerente(2345, "Main Manager", 12312312, "340b", "main@manager.com");
	}
}
