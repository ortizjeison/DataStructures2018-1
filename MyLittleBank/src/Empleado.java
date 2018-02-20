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
			while(i<e.length && e[i]!=null && found == true) {
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

			while(e[i]!=null && found == true && i<e.length) {
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

	public void crearUsuario(int id, String nombre, int tel, int cel, String email) throws EmptyMemory, DuplicatedID {
		Usuario c1 = new Usuario(id, nombre, tel, cel, email);
		
		if(b.usuarios==null) {
			b.usuarios = new Usuario[1];
			b.usuarios[b.usuarios.length -1] = c1;
		}else if(Empleado.idUnica(id,b.usuarios)==true) {			
			b.usuarios = Arrays.copyOf(b.usuarios, b.usuarios.length +1);
			b.usuarios[b.usuarios.length -1] = c1;
		}else {
			throw new DuplicatedID();
			}
	}
	
	public int buscarUsuario(int id) throws EmptyMemory, UserNotFound {
		int index = -1;
		if(b.usuarios!=null) {
			int i = 0;
			boolean found = false;

			while(i<b.usuarios.length && found == false) {
				if(b.usuarios[i]!=null && b.usuarios[i].getId() == id) {
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
	
	
	
	//*************
	//CRUD CUENTAS

	public void crearCuenta(boolean ahorros, int clienteID, double saldo, boolean activa) throws EmptyMemory, UserNotFound {
		if(ahorros==true) {
			Ahorros a = new Ahorros(saldo, clienteID, saldo, activa);
			
			int index = buscarUsuario(clienteID);
			if(index!=-1) {
				//Agregar la cuenta al arreglo de cuentas del user
				if(b.usuarios[index].cuentas==null) {
					b.usuarios[index].cuentas = new Cuenta[1];
					b.usuarios[index].cuentas[b.usuarios[index].cuentas.length -1] = a;
				}else {
					b.usuarios[index].cuentas = Arrays.copyOf(b.usuarios[index].cuentas, b.usuarios[index].cuentas.length +1);
					b.usuarios[index].cuentas[b.usuarios[index].cuentas.length -1] = a;
				}
			}			
		}else {
			Corriente a = new Corriente(saldo, clienteID, saldo, activa);
			int index = buscarUsuario(clienteID);
			if(index!=-1) {
				//Agregar la cuenta al arreglo de cuentas del user
				if(b.usuarios[index].cuentas==null) {
					b.usuarios[index].cuentas = new Cuenta[1];
					b.usuarios[index].cuentas[b.usuarios[index].cuentas.length -1] = a;
				}else {
					b.usuarios[index].cuentas = Arrays.copyOf(b.usuarios[index].cuentas, b.usuarios[index].cuentas.length +1);
					b.usuarios[index].cuentas[b.usuarios[index].cuentas.length -1] = a;
				}
			}
		}
	}
	
	
	public void eliminarCuenta(int clienteID, int cuentaNum) throws EmptyMemory, UserNotFound {
		
		int indexU = buscarUsuario(clienteID);
		
		if(indexU==-1) {
			throw new UserNotFound();
		}else {
			if(b.usuarios[indexU].cuentas!=null) {
				int i = 0;
				boolean found = false;
				while(i<b.usuarios[indexU].cuentas.length && found == false) {
					if(b.usuarios[indexU].cuentas[i].getNum() == cuentaNum) {
						b.usuarios[indexU].cuentas[i] = null;
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
	}


	public Cuenta buscarCuenta(int clienteID, int cuentaNum) throws EmptyMemory, UserNotFound {
		int indexU = buscarUsuario(clienteID);
		Cuenta answer = null;
		boolean found = false;
		
		if(indexU==-1) {
			throw new UserNotFound();
		}else {
		
			if(b.usuarios[indexU].cuentas!=null) {
				int i = 0;
	
				while(i<b.usuarios[indexU].cuentas.length && found == false) {
					if(b.usuarios[indexU].cuentas[i].getNum() == cuentaNum) {
						found = true;
						answer=b.usuarios[indexU].cuentas[i];
					}
					i++;
				}
				if(found == false) {
					throw new UserNotFound();
				}					
			}else {
				throw new EmptyMemory();
			}
			if(indexU==-1) {
				throw new UserNotFound();
			}else {
				return answer;
			}
		}
	}
	
	public void consignacion(int clienteID, int numCuenta, String nombreTitular, double cantidad) throws EmptyMemory, UserNotFound, ValorNegativo, ImposibleConsignar {
		//Validar cuenta
		Cuenta destino = buscarCuenta(clienteID, numCuenta);
		Usuario u = b.usuarios[buscarUsuario(clienteID)];
		
		if(destino!=null && u.getNombre()==nombreTitular) {
			if(cantidad <=0) {
				throw new ValorNegativo();
			}else {
				destino.saldo += cantidad;
			}
		}else {
			throw new ImposibleConsignar();
		}
	}
}
