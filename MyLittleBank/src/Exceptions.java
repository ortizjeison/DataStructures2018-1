
public class Exceptions {

}

class UserNotFound extends Exception{
	public UserNotFound() {
		super("No se encontró el usuario");
	}
}

class EmptyMemory extends Exception{
	public EmptyMemory() {
		super("No hay registros disponibles");
	}
}

class DuplicatedID extends Exception{
	public DuplicatedID() {
		super("ID duplicado");
	}
}

class ValorNegativo extends Exception{
	public ValorNegativo() {
		super("Solo se pueden depositar cantidades positivas");
	}
}

class MaxPermitido extends Exception{
	public MaxPermitido() {
		super("No se puede retirar un monto mayor al disponible");
	}
}