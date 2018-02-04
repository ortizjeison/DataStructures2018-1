
public class Tractor {
	public String color, size;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
		
	public Tractor(String color, String size) {
		super();
		this.color = color;
		this.size = size;
	}

	public static void main(String[] args) {
		Tractor tractor = new Tractor("yellow", "mini");
		Tractor tractor2 = new Tractor("Red","large");
		
		System.out.println("El tractor es "+tractor.color);
		
	}
}
