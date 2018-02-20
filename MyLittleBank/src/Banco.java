import java.util.Arrays;

public class Banco {
	public String nombre;
	public Gerente[] gerentes;
	public Usuario[] usuarios;
	public ATM[] atms;
	public Cajero[] cajeros;
	
	

	public Banco(String nombre) {
		super();
		this.nombre = nombre;		
	}
	
	public boolean idUnica(int id) throws DuplicatedID, EmptyMemory{
		boolean found = true;
		if(gerentes!=null) {
			int i = 0;			
			while(i<gerentes.length && found == true && gerentes[i]!=null) {
				if(gerentes[i].getId() == id) {
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

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario[] clientes) {
		this.usuarios = clientes;
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
	
	public void crearGerente(int id, String nombre, int tel, String oficina, String email) throws DuplicatedID, EmptyMemory {
		
		Gerente g = new Gerente(this, id, nombre, tel, oficina, email);
		
		if(gerentes==null) {
			gerentes = new Gerente[1];
			gerentes[gerentes.length -1] = g;
		}else if(idUnica(id)==true) {			
			gerentes = Arrays.copyOf(gerentes, gerentes.length +1);
			gerentes[gerentes.length -1] = g;
		}else {
			throw new DuplicatedID();
			}
	}
	
	public int buscarGerente(int id) throws EmptyMemory, UserNotFound {
		int index = -1;
		if(gerentes!=null) {
			int i = 0;
			boolean found = false;

			while(i<gerentes.length && found == false) {
				if(gerentes[i]!=null && gerentes[i].getId() == id) {
					found = true;
					index = i;
				}
				i++;
			}
			if(found == false) {
				throw new UserNotFound();
			}
		}else {
			throw new EmptyMemory();
		}
		return index;
	}
	
	public void eliminarGerente(int id) throws EmptyMemory, UserNotFound {
		if(gerentes!=null) {
			int i = 0;
			boolean found = false;
			while(i<gerentes.length && found == false) {
				if(gerentes[i]!=null && gerentes[i].getId() == id) {
					found = true;
					gerentes[i] = null;
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
	
	
	public static void main(String[] args) throws DuplicatedID, EmptyMemory, UserNotFound, ValorNegativo, ImposibleConsignar, MaxPermitido {
		Banco b = new Banco("my little bank");
		
		b.crearGerente(1, "Main Manager1", 12312312, "340b", "main@manager.com");
		b.crearGerente(2, "Main Manager", 12312312, "340b", "main2@manager.com");
		
		Gerente g1 = b.gerentes[0];
		
		g1.crearCajero(1, "", 21, "", "");
		
		g1.eliminarCajero(1);
		g1.crearUsuario(1, "Juan", 123, 23, "");
		
		
		//System.out.println(g1.buscarUsuario(1));
		
		g1.crearCajero(1, "", 22, "", "");
		
		Cajero c1 = b.cajeros[1];
		//g1.eliminarUsuario(1);
		//System.out.println(c1.buscarUsuario(1));

		g1.crearATM("Universidad EIA", 0, 0, true);
		
		
		g1.crearCuenta(true, 1, 1000,true);
		
		System.out.println(b.usuarios[0].cuentas[0].getSaldo());
		
		c1.consignacion(1, 0, "Juan", 1000);
		
		System.out.println(b.usuarios[0].cuentas[0].getSaldo());
		
		b.atms[0].retiro(1, 0, 1000);
		
	}
}
