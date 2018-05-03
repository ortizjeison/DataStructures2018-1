package arboles2;

import java.util.ArrayList;
import java.util.LinkedList;

public class nArio <E extends Comparable>{

	NodoN<E> raiz;
	LinkedList <NodoN<E>> hijos;
	
	
	 
	public nArio(NodoN<E> raiz, LinkedList<NodoN<E>> hijos) {
		super();
		this.raiz = raiz;
		this.hijos = hijos;
	}

	public nArio(NodoN<E> raiz) {
		this.raiz = raiz;
	}
	
	public void preorden(){
		preorden(raiz);
		System.out.println();
	}
		
	public void preorden(NodoN <E> nodo){
		if(!(nodo==null)){
			System.out.println(nodo);
			while(nodo.getNextHijo()!=null) {
				preorden(nodo.getNextHijo());
				System.out.println(nodo);
			}
		}
	}

	public static void main(String[] args) {
		

	} 

}
