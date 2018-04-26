package Estructuras;

import java.util.Comparator;
import java.util.PriorityQueue;


class Comp implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
	
}

public class Persona implements Comparator {
	
	private String nombre;
	private int edad;

	public enum sex {
		Femenino, Masculino;
	}

	private sex sexo;

	public Persona(String nombre, sex sexo, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}




	public Persona() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public sex getSexo() {
		return sexo;
	}

	public void setSexo(sex sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Edad: " + edad + ", Sexo: " + sexo;
	}


	@Override
	public int compare(Object p1, Object p2) {
		if (((Persona) p1).getNombre().compareTo(((Persona) p2).getNombre()) < 0) {
			return -1;
		} else if (((Persona) p1).getNombre().compareTo(((Persona) p2).getNombre()) == 0) {
			if (((Persona) p1).getEdad() < ((Persona) p2).getEdad()) {
				return -1;
			} else {
				return 1;
			}
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// List<Persona> personas = new ArrayList<Persona>();
		Comparator<String> comparador = new Persona();
		Comp CObject = new Comp();
		PriorityQueue<Persona> cola = new PriorityQueue(9, comparador);
		
		cola.add(new Persona("Angel", Persona.sex.Masculino, 24));
		cola.add(new Persona("Daniel", Persona.sex.Masculino, 34));
		cola.add(new Persona("Alberto", Persona.sex.Masculino, 14));
		cola.add(new Persona("Gonzalo", Persona.sex.Masculino, 20));
		cola.add(new Persona("Juan", Persona.sex.Masculino, 22));
		cola.add(new Persona("Juan", Persona.sex.Masculino, 12));
		cola.add(new Persona("Juana", Persona.sex.Femenino, 16));
		cola.add(new Persona("Diana", Persona.sex.Femenino, 12));
		cola.add(new Persona("Ana", Persona.sex.Femenino, 20));
		cola.add(new Persona("Sofia", Persona.sex.Femenino, 32));
		while (cola.size() != 0) {
			System.out.println(cola.poll());
		}

	}


}