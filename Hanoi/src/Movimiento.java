
public class Movimiento {
	
	public int disco;
	public char from;
	public char to;
	
	public Movimiento(int d, char f, char t) {
		disco = d;
		from = f;
		to = t;
	}
	
	public String toString() {
		return "Mover disco " + disco + " desde " + from + " hasta " + to ;
	}
}
