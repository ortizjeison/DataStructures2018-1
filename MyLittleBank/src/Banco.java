import java.util.Arrays;

public class Banco {
	public String nombre;
	public Gerente[] gerentes;
	public Usuario[] clientes;
	public ATM[] atms;
	public Cajero[] cajeros;
	
	

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
	
	//CRUD GERENTE
	
	public void CrearGerente(int id, String nombre, int tel, String oficina, String email) throws DuplicatedID, EmptyMemory {
		
		Gerente g = new Gerente(this, id, nombre, tel, oficina, email);
		
		if(gerentes==null) {
			gerentes = new Gerente[1];
			gerentes[gerentes.length -1] = g;
		}else if(Empleado.idUnica(id,gerentes)==true) {			
			gerentes = Arrays.copyOf(gerentes, gerentes.length +1);
			gerentes[gerentes.length -1] = g;
		}else {
			throw new DuplicatedID();
			}
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
	
	
	public static void main(String[] args) throws DuplicatedID, EmptyMemory, UserNotFound {
		Banco b = new Banco("my little bank");
		b.CrearGerente(2345, "Main Manager", 12312312, "340b", "main@manager.com");
		b.CrearGerente(23456, "Main Manager", 12312312, "340b", "main@manager.com");
//		System.out.println(b.gerentes[0].getId());
//		System.out.println(b.gerentes[1].getId());

		
		b.gerentes[0].crearCajero(123, "", 234, "", "");
		b.gerentes[0].crearCajero(1234, "", 234, "", "");
		System.out.println("hola" + b.cajeros[0].getId());
		b.gerentes[0].eliminarCajero(123);
		//System.out.println(b.cajeros[1].getId());
		b.cajeros[1].crearUsuario(b, 1, "", 12, 12, "");
		b.cajeros[1].crearUsuario(b, 2, "", 12, 12, "");
		
		b.eliminarGerente(2345);


	}
}
