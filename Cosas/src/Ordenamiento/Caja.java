package Ordenamiento;

public class Caja <T>{
	private T[] objetos;
	
	public Caja(T[] objetos) {
		this.objetos = objetos; 
	}

	public T[] getObjetos() {
		return objetos;
	}

	public void setObjetos(T[] objetos) {
		this.objetos = objetos;
	}
	
	public void print() {
		for(int i=0;i<objetos.length;i++) {
			System.out.println(objetos[i]);
		}
		
	}
	
	public static void main(String[] args) {
		//Personas
		Persona p1 = new Persona("Marcela",24);
		Persona p2 = new Persona("Oscar",21);
		Persona p3 = new Persona("Marcela",20);
		Persona p4 = new Persona("Andrés", 26);
		Persona p5 = new Persona("Oscar", 30);
		Persona p6 = new Persona("Nadia",21);
		
		Persona [] listaP = {p1,p2,p3,p4,p5,p6};
		
		Caja<Persona> cp = new Caja<Persona>(listaP);
		cp.print();
	}
}
