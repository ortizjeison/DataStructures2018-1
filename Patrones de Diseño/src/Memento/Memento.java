package Memento;

public class Memento {
	
	private Persona person;
	
	public Memento(Persona person) {
		this.person = person;
	}
	
	public Persona getSavedState() {
		return person;
	}
	
	public String toString() {
		return person.getNombre() + " / "+ person.getEdad();
	}
}
