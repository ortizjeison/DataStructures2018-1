
public class Disco {
	
	public String color;
	public int id;
	public char posicion;
	public static int k = 1;
	
	
	public Disco(String color, char p) {
		super();
		this.posicion = p;
		this.color = color;
		this.id = k++;
	}
	
	public Disco(String color) {
		super();
		this.posicion = 'a';
		this.color = color;
		this.id = k++;
	}

	public char getPosicion() {
		return posicion;
	}

	public void setPosicion(char posicion) {
		this.posicion = posicion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
