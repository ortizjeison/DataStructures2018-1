package arboles2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Arbol <E extends Comparable>{
	protected Nodo<E> raiz;
		
	//Constructor
	public Arbol(Nodo<E> raiz){
		this.raiz = raiz;
	}
	
	public Nodo<E> getRaiz(){
		return raiz;
	}
	
	public void setRaiz(Nodo<E> raiz){
		this.raiz = raiz;
	}
	
	//Preorden
	public void preorden(){
		preorden(raiz);
		System.out.println();
	}
		
	public void preorden(Nodo <E> nodo){
		if(!(nodo==null)){
			System.out.println(nodo);
			preorden(nodo.getHijoI());
			preorden(nodo.getHijoD());
		}
	}
	
	///
	
	public ArrayList<E> preorden2(){
		ArrayList<E> list = new ArrayList<E>();
		preorden2(raiz,list);
		System.out.println();
		System.out.println(list.toString());
		return list;
	}
		
	public void preorden2(Nodo <E> nodo, ArrayList<E> l){
		if(!(nodo==null)){
			//System.out.println(nodo + " añadido");
			l.add(nodo.getllave());
			preorden(nodo.getHijoI());
			preorden(nodo.getHijoD());
		}
	}
	
	
	
	
	
	//Posorden IZ-DER-RAIZ
	
	public void posorden(){
		posorden(raiz);
		System.out.println();
	}

	public void posorden(Nodo<E> nodo){
		if(!(nodo==null)){
			posorden(nodo.getHijoI());
			posorden(nodo.getHijoD());	
			System.out.println(nodo);
		}
	}
	
	//Inorden

	public void inorden(){
		inorden(raiz);
		System.out.println();
	}
	
	public void inorden(Nodo<E> nodo){
		if(nodo!=null){
			inorden(nodo.getHijoI());
			System.out.println(nodo);
			inorden(nodo.getHijoD());
		}
	}
	
	
	///TAREA
	public void amplitud(){
		Nodo a = raiz;
		Nodo aux;

		if (a != null){
			Queue<Nodo> cola= new LinkedList<Nodo>();
			Queue<Nodo> colaAux= new LinkedList<Nodo>();
			cola.add(a);
			while (!cola.isEmpty()){
				colaAux.add(aux=cola.poll());
				if (aux.getHijoI() != null){
					cola.add(aux.getHijoI());
				}
				if (aux.getHijoD()!= null){
					cola.add(aux.getHijoD());
				}
			}
			System.out.println(colaAux);
		}
	}
	
	public ArrayList convertirALista(String cadena) {
		String[] lala = cadena.split(",");
		ArrayList array = new ArrayList();
		for (int i = 0; i < lala.length; i++) {
			array.add(lala[i]);
		}
		return array;
	}
	
	public Nodo<E> armarArbol(String preorden, String inorden) {
		ArrayList<E> pre = convertirALista(preorden);
		ArrayList<E> ino = convertirALista(inorden);
		
		Nodo<E> lala = armarArbolR(pre, ino, 0, pre.size() - 1, 0, ino.size() - 1);
		return lala;

	}

	public Nodo<E> armarArbolR(ArrayList<E> preorden, ArrayList<E> inorden, int preordenInicio, int preordenFin,
			int inordenInicio, int inordenFin) {

		if (preordenInicio <= preordenFin || inordenInicio <= inordenFin) {

			// Raiz
			Nodo<E> raiz = new Nodo<E>(preorden.get(preordenInicio));

			// Buscar raiz en inorden
			int i = inordenInicio;
			while (i < inorden.size() && inorden.get(i).compareTo(raiz.getllave()) != 0) {
				i++;
			}

			// Asignación de hijos correspondientes
			raiz.setHijoI(armarArbolR(preorden, inorden, preordenInicio + 1, preordenInicio + (i - inordenInicio),
					inordenInicio, i - 1));
			raiz.setHijoD(armarArbolR(preorden, inorden, preordenInicio + (i - inordenInicio) + 1, inordenFin, i + 1,
					inordenFin));

			return raiz;

		} else {
			return null;
		}
	}

	

	
	
	public int cantidadHojas(){
		return cantidadHojas(raiz);
	}
	
	public int cantidadHojas(Nodo<E> nodo){
		if(nodo==null)
			return 0;
		if(nodo.getHijoD()==null && nodo.getHijoI()==null){
			return 1;
		}
		return cantidadHojas(nodo.getHijoD()) +cantidadHojas(nodo.getHijoI());
	}
	
	
	public boolean  ValidarABB(){
		return ValidarABB(raiz);
	}
		
	public boolean ValidarABB(Nodo <E> nodo){
		
		boolean answer = true;
				
		if(nodo!=null){
			if((nodo.getHijoI()!=null && nodo.getllave().compareTo(nodo.getHijoI().getllave())<0)
					|| nodo.getHijoD()!=null && nodo.getllave().compareTo(nodo.getHijoD().getllave())<0)
				answer= false;
			else
				ValidarABB(nodo.getHijoI());
				ValidarABB(nodo.getHijoD());
		}
		return answer;
	}
	
	
	
	public static void main(String[] args){
	
		Nodo<Integer> n1 = new Nodo<Integer>(1);
		Nodo<Integer> n2 = new Nodo<Integer>(2);
		Nodo<Integer> n3 = new Nodo<Integer>(3);
		Nodo<Integer> n4 = new Nodo<Integer>(4);
		Nodo<Integer> n5 = new Nodo<Integer>(5);
		Nodo<Integer> n6 = new Nodo<Integer>(6);

		
		n1.setHijoI(n2);
		n2.setHijoI(n5);
		n2.setHijoD(n4);
		n5.setHijoI(n6);

		
		Arbol<Integer> a=new Arbol<Integer>(n1);
		
		System.out.println("amplitud");
		a.amplitud();
		
//		Nodo[] in = {n1,n3,n5,n4,n6,n2};
//		Nodo[] pre ={n1,n5,n3,n2,n4,n6};

		
		System.out.println("Preorden");
		a.preorden();
		
		
		System.out.println("Preorden2");
		a.preorden2();
//		System.out.println("Posorden");
//		a.posorden();
//		System.out.println("Inorden");
//		a.inorden();
	}
	
	//Convertir arbol cualquiera a binario
	//Codigo de Huffman y c�mo se utilizar�a en �rboles binarios
	//Cuad-arbol
}

