
public class Exceptions {

}

class UserNotFound extends Exception{
	static String mensaje = "No existe el objeto";
	public UserNotFound() {
		super(mensaje);
	}
	@Override
	public void printStackTrace() {
		System.out.println(mensaje);
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

class ImposibleConsignar extends Exception{
	public ImposibleConsignar() {
		super("revise los parámetros");
	}
}