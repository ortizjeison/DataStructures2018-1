import java.util.Arrays;

public abstract class Empleado {
	protected int id;
	protected String nombre;
	protected int telefono;
	protected String oficina;
	protected String email;
	
	
	//COnstructor
	public Empleado(int id, String nombre, int telefono, String oficina, String email) {
		super();
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


	
	//CRUD USUARIO
	public void CrearUsuario(Usuario[] a, int id, String nombre, int tel, int cel, String email) throws EmptyMemory, DuplicatedID{
		Usuario g = new Usuario(id, nombre, tel,cel, email);
		
		if(a==null) {
			System.out.println("usuarios[0]==null");
			a = new Usuario[1];
		}else {
			a = Arrays.copyOf(a, a.length +1);
		}
		a[a.length -1] = g;
	}
	

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
