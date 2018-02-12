
public class Usuario {
	protected int id;
	protected String nombre;
	protected int tel;
	protected int cel;
	protected String email;
	protected Prestamo [] prestamos;
	protected Cuenta[] cuentas;
	
	//Constructor
	public Usuario(int id, String nombre, int tel, int cel, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tel = tel;
		this.cel = cel;
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

	public Prestamo[] getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(Prestamo[] prestamos) {
		this.prestamos = prestamos;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}
	
	
}
