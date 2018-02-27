
public class Movimiento {
	
	public Disco d;
	public char from;
	public char to;
	
	public Movimiento(Disco disco, char f, char t) {
		d = disco;
		from = f;
		to = t;
	}
	
	public String toString() {
		return "Mover disco " + d.getColor() + " desde " + from + " hasta " + to ;
	}
}