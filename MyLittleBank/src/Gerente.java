import java.util.Arrays;

public class Gerente extends Empleado {


	public Gerente(int id, String nombre, int telefono, String oficina, String email) {
		super(id, nombre, telefono, oficina, email);
	}
	
	
	
	public boolean idUnica(int id, Empleado[] e) throws EmptyMemory, DuplicatedID{
		
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
	
	public boolean idUnica(int id, Usuario[] e) throws EmptyMemory, DuplicatedID{
		
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
	
	//CRUD CAJERO
	
	public void CrearCajero(Cajero[] c, int id, String nombre, int tel, String oficina, String email) throws DuplicatedID, EmptyMemory, UserNotFound {
		Cajero c1 = new Cajero(id, nombre, telefono, oficina, email);
		
		if(idUnica(id,c)==true) {
			if(c==null) {
				System.out.println("gerentes[0]!=null");
				c = new Cajero[1];
			}else {
				c = Arrays.copyOf(c, c.length +1);
			}
				c[c.length -1] = c1;
		}
	}
	
	
	public void eliminarCajero(int id, Empleado a[]) throws EmptyMemory, UserNotFound {
		if(a!=null) {
			int i = 0;
			boolean found = false;
			while(i<a.length && found == false) {
				if(a[i].getId() == id) {
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
	
	//CRUD USUARIOS
	
	public void CrearUsuario(Usuario[] c, int id, String nombre, int tel, int cel, String email) throws EmptyMemory, DuplicatedID {
		Usuario c1 = new Usuario(id, nombre, tel, cel, email);
		
		if(idUnica(id,c)==true) {
			if(c==null) {
				System.out.println("gerentes[0]!=null");
				c = new Usuario[1];
			}else {
				c = Arrays.copyOf(c, c.length +1);
			}
				c[c.length -1] = c1;
		}
	}
	
	public void eliminarUsuario(int id, Usuario a[]) throws EmptyMemory, UserNotFound {
		if(a!=null) {
			int i = 0;
			boolean found = false;
			while(i<a.length && found == false) {
				if(a[i].getId() == id) {
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
