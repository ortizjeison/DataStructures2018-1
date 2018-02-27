import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TorresdeHanoi {
	
	//public int discos;
	public char a,b,c;
	public Queue<Movimiento> movimientos = new LinkedList<>();
	static long contador = 0;
	public ArrayList<Disco> discos = new ArrayList<Disco>();
	public int current = 0;
	
	//Constructor
	public TorresdeHanoi(char a, char b, char c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}

	public void addDisco(Disco d) {
		discos.add(d);
		current = discos.lastIndexOf(d);
		System.out.println("current = " + current);
	}
	//Solve
	
	
	public void solve() {
		solveR(current, a, b, c);
	}
	
	public void solveR(int current, char a, char b, char c) {
		contador += 1;
		
		Movimiento m = new Movimiento(discos.get(current).getColor(), a, c);
		
		if (current == 0) {
			discos.get(0).setPosicion(c);
			movimientos.add(m);	
		} else {
			solveR(current-1, a, c, b);
			movimientos.add(m);
			discos.get(current-1).setPosicion(c);
			solveR(current-1, b, a, c);
			discos.get(current-1).setPosicion(c);
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

		//long time_start = System.currentTimeMillis();
		//long time_final = System.currentTimeMillis();
		//System.out.println(time_final - time_start);
		
		
		TorresdeHanoi prueba = new TorresdeHanoi('a','b','c');
		
		//Creación de discos:		
		Disco d1 = new Disco("crema");
		Disco d2 = new Disco("rosa");
		Disco d3 = new Disco("morado");
				
		prueba.addDisco(d1);
		prueba.addDisco(d2);
		prueba.addDisco(d3);
		
		
		prueba.solve();
		
		System.out.println("Pasos totales = " + contador);
		prueba.printMovimientos();
		
	}
}