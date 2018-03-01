import java.util.Arrays;

public class Clientes {

	public String Codigo;
	public String Nombre;
	public String Direccion;
	public String Correo;
	public String FormaPago;
	public Solicitud[] ListaSolicitudes;

	public Clientes(String Codigo, String Nombre, String Direccion, String Correo, String FormaPago, Solicitud[] ListaSolicitudes){
		super();
		this.Codigo = Codigo;
		this.Nombre = Nombre;
		this.Direccion = Direccion;
		this.Correo = Correo;
		this.FormaPago = FormaPago;
		this.ListaSolicitudes = ListaSolicitudes;

	}

	public Clientes(String Codigo, String Nombre, String Direccion, String Correo, String FormaPago){

		this.Codigo = Codigo;
		this.Nombre = Nombre;
		this.Direccion = Direccion;
		this.Correo = Correo;
		this.FormaPago = FormaPago;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getFormaPago() {
		return FormaPago;
	}

	public void setFormaPago(String formaPago) {
		FormaPago = formaPago;
	}

	public Solicitud[] getListaSolicitudes() {
		return ListaSolicitudes;
	}

	public void setListaSolicitudes(Solicitud[] listaSolicitudes) {
		ListaSolicitudes = listaSolicitudes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void CrearSolicitud(Solicitud s){
		if(ListaSolicitudes==null)
			ListaSolicitudes = new Solicitud[1];
		else
			ListaSolicitudes = Arrays.copyOf(ListaSolicitudes, ListaSolicitudes.length+1);
		ListaSolicitudes[ListaSolicitudes.length-1] = s;
	}

}
