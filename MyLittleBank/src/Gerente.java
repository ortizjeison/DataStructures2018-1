import java.util.Arrays;

public class Gerente extends Empleado {


	public Gerente(int id, String nombre, int telefono, String oficina, String email) {
		super(id, nombre, telefono, oficina, email);
	}
	
		
	//CRUD CAJERO
	
	
	public void crearCajero(Banco b, int id, String nombre, int tel, String oficina, String email) throws DuplicatedID, EmptyMemory {
		
		Cajero c1 = new Cajero(id, nombre, tel, oficina, email);
		
		if(b.cajeros==null) {
			b.cajeros = new Cajero[1];
			b.cajeros[b.cajeros.length -1] = c1;
		}else if(Empleado.idUnica(id,b.cajeros)==true) {			
			b.cajeros = Arrays.copyOf(b.cajeros, b.cajeros.length +1);
			b.cajeros[b.cajeros.length -1] = c1;
		}else {
			throw new DuplicatedID();
			}
	}
	
	
	public void eliminarCajero(Banco b, int id) throws EmptyMemory, UserNotFound {
		if(b.cajeros!=null) {
			int i = 0;
			boolean found = false;
			while(i<b.cajeros.length && found == false) {
				if(b.cajeros[i].getId() == id) {
					found = true;
					b.cajeros[i]= null;
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
	
	//CRUD USUARIOS
	
	public void eliminarUsuario(int id, Banco b) throws EmptyMemory, UserNotFound {
		if(b.clientes!=null) {
			int i = 0;
			boolean found = false;
			while(i<b.clientes.length && found == false) {
				if(b.clientes[i].getId() == id) {
					b.clientes[i] = null;
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

//	public static void main(String[] args) {
//		Gerente g1 = new Gerente(1234, "Juan", 123123, "032", "hola@gerente.com");
//	}
	
}
