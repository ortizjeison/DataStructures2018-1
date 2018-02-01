
public class Production {
	
	private static enum dias {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES};
	private int [][] production = new int[5][10];	
	
	public Production(int [][]m) {
		this.production = m;
	}
	
	public int pnWeek() {
		int sum = 0;
		for(int i=0;i<production.length;i++) {
			for(int j=0;j<production[i].length;j++) {
				sum += production[i][j];
			}
		}
		return sum;
	}
	
	public int pnDay(String Day) {
		Day = Day.toUpperCase();
		int sum = 0;
		int indice = dias.valueOf(Day).ordinal();
		for(int k=0;k<production.length;k++) {
			sum += production[k][indice];
		}
		return sum;
	}
	
	public int pnProduct(int i) {
		int sum = 0;
		for(int k=0;k<production[i].length;k++) {
			sum += production[i][k];
		}
		return sum;
	}
	
	public static void main (String args[]) {
		int [][] produccion = {
		{1,2,3,4,5},
		{1,2,3,4,5},
		{1,2,3,4,5},
		{1,2,3,4,5},
		{1,2,3,4,5},
		{1,2,3,4,5},
		{1,2,3,4,5},
		{1,2,3,4,5},
		{1,2,3,4,5},
		{1,2,3,4,5},
		};
		
		Production p1 = new Production(produccion);
		
		System.out.println(p1.pnWeek());
		System.out.println(p1.pnDay("viernes"));
		System.out.println(p1.pnProduct(0));
	}	
}
