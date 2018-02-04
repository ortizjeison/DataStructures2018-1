
public class GeneralObject {
	public boolean moves;
	public String color;
		
	public boolean getMoves() {
		return moves;
	}
	
	public void setMoves(boolean moves) {
		this.moves = moves;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public static void main(String[] args) {
		Alien a1 = new Alien();
		a1.setColor("Dark Green");
		System.out.println(a1.color);
	}

}

class Human extends GeneralObject{
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Human() {
		super();
	}
	
	
}

class Man extends Human{

	public Man() {
		super();
	}
	
}

class Woman extends Human{

	public Woman() {
		super();
	}
	
}

class Kart extends GeneralObject{
	
	public String manufacturer;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
}

class Alien extends GeneralObject{
	public String planet;

	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}
	
}


