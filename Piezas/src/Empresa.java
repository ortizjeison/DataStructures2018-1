import java.util.Arrays;

public class Empresa {

	private String Nombre;
	private String Direccion;
	private Pieza[] ListaPiezas;
	private Clientes[] ListaClientes;

	private Clientes BuscarCliente(String clientes)throws Exception{
		int i=0;

		while (i < ListaClientes.length && ListaClientes[i].getCodigo().compareTo(clientes)!=0){
			i++;	
		}
		return null;
	}



	public Empresa(String nombre, String direccion) {
		super();
		Nombre = nombre;
		Direccion = direccion;
	}

	
	public void crearPiezaMetalica(String Codigo, String Descripcion, float PesoKg) {
		PiezaMetalica p = new PiezaMetalica(Codigo, Descripcion, PesoKg);
		if(ListaPiezas==null) {
			ListaPiezas = new Pieza[1];
			ListaPiezas[0] = p;
		}else {
			ListaPiezas = Arrays.copyOf(ListaPiezas, ListaPiezas.length+1);
		}
	}

	public void crearPiezaPlastica(String Codigo, String Descripcion, float PesoKg) {
		PiezaPlastica p = new PiezaPlastica(Codigo, Descripcion, PesoKg);
	}
	
	public static void main(String[] args) {
		Empresa e = new Empresa("Hola","Mundo");


	}

}
