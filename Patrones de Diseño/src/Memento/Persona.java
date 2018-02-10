package Memento;

public class Persona {
	private Caretaker care;
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		care = new Caretaker();
	}
	public Persona clonar(Persona p) {
		Persona newP = new Persona(this.getNombre(), this.getEdad());
		return newP;
	}
	public Memento SaveToMemento() {
		return new Memento(clonar(this));
	}
	
	public void restoreFromMemento(Memento m) {
		Persona pastPerson = m.getSavedState();
		nombre = pastPerson.getNombre();
		edad = pastPerson.getEdad();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int n) {
		edad = n;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	public static void main(String[] args) {
		
		
		Persona p = new Persona("z",0);
		p.care.addMemento(p.SaveToMemento());
		p.setNombre("a");
		p.setEdad(10);
		p.care.addMemento(p.SaveToMemento());
		p.setNombre("b");
		p.setEdad(9);
		p.care.addMemento(p.SaveToMemento());
		p.setNombre("c");
		p.setEdad(11);
		p.care.addMemento(p.SaveToMemento());
		
		Memento m1= p.care.getMemento(3);
		System.out.println(m1);
	}

}
