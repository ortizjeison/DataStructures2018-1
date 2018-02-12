import java.util.Arrays;

public abstract class Empleado {
	protected int id;
	protected String nombre;
	protected int telefono;
	protected String oficina;
	protected String email;
	protected Banco b;
	
	
	//COnstructor
	public Empleado(Banco b, int id, String nombre, int telefono, String oficina, String email) {
		super();
		this.b = b;
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.oficina = oficina;
		this.email = email;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getOficina() {
		return oficina;
	}
	
	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public static boolean idUnica(int id, Empleado[] e) throws DuplicatedID, EmptyMemory{
		
		boolean found = true;
		if(e!=null) {
			int i = 0;
			while(i<e.length && found == true) {				
				if(e[i].getId() == id) {
					found = false;
				}
				i++;
			}
			if(found==false) {
				throw new DuplicatedID();
			}
		}else {
			throw new EmptyMemory();
		}
		return found;
	}
	
	public static boolean idUnica(int id, Usuario[] e) throws EmptyMemory, DuplicatedID{
		
		boolean found = true;
		if(e!=null) {
			int i = 0;

			while(i<e.length && found == true) {
				if(e[i].getId() == id) {
					found = false;
				}
				i++;
			}
			if(found==false) {
				throw new DuplicatedID();
			}
		}else {
			throw new EmptyMemory();
		}
		return found;
	}
	
	//CRUD USUARIO

	public void crearUsuario(Banco b, int id, String nombre, int tel, int cel, String email) throws EmptyMemory, DuplicatedID {
		Usuario c1 = new Usuario(id, nombre, tel, cel, email);
		
		if(b.clientes==null) {
			b.clientes = new Usuario[1];
			b.clientes[b.clientes.length -1] = c1;
		}else if(Empleado.idUnica(id,b.clientes)==true) {			
			b.clientes = Arrays.copyOf(b.clientes, b.clientes.length +1);
			b.clientes[b.clientes.length -1] = c1;
		}else {
			throw new DuplicatedID();
			}
	}
		
	
	
	//*************

	public void crearCuenta(boolean tipo, int clienteID, double saldo) {
		//Recibir idCliente > buscarlo >crearle la cuenta
	}
	
	public Usuario buscarUsuario(int id) {
		return null;
	}
	
	public Usuario buscarUsuario(int id, String nombre) {
		return null;
	}



}
