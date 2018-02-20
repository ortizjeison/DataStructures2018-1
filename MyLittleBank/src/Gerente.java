import java.util.Arrays;

public class Gerente extends Empleado {

	
	public Gerente(Banco b, int id, String nombre, int telefono, String oficina, String email) {
		super(b, id, nombre, telefono, oficina, email);
	}
		
	//CRUD CAJERO
	
	public void crearCajero(int id, String nombre, int tel, String oficina, String email) throws DuplicatedID, EmptyMemory {
		
		Cajero c1 = new Cajero(b,id, nombre, tel, oficina, email);
		
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
	
	public int buscarCajero(int id) throws EmptyMemory, UserNotFound {
		int index = -1;
		if(b.cajeros!=null) {
			int i = 0;
			boolean found = false;

			while(i<b.cajeros.length && found == false) {
				if(b.cajeros[i]!=null && b.cajeros[i].getId() == id) {
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
	
	
	public void eliminarCajero(int id) throws EmptyMemory, UserNotFound {
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
	
	public void eliminarUsuario(int id) throws EmptyMemory, UserNotFound {
		if(b.usuarios!=null) {
			int i = 0;
			boolean found = false;
			while(i<b.usuarios.length && found == false) {
				if(b.usuarios[i].getId() == id) {
					b.usuarios[i] = null;
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
	
	//*************
	
	//CRUD ATMS
	public void crearATM (String ubicacion, long saldo, double retiroMax,boolean disponible){
		int ID = ATM.currentID;
		ATM atm = new ATM(ID, ubicacion,saldo,retiroMax,b);
		if(b.atms==null) {
			b.atms = new ATM[1];
			b.atms[b.atms.length -1] = atm;	
		}else {
			b.atms = Arrays.copyOf(b.atms, b.atms.length +1);
			b.atms[b.atms.length -1] = atm;
		}
		ATM.setcurrentID(1);
	}
	
	public int buscarATM(int id) throws EmptyMemory, UserNotFound {
		int index = -1;
		if(b.atms!=null) {
			int i = 0;
			boolean found = false;

			while(i<b.atms.length && found == false) {
				if(b.atms[i]!=null && b.atms[i].getID() == id) {
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
	
	public void eliminarATM(int id) throws EmptyMemory, UserNotFound {
		if(b.atms!=null) {
			int i = 0;
			boolean found = false;
			while(i<b.atms.length && found == false) {
				if(b.atms[i].getID() == id) {
					b.atms[i] = null;
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
		
	//CRUD CUENTAS
	
	public int buscarCuentai(int clienteID, int cuentaNum) throws EmptyMemory, UserNotFound {
		int indexU = buscarUsuario(clienteID);
		int answer = -1;
		boolean found = false;
		
		if(indexU==-1) {
			throw new UserNotFound();
		}else {
		
			if(b.usuarios[indexU].cuentas!=null) {
				int i = 0;
	
				while(i<b.usuarios[indexU].cuentas.length && found == false) {
					if(b.usuarios[indexU].cuentas[i].getNum() == cuentaNum) {
						found = true;
						answer=i;
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
	
	public void eliminarCuenta(int userID, int numCuenta) throws EmptyMemory, UserNotFound {
		Cuenta c = buscarCuenta(userID, numCuenta);
		c.getClienteID();
		b.usuarios[buscarUsuario(userID)].cuentas[buscarCuentai(userID, numCuenta)] = null;
	}
	
}
