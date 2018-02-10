
public abstract class Empleado {
	protected int id;
	protected String nombre;
	protected int telefono;
	protected String oficina;
	protected String email;
	
	
	
	public Empleado(int id, String nombre, int telefono, String oficina, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.oficina = oficina;
		this.email = email;
	}

	public void crearCuenta(boolean tipo, int clienteID, double saldo) {
		
	}
	
	public Usuario buscarUsuario(int id) {
		return null;
	}
	
	public Usuario buscarUsuario(int id, String nombre) {
		return null;
	}
}
