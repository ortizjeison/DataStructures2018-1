
public class Movimiento {
	
	public String color;
	public char from;
	public char to;
	
	public Movimiento(String d, char f, char t) {
		color = d;
		from = f;
		to = t;
	}
	
	public String toString() {
		return "Mover disco " + color + " desde " + from + " hasta " + to ;
	}
}