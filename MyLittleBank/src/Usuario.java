
public class Usuario {
	private String cc;
	private String nombre;
	private int tel;
	private int cel;
	private String email;
	private Prestamo [] prestamos;
	
	//Constructor
	public Usuario(String cc, String nombre, int tel, int cel, String email) {
		super();
		this.cc = cc;
		this.nombre = nombre;
		this.tel = tel;
		this.cel = cel;
		this.email = email;
	}

	public String getCC() {
		return cc;
	}

	public void setId(String cc) {
		this.cc = cc;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getCel() {
		return cel;
	}
	public void setCel(int cel) {
		this.cel = cel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPrestamos(Prestamo[] prestamos) {
		this.prestamos = prestamos;
	}
	
	
	
	
}
