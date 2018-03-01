import java.util.ArrayList;
import java.util.Iterator;

public class TorresdeHanoi {
	
	public int discos;
	public int a,b,c;
	public ArrayList<Integer> origen = new ArrayList<Integer>();
	public ArrayList<Integer> destino = new ArrayList<Integer>();
	static long contador = 0;

	
	//Constructor
	public TorresdeHanoi(int d, int a, int b, int c) {
		this.discos = d;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	
	//Solve
	
	public void Hanoi(int  discos) {
		Hanoi(discos,1,2,3);
		printMovimientos();
	}

	public void Hanoi(int discos, Integer a, Integer b, Integer c) {
		contador += 1;
		
		if (discos == 1) {			
			origen.add(a);
			destino.add(c);
		} else {
			Hanoi(discos-1, a, c, b);
			origen.add(a);
			destino.add(c);
			Hanoi(discos-1, b, a, c);
		}
	}
	
	
	//Print
	public void printMovimientos() {
		Iterator<Integer> IT = origen.iterator();
		Iterator<Integer> IT2 = destino.iterator();
		
		while(IT.hasNext() && IT2.hasNext()){
			Integer origen = IT.next();
			Integer destino = IT2.next();
			System.out.print(origen + " " + destino);
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
	
		TorresdeHanoi prueba = new TorresdeHanoi(3, 1,2,3);		
		prueba.Hanoi(3);
		
		//System.out.println("Pasos totales = " + contador);
		
	}
}