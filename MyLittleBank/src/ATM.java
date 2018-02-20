
public class ATM {
	
	public int id;
	public String ubicacion;
	public long saldo;
	public double retiroMax;
	public Banco b;
	public boolean disponible;
	public static int currentID = 0;
	
	
	
	
	public ATM(int id, String ubicacion, long saldo, double retiroMax, Banco b) {
		this.id = id;
		this.ubicacion = ubicacion;
		this.saldo = saldo;
		this.retiroMax = retiroMax;
		this.b = b;
		this.disponible = true;
	}


	
	public long getSaldo() {
		return saldo;
	}
	
	public static void setcurrentID(int n) {
		currentID += n;
	}

	public int getID() {
		return id;
	}
	
	public void setSaldo(long saldo) {
		this.saldo = saldo;
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
	
	public int buscarCuenta(int clienteID, int cuentaNum) throws EmptyMemory, UserNotFound {
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
	
	//*************
	public void retiro(int clienteID, int cuentaNum, long cantidad) throws EmptyMemory, UserNotFound, MaxPermitido {
		Cuenta c = b.usuarios[buscarUsuario(clienteID)].cuentas[buscarCuenta(clienteID,cuentaNum)];
		//System.out.println("cliente: "+ b.usuarios[buscarUsuario(clienteID)].getNombre());
		//System.out.println("cuenta num = "+ b.usuarios[buscarUsuario(clienteID)].cuentas[buscarCuenta(clienteID,cuentaNum)].getNum());
		
		if(c.getSaldo()<cantidad && cantidad<=retiroMax) {
			throw new MaxPermitido();
		}else {
			c.saldo -= cantidad;
			System.out.println("Saldo después del retiro = "+c.saldo);
		}

	}
	
}
