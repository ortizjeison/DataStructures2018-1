import java.util.ArrayList;
import java.util.Iterator;

public class TorresdeHanoi {
	
	public int discos;
	public char a,b,c;
	public ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();
	static long contador = 0;

	
	//Constructor
	public TorresdeHanoi(int d, char a, char b, char c) {
		this.discos = d;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	
	//Solve
	public void solve(int discos, char a, char b, char c) {
		contador += 1;		
		Movimiento m = new Movimiento(discos, a, c);
		if (discos == 1) {			
			movimientos.add(m);			
		} else {
			solve(discos-1, a, c, b);
			movimientos.add(m);
			solve(discos-1, b, a, c);
		}
	}
	
	
	//Print
	public void printMovimientos() {
		Iterator<Movimiento> IT = movimientos.iterator();
		
		while(IT.hasNext()){
			Movimiento movimiento = IT.next();
			System.out.print(movimiento);
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {	
	
		TorresdeHanoi prueba = new TorresdeHanoi(3, 'a','b','c');		
		//long time_start = System.currentTimeMillis();
		
		prueba.solve(3, 'a', 'b','c');

		//long time_final = System.currentTimeMillis();
		//System.out.println(time_final - time_start);
		
		System.out.println("Pasos totales = " + contador);
		prueba.printMovimientos();
		
	}
}